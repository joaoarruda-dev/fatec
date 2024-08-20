package com.fatec.e1_forms;

import com.fatec.e1_forms.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

public class Conta {
    private int contaId;
    private int f1Num;
    private int f1Den;
    private String operacao;
    private int f2Num;
    private int f2Den;

    private Fracao resultado;

    public Conta(int id, int f1Num, int f1Den, String operacao, int f2Num, int f2Den) {
        this.contaId = id;
        this.f1Num = f1Num;
        this.f1Den = f1Den;
        this.operacao = operacao;
        this.f2Num = f2Num;
        this.f2Den = f2Den;
        Fracao fr = new Fracao(f1Num, f1Den);
        Fracao fr2 = new Fracao(f2Num,f2Den);
        switch (operacao){
            case "soma":
                 setResultado(fr.adicionar(fr2));
                 break;
            case "sub":
                setResultado(fr.subtrair(fr2));
                break;
            case "div":
                setResultado(fr.dividir(fr2));
                break;
            case "mult":
                setResultado(fr.multiplicar(fr2));
                break;
        };
    }


    public int getContaId() {
        return contaId;
    }

    public void setContaId(int contaId) {
        this.contaId = contaId;
    }

    public int getF1Num() {
        return f1Num;
    }

    public void setF1Num(int f1Num) {
        this.f1Num = f1Num;
    }

    public int getF1Den() {
        return f1Den;
    }

    public void setF1Den(int f1Den) {
        this.f1Den = f1Den;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public int getF2Num() {
        return f2Num;
    }

    public void setF2Num(int f2Num) {
        this.f2Num = f2Num;
    }

    public int getF2Den() {
        return f2Den;
    }

    public void setF2Den(int f2Den) {
        this.f2Den = f2Den;
    }

    public Fracao getResultado() {
        return resultado;
    }

    public void setResultado(Fracao resultado) {
        this.resultado = resultado;
    }
}
