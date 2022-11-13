package com.IPII.exercicios;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
    private LocalDateTime data;
    private String atendente;
    private ItemVenda[] ItensdeVenda = new ItemVenda[4];
    private Cliente vendidoPara;

    public LocalDateTime getData() {
        return data;
    }

    public String getAtendente() {
        return atendente;
    }
    public Cliente getVendidoPara() {
        return vendidoPara;
    }
    public void setVendidoPara(Cliente vendidoPara) {
        this.vendidoPara = vendidoPara;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public void adicionarItem(ItemVenda itemVenda) {
        vendas.add(itemVenda);
    }

    public double calcularTotal() {
        double total =0;
        int i =0;
        while(i<4) {
            total += ItensdeVenda[i++].calcularTotal();
        }
        return total;
    }

    public void listarItensVenda() {
        int i =0;
        while(i<4) {
            String nome = ItensdeVenda[i].getProdutoVendido.getNome();
            int quantidade = ItensdeVenda[i].getQuantidade();
            double preco = ItensdeVenda[i].getProdutoVendido.getPreco();
            double precoTotal = ItensdeVenda[i].calcularTotal();

            System.out.printf("%-20s |%s ||  %n",nome, preco, quantidade, precoTotal);
        }
        double valorTotal = calcularTotal();
    }


}
