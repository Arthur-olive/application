package com.application.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.application.Model.Produto;
import com.application.Model.repository.ProdutoRepository;


@Controller
@RequestMapping("produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repProduto;


    @GetMapping("/listar")
    public String listar(Model model){
        List<Produto> produtos = repProduto.findAll();
        model.addAttribute("produtos", produtos);
        return "modulos/produto/listar";
    }

    
    @GetMapping("/adicionar")
    public String adicionar(){
        return "modulos/produto/adicionar";
    }


}
