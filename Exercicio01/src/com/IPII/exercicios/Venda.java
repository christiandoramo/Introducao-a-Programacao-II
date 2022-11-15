package com.IPII.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Venda {
    private LocalDate data;
    private String atendente;
    private ItemVenda[] ItensdeVenda = new ItemVenda[4];
    private Cliente vendidoPara;
    private int registrados = 0;

    public LocalDate getData() {
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

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public void adicionarItem(ItemVenda itemVenda) {
        ItensdeVenda[registrados++] = itemVenda;
    }

    public double calcularTotal() {
        double total = 0;
        int i = 0;
        while (i < 4) {
            total += ItensdeVenda[i++].calcularTotal();
        }
        return total;
    }

    public void listarItensVenda() {
        int i = 0;
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String nome = vendidoPara.getNome();
        String cpf = vendidoPara.getCpf();
        int idade = vendidoPara.calcularidade(data);
        System.out.println();
        System.out.printf("Data de venda: %s%n", formatador.format(data));
        System.out.printf("Cliente: %s | CPF: %s | idade: %d%n", nome, cpf, idade);
        System.out.printf("Atendente: %s %n", atendente);
        System.out.printf("Nome do Produto\t| Preço \t | Quantidade | Total%n");
        System.out.println("-----------------------------------------------------");

        while (i < 4) {
            String nomeP = ItensdeVenda[i].getProdutoVendido().getNome();
            int quantidade = ItensdeVenda[i].getQuantidade();
            double preco = ItensdeVenda[i].getProdutoVendido().getPreco();
            double precoTotal = ItensdeVenda[i].calcularTotal();
            System.out.printf(Locale.US, "%10s\t\t| \tR$ %5.2f | %9d  | R$ %6.2f %n", nomeP, preco, quantidade, precoTotal);
            i++;
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf(Locale.US, "Total da venda: \t\t\t\t\t\t\tR$ %.2f%n", calcularTotal());
    }


}
