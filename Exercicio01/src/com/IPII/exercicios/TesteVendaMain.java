package com.IPII.exercicios;

import java.time.LocalDate;

public class TesteVendaMain {
    public static void main(String[] args) {
        /*Classe contendo método main:
        A. Escreva uma classe TesteVendaMain que vai realizar as seguintes operações:
        Instanciar 4 objetos do tipo Produto contendo os dados apresentados na Tabela 1
        Instanciar 4 objetos do tipo ItemVenda contendo os dados apresentados na Tabela 1 e associando-os diretamente aos objetos do tipo Produto criados no item anterior através da invocação de métodos do tipo set
        Instanciar 1 objeto do tipo Cliente contendo os dados apresentados na Tabela 1
        Instanciar 1 objeto do tipo Venda contendo os dados apresentados na Tabela 1 associando-o diretamente ao objetos do tipo Cliente criado no item anterior através da invocação de método do tipo set
        B. Uma vez instanciados os objetos do Item A, execute as operações na seguinte ordem:
        Adicione cada um dos objetos ItemVenda no objeto Venda chamando o método "adicionarItemVenda"
        Chame o método listarItensVenda() do objeto Venda instanciado para realizar a impressão de informações conforme apresentado na Tabela 1.*/
        int codigo = 0;
        Produto prod1 = new Produto(++codigo, "Produto 01", 10);
        Produto prod2 = new Produto(++codigo, "Produto 02", 5);
        Produto prod3 = new Produto(++codigo, "Produto 03", 20);
        Produto prod4 = new Produto(++codigo, "Produto 04", 15);
        ItemVenda Item1 = new ItemVenda();
        Item1.setProdutoVendido(prod1);
        Item1.setQuantidade(10);
        ItemVenda Item2 = new ItemVenda();
        Item2.setProdutoVendido(prod2);
        Item2.setQuantidade(5);
        ItemVenda Item3 = new ItemVenda();
        Item3.setProdutoVendido(prod3);
        Item3.setQuantidade(10);
        ItemVenda Item4 = new ItemVenda();
        Item4.setProdutoVendido(prod4);
        Item4.setQuantidade(2);
        LocalDate nascimento = LocalDate.of(1994, 1, 1);
        Cliente cliente = new Cliente("123456", "José Maria Marques", nascimento);
        Venda venda = new Venda();

    }
}