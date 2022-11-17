package com.IPII.exercicios;

import java.time.LocalDate;

public class TesteVendaMain {
    public static void main(String[] args) {

        // A --- instancia dos 4 objetos produtos
        Produto prod1 = new Produto("Produto 01", "descrição 1", 10);
        Produto prod2 = new Produto("Produto 02", "descrição 2", 5);
        Produto prod3 = new Produto("Produto 03", "descrição 3", 20);
        Produto prod4 = new Produto("Produto 04", "descrição 4", 15);

        // A --- instancia dos 4 objetos ItemVenda e o uso dos metodos setters
        ItemVenda Item1 = new ItemVenda();
        ItemVenda Item2 = new ItemVenda();
        ItemVenda Item3 = new ItemVenda();
        ItemVenda Item4 = new ItemVenda();
        Item1.setProdutoVendido(prod1);
        Item1.setQuantidade(10);
        Item2.setProdutoVendido(prod2);
        Item2.setQuantidade(5);
        Item3.setProdutoVendido(prod3);
        Item3.setQuantidade(10);
        Item4.setProdutoVendido(prod4);
        Item4.setQuantidade(2);

        // A --- instanciando cliente
        LocalDate nascimento = LocalDate.of(1994, 1, 1);
        Cliente cliente = new Cliente("123456", "José Maria Marques", nascimento);

        // A --- instancia de 1 objeto Venda e uso dos metodos setters
        Venda venda = new Venda();
        LocalDate dataDaVenda = LocalDate.of(2020, 12, 23);
        venda.setData(dataDaVenda);
        venda.setAtendente("Maria Dolores Sampaio");
        venda.setVendidoPara(cliente);

        // B --- adicionando ItemVenda ao objeto tipo Venda
        venda.adicionarItem(Item1);
        venda.adicionarItem(Item2);
        venda.adicionarItem(Item3);
        venda.adicionarItem(Item4);

        // B --- listando os dados
        venda.listarItensVenda();
    }
}