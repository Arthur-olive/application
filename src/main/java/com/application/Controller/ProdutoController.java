package com.application.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    @GetMapping("/listar")
    public String listar(){
        return "Modulos/Produto/listar";
    }
    
    @GetMapping("/listar")
    public String listar (Model model){
        model.addAttribute("variavel_teste", "Valor da Variavel Teste");
        return "Modulos/Produto/listar";

    }

    @GetMapping("/adicionar")
    public String adicionar(){
        return "Modulos/Produto/adicionar";
    }


}
