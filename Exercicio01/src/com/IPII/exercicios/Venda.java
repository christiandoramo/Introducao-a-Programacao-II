package com.IPII.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Venda {
    private LocalDate data;
    private String atendente;
    private List<ItemVenda> ItensdeVenda;
    private Cliente vendidoPara;

    public Venda(){
        this.ItensdeVenda = new ArrayList();
    }

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
        ItensdeVenda.add(itemVenda);
    }

    public double calcularTotal() {
        double total = 0;
        for(ItemVenda item : ItensdeVenda){
            total += item.calcularTotal();
        }
        return total;
    }

    public void listarItensVenda() {
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
        for(ItemVenda item : ItensdeVenda){
            String nomeP = item.getProdutoVendido().getNome();
            int quantidade = item.getQuantidade();
            double preco = item.getProdutoVendido().getPreco();
            double precoTotal = item.calcularTotal();
            System.out.printf("%s\t\t|", nomeP);
            System.out.printf(Locale.US, " \tR$ %5.2f |", preco);
            System.out.printf(Locale.US, " %9d  |", quantidade);
            System.out.printf(Locale.US, " R$ %6.2f ", precoTotal);
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf(Locale.US, "Total da venda: \t\t\t\t\t\t\tR$ %.2f%n", calcularTotal());
    }


}
