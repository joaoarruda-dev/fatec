package com.fatec.e1_forms;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fracao")
public class FracaoController {

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(produces = "application/json")
    public ResponseEntity<Fracao> realizarCalculo(@RequestBody List<Fracao> corpo, @RequestParam("operacao") String parametro) {
        Fracao fr = new Fracao(corpo.get(0).getNumerador(), corpo.get(0).getDenominador());
        Fracao fr2 = new Fracao(corpo.get(1).getNumerador(), corpo.get(1).getDenominador());
        switch (parametro){
            case "soma":
                return ResponseEntity.ok(fr.adicionar(fr2));
            case "sub":
                return ResponseEntity.ok(fr.subtrair(fr2));
            case "div":
                return ResponseEntity.ok(fr.dividir(fr2));
            case "mult":
                return ResponseEntity.ok(fr.multiplicar(fr2));
        };
        throw new ErrorResponseException(HttpStatus.BAD_REQUEST);
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(produces = "application/json")
    public String healthCheck() {
        return "OK";
    }
}
