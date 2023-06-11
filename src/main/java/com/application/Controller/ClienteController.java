package com.application.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cliente")
public class ClienteController {

    @GetMapping("/listar")
    public String listar (Model model){
        model.addAttribute("variavel_teste", "Valor da Variavel Teste");
        return "modulos/cliente/listar";
    }
    

    @GetMapping("/adicionar")
    public String adicionar(){
        return "modulos/cliente/adicionar";
    }
    
    
}
