package com.fatec.e1_forms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/cerveja")
public class CervejaController {

    @GetMapping(produces = "application/json")
    @RequestMapping("/abrir")
    public ResponseEntity<String> ligarCelular() {
        Cerveja cerveja = new Cerveja();
        String minhaStringJson = "{\"mensagem\": \""+cerveja.abrir()+"\"}";
        return ResponseEntity.status(HttpStatus.OK).body(minhaStringJson);
    }

    @GetMapping(produces = "application/json")
    @RequestMapping("/beber")
    public ResponseEntity<String> desligarCelular() {
        Cerveja cerveja = new Cerveja();
        String minhaStringJson = "{\"mensagem\": \""+cerveja.beber()+"\"}";
        return ResponseEntity.status(HttpStatus.OK).body(minhaStringJson);
    }

    @GetMapping(produces = "application/json")
    @RequestMapping("/adicionar")
    public ResponseEntity<String> adicionarCelular(@RequestParam("quantidade") String quantidade) {
        Cerveja cerveja = new Cerveja();
        String minhaStringJson = "{\"mensagem\": \""+cerveja.adicionarAoCopo(Double.parseDouble(quantidade))+"\"}";
        return ResponseEntity.status(HttpStatus.OK).body(minhaStringJson);
    }


    @GetMapping(produces = "application/json")
    public String healthCheck() {
        return "OK";
    }
}
