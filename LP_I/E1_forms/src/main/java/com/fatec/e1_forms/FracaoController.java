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
                return ResponseEntity.ok(fr2.adicionar(fr));
            case "sub":
                return ResponseEntity.ok(fr2.subtrair(fr));
            case "div":
                return ResponseEntity.ok(fr2.dividir(fr));
            case "mult":
                return ResponseEntity.ok(fr2.multiplicar(fr));
        };
        throw new ErrorResponseException(HttpStatus.BAD_REQUEST);
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(produces = "application/json")
    public String healthCheck() {
        return "OK";
    }
}
