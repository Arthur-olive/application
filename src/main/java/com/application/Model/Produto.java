package com.application.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "produtos")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor

public class Produto {
        
    @Id//javax.persistence.
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private double preco;
    private int quantidade;
}
