package com.example.models;

public class Cliente {
    private int matricula;
    private String nome;
    private String endereco;
    private String modalidade;

    // Getters e Setters

    // Construtor
    public Cliente(int matricula, String nome, String endereco, String modalidade) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.modalidade = modalidade;
    }
}

