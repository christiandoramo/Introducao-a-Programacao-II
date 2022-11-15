package com.IPII.exercicios;

public class ItemVenda {
    private int quantidade;
    private Produto produtoVendido;
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProdutoVendido (){
        return produtoVendido;
    }
    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }


    public double calcularTotal() {
        double result = quantidade * produtoVendido.getPreco();
        return result;
    }
}
