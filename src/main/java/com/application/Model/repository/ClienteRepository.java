package com.application.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.application.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
