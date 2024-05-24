package com.idsoftware.crud_simple;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/pacientes")
public class PacienteRestController {

    @RequestMapping("")
    public ResponseEntity<List<String>> listar(){
        List<String> pacientes = Arrays.asList("Isaias","Marcos","Juan","Jesús");
        return new ResponseEntity<>(pacientes,OK);
    }
}
