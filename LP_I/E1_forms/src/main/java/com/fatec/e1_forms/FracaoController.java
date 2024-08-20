package com.fatec.e1_forms;
import com.fatec.e1_forms.config.JdbcConfig;
import com.fatec.e1_forms.repository.FracaoRepository;
import com.fatec.e1_forms.service.FracaoService;
import com.fatec.e1_forms.utils.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fracao")
public class FracaoController {

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(produces = "application/json", path ="/salvar")
    public ResponseEntity<CustomResponse> realizarCalculo(@RequestBody List<Fracao> corpo, @RequestParam("operacao") String parametro) {
        JdbcConfig jdbcConfig = new JdbcConfig();
        FracaoRepository fracaoRepository = new FracaoRepository(jdbcConfig.jdbcTemplate(jdbcConfig.dataSource()));
        FracaoService frService = new FracaoService(fracaoRepository);
        Fracao fr = new Fracao(corpo.get(0).getNumerador(), corpo.get(0).getDenominador());
        Fracao fr2 = new Fracao(corpo.get(1).getNumerador(), corpo.get(1).getDenominador());
        int fr1Id = frService.createFracao(fr);
        int fr2Id = frService.createFracao(fr2);

        int contaId;
        CustomResponse response;

        switch (parametro){
            case "soma":
                contaId = frService.createConta(fr1Id, fr2Id, parametro);
                response = new CustomResponse(contaId, "Conta de soma", fr.adicionar(fr2));
                return ResponseEntity.ok(response);
            case "sub":
                contaId = frService.createConta(fr1Id, fr2Id, parametro);
                response = new CustomResponse(contaId, "Conta de subtração", fr.subtrair(fr2));
                return ResponseEntity.ok(response);
            case "div":
                contaId = frService.createConta(fr1Id, fr2Id, parametro);
                response = new CustomResponse(contaId, "Conta de divisão", fr.dividir(fr2));
                return ResponseEntity.ok(response);
            case "mult":
                contaId = frService.createConta(fr1Id, fr2Id, parametro);
                response = new CustomResponse(contaId, "Conta de multiplicação", fr.multiplicar(fr2));
                return ResponseEntity.ok(response);
        };
        response = new CustomResponse(-1, "Erro!!!", "Insira uma operação correta!");
        return ResponseEntity.badRequest().body(response);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/contas")
    public ResponseEntity<CustomResponse> resgatarContas() {
        JdbcConfig jdbcConfig = new JdbcConfig();
        FracaoRepository fracaoRepository = new FracaoRepository(jdbcConfig.jdbcTemplate(jdbcConfig.dataSource()));
        FracaoService frService = new FracaoService(fracaoRepository);
        List<Conta> contas = frService.getAllContas();
        CustomResponse response = new CustomResponse(1, "getAllContas", contas);
        return ResponseEntity.ok(response);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/contas/{contaId}")
    public ResponseEntity<CustomResponse> resgataConta(@PathVariable int contaId ) {
        JdbcConfig jdbcConfig = new JdbcConfig();
        FracaoRepository fracaoRepository = new FracaoRepository(jdbcConfig.jdbcTemplate(jdbcConfig.dataSource()));
        FracaoService frService = new FracaoService(fracaoRepository);
        Conta conta = frService.getContaById(contaId);
        CustomResponse response;

        if (conta != null) {
            response = new CustomResponse(1, "getContaById", conta);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/conta/{id}")
    public ResponseEntity<Void> deleteContaAndFracao(@PathVariable int id) {
        JdbcConfig jdbcConfig = new JdbcConfig();
        FracaoRepository fracaoRepository = new FracaoRepository(jdbcConfig.jdbcTemplate(jdbcConfig.dataSource()));
        FracaoService frService = new FracaoService(fracaoRepository);
        frService.deleteContaAndFracao(id);
        return ResponseEntity.noContent().build();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/conta/{id}")
    public ResponseEntity<Void> updateFracaoFromConta(
            @PathVariable int id,
            @RequestParam int novoNumeradorA,
            @RequestParam int novoDenominadorA,
            @RequestParam int novoNumeradorB,
            @RequestParam int novoDenominadorB) {
        JdbcConfig jdbcConfig = new JdbcConfig();
        FracaoRepository fracaoRepository = new FracaoRepository(jdbcConfig.jdbcTemplate(jdbcConfig.dataSource()));
        FracaoService frService = new FracaoService(fracaoRepository);
        frService.updateFracaoFromConta(id, novoNumeradorA, novoDenominadorA, novoNumeradorB, novoDenominadorB);
        return ResponseEntity.noContent().build();
    }


    @GetMapping(produces = "application/json")
    public String healthCheck() {
        return "OK";
    }
}
