package com.application.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ProdutoController {

    @GetMapping("produto/listar")
    public String listar(){
        return "modulos/produtos/listar";
    }
    

    @GetMapping("produto/adicionar")
    public String adicionar(){
        return "modulos/produtos/adicionar";
    }
}
