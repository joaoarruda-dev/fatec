package com.fatec.e1_forms;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/celular")
public class CelularController {

    @GetMapping(produces = "application/json")
    @RequestMapping("/ligar")
    public ResponseEntity<String> ligarCelular() {
        Celular cel = new Celular();
        String minhaStringJson = "{\"mensagem\": \""+cel.ligar()+"\"}";
        return ResponseEntity.status(HttpStatus.OK).body(minhaStringJson);
    }

    @GetMapping(produces = "application/json")
    @RequestMapping("/desligar")
    public ResponseEntity<String> desligarCelular() {
        Celular cel = new Celular();
        String minhaStringJson = "{\"mensagem\": \""+cel.desligar()+"\"}";
        return ResponseEntity.status(HttpStatus.OK).body(minhaStringJson);
    }

    @GetMapping(produces = "application/json")
    @RequestMapping("/adicionar")
    public ResponseEntity<String> adicionarCelular(@RequestParam("nome") String nome, @RequestParam("numero") String numero) {
        Celular cel = new Celular();
        String minhaStringJson = "{\"mensagem\": \""+cel.adicionarContato(nome, numero)+"\"}";
        return ResponseEntity.status(HttpStatus.OK).body(minhaStringJson);
    }


    @GetMapping(produces = "application/json")
    public String healthCheck() {
        return "OK";
    }
}
