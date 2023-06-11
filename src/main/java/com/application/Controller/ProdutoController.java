package com.application.Controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("produto")
public class ProdutoController {
    
    @GetMapping("/listar")
    public String listar(){
        return "modulos/produto/listar";
    }

    
    @GetMapping("/adicionar")
    public String adicionar(){
        return "modulos/produto/adicionar";
    }


}
