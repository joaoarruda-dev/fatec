package com.fatec.e1_forms.service;


import com.fatec.e1_forms.Conta;
import com.fatec.e1_forms.Fracao;
import com.fatec.e1_forms.repository.FracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FracaoService {

    private FracaoRepository fracaoRepository;

    @Autowired
    public FracaoService(FracaoRepository fracaoRepository) {
        this.fracaoRepository = fracaoRepository;
    }

    //CREATE
    public int createFracao(Fracao fracao) {
        return fracaoRepository.salvarFracao(fracao.getNumerador(), fracao.getDenominador());
    }


    //CREATE
    public int createConta(int fr1Id, int fr2Id, String operacao){
        return fracaoRepository.salvarConta(fr1Id, fr2Id, operacao);
    }


    //READ
    public List<Conta> getAllContas(){
        return fracaoRepository.resgatarContas();
    }


    //READ
    public Conta getContaById(int contaId){
        return fracaoRepository.resgatarContaPorId(contaId);
    }

    //UPDATE
    public void updateFracaoFromConta(int contaId, int novoNumeradorA, int novoDenominadorA, int novoNumeradorB, int novoDenominadorB) {
        fracaoRepository.updateFracaoFromConta(contaId, novoNumeradorA, novoDenominadorA, novoNumeradorB, novoDenominadorB);
    }

    //DELETE
    public void deleteContaAndFracao(int contaId) {
        fracaoRepository.deleteContaAndFracao(contaId);
    }




}
