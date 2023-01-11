package projeto2va;

public abstract class Game {
	private String titulo;
    private String codigo;
    private String produtora;
    private String ano;
    private String publicadora;    
    private int    quantidade;
    private float  valor;
    public String getTitulo(){ return titulo; }
    public String getCodigo(){ return codigo; }
    public String getProdutora(){ return produtora; }
    public String getAno(){ return ano; }
    public String getPublicadora(){ return publicadora; }
    public int    getQuantidade(){ return quantidade; }
    public float  getValor(){ return valor; }
    public void setTitulo    (String titulo) { this.titulo = titulo; }
    public void setCodigo     (String codigo)   { this.codigo = codigo; }
    public void setProdutora     (String produtora)  { this.produtora = produtora; }
    public void setAno       (String ano)    { this.ano = ano; }
    public void setPublicadora   (String publicadora){ this.publicadora = publicadora; }
    public void setQuantidade(int quantidade){ this.quantidade = quantidade; }
    public void setValor     (float valor){ this.valor = valor; }

    
    protected abstract boolean disponibilidade(String titulo);
    protected abstract void ShowGames();
}
