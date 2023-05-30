package com.application.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ClienteController {

    @GetMapping("cliente/listar")
    public String listar(){
        return "modulos/clientes/listar";
    }
    

    @GetMapping("cliente/adicionar")
    public String adicionar(){
        return "modulos/clientes/adicionar";
    }
    
}
