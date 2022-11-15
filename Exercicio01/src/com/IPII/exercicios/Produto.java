package com.IPII.exercicios;

import java.time.LocalDate;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;

    public Produto() {
    }

    public Produto(int codigo, String nome,String descricao ,double preco) {
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
