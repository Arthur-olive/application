package com.application.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.application.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
