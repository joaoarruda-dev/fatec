package com.fatec.e1_forms.repository;

import com.fatec.e1_forms.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Repository
public class FracaoRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public FracaoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Transactional
    public void updateFracaoFromConta(int contaId, int novoNumeradorA, int novoDenominadorA, int novoNumeradorB, int novoDenominadorB) {
        // SQL to update fracao A
        String updateFracaoASql = "UPDATE fracao SET numerador = ?, denominador = ? WHERE id = (SELECT valor_a FROM conta WHERE id = ?)";

        // SQL to update fracao B
        String updateFracaoBSql = "UPDATE fracao SET numerador = ?, denominador = ? WHERE id = (SELECT valor_b FROM conta WHERE id = ?)";

        // Update fracao A
        jdbcTemplate.update(updateFracaoASql, novoNumeradorA, novoDenominadorA, contaId);

        // Update fracao B
        jdbcTemplate.update(updateFracaoBSql, novoNumeradorB, novoDenominadorB, contaId);
    }

    @Transactional
    public void deleteContaAndFracao(int contaId) {
        // SQL to delete from fracao based on conta's foreign key
        String deleteFracaoSql = "DELETE FROM fracao WHERE id IN (SELECT valor_a FROM conta WHERE id = ?) OR id IN (SELECT valor_b FROM conta WHERE id = ?)";

        // SQL to delete from conta
        String deleteContaSql = "DELETE FROM conta WHERE id = ?";

        // Delete from conta
        jdbcTemplate.update(deleteContaSql, contaId);
        // Delete from fracao first
        jdbcTemplate.update(deleteFracaoSql, contaId, contaId);


    }

    public List<Conta> resgatarContas(){
        String sql = "select\n" +
                "    c.id as id,\n" +
                "    f1.numerador as f1Num,\n" +
                "    f1.denominador as f1Den,\n" +
                "    c.operacao,\n" +
                "    f2.numerador as f2Num,\n" +
                "    f2.denominador as f2Den\n" +
                "    from conta c\n" +
                "    join fracao f1 on c.valor_a = f1.id\n" +
                "    join fracao f2 on c.valor_b = f2.id;";
        return jdbcTemplate.query(sql, new ContaRowMapper());
    }

    public Conta resgatarContaPorId(int contaId){
        String sql = "select\n" +
                "    c.id as id,\n" +
                "    f1.numerador as f1Num,\n" +
                "    f1.denominador as f1Den,\n" +
                "    c.operacao,\n" +
                "    f2.numerador as f2Num,\n" +
                "    f2.denominador as f2Den\n" +
                "    from conta c\n" +
                "    join fracao f1 on c.valor_a = f1.id\n" +
                "    join fracao f2 on c.valor_b = f2.id\n" +
                "    where c.id = ?;";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{contaId}, new ContaRowMapper());
        } catch (EmptyResultDataAccessException e) {
            // Lidar com o caso em que nenhum resultado é encontrado
            return null; // Ou lançar uma exceção adequada, dependendo do requisito
        }
    }


    public int salvarConta(int fr1Id, int fr2Id, String operacao){

        String sql = "INSERT INTO conta (valor_a, valor_b, operacao) VALUES (?, ?, ?)";

        // Cria um KeyHolder para armazenar as chaves geradas pelo banco de dados
        KeyHolder keyHolder = new GeneratedKeyHolder();

        // Executa a operação de inserção, passando o KeyHolder como argumento adicional
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, fr1Id);
            ps.setInt(2, fr2Id);
            ps.setString(3, operacao);
            return ps;
        }, keyHolder);

        // Obtém o ID gerado automaticamente do KeyHolder
        Number id = keyHolder.getKey();

        if (id != null) {
            // Retorna o ID gerado automaticamente
            return id.intValue();
        } else {
            // Retorna um valor padrão ou lança uma exceção, dependendo do seu caso de uso
            return -1;
        }
    }


    public int salvarFracao(int numerador, int denominador) {
        String sql = "INSERT INTO fracao (numerador, denominador) VALUES (?, ?)";

        // Cria um KeyHolder para armazenar as chaves geradas pelo banco de dados
        KeyHolder keyHolder = new GeneratedKeyHolder();

        // Executa a operação de inserção, passando o KeyHolder como argumento adicional
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, numerador);
            ps.setInt(2, denominador);
            return ps;
        }, keyHolder);

        // Obtém o ID gerado automaticamente do KeyHolder
        Number id = keyHolder.getKey();

        if (id != null) {
            // Retorna o ID gerado automaticamente
            return id.intValue();
        } else {
            // Retorna um valor padrão ou lança uma exceção, dependendo do seu caso de uso
            return -1;
        }
    }


    private static class ContaRowMapper implements RowMapper<Conta> {
        @Override
        public Conta mapRow(ResultSet rs, int rowNum) throws SQLException {
            Conta conta = new Conta(rs.getInt("id"), rs.getInt("f1Num"), rs.getInt("f1Den"), rs.getString("operacao"),rs.getInt("f2Num"),rs.getInt("f2Den"));
            return conta;
        }
    }
}
