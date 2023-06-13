package com.application.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.application.Model.Cliente;
import com.application.Model.repository.ClienteRepository;


@Controller
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repCliente;


    @GetMapping("/listar")
    public String listar (Model model){
        List<Cliente> clientes = repCliente.findAll();
        model.addAttribute("clientes", clientes);
        return "modulos/cliente/listar";
    }
    

    @GetMapping("/adicionar")
    public String adicionar(){
        return "modulos/cliente/adicionar";
    }
    
    
}
