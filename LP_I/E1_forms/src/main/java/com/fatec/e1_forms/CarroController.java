package com.fatec.e1_forms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/carro")
public class CarroController {

    @GetMapping(produces = "application/json")
    @RequestMapping("/andar")
    public ResponseEntity<String> andar() {
        Carro carro = new Carro();
        String minhaStringJson = "{\"mensagem\": \""+carro.andar()+"\"}";
        return ResponseEntity.status(HttpStatus.OK).body(minhaStringJson);
    }

    @GetMapping(produces = "application/json")
    @RequestMapping("/freiar")
    public ResponseEntity<String> freiar() {
        Carro carro = new Carro();
        String minhaStringJson = "{\"mensagem\": \""+carro.freiar()+"\"}";
        return ResponseEntity.status(HttpStatus.OK).body(minhaStringJson);
    }

    @GetMapping(produces = "application/json")
    @RequestMapping("/trocar")
    public ResponseEntity<String> trocarMarcha(@RequestParam("marcha") String marcha) {
        Carro carro = new Carro();
        String minhaStringJson = "{\"mensagem\": \""+carro.trocarMarcha(marcha)+"\"}";
        return ResponseEntity.status(HttpStatus.OK).body(minhaStringJson);
    }


    @GetMapping(produces = "application/json")
    public String healthCheck() {
        return "OK";
    }
}
