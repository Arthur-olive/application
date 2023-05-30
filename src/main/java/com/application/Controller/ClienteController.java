package com.application.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cliente")
public class ClienteController {

    @GetMapping("/listar")
    public String listar(){
        return "modulos/cliente/listar";
    }
    

    @GetMapping("/adicionar")
    public String adicionar(){
        return "modulos/cliente/adicionar";
    }
    
}
