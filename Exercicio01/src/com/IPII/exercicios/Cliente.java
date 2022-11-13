package com.IPII.exercicios;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    public Cliente(){

    }
    public Cliente(String cpf, String nome, LocalDate dataNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularidade() {
        // period.between recebe dois localdates
        Period period = Period.between(dataNascimento, LocalDate.now());
        return period.getYears();
    }
}
