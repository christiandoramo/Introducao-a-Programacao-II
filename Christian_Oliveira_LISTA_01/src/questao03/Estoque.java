package questao03;

//	b)
public class Estoque {
	private Produto produto;
	private Integer qtdAtual;
	private Integer qtdMinima;

	public Estoque() {
	}

	public Estoque(Produto produto, Integer qtdAtual, Integer qtdMinima) {
		this.produto = produto;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQtdAtual() {
		return qtdAtual;
	}

	public void reporEstoque(Integer qtd) {
		qtdAtual += qtd;
	}

	public void darBaixa(Integer qtd) {
		qtdAtual -= qtd;
	}

	public Integer getQtdMinima() {
		return qtdMinima;
	}

	public void mudarQtdMinima(Integer qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

	public void relatorio() {
		System.out.printf("%nCODIGO:%4s\t", produto.getCodigo());
		System.out.printf("NOME:%20s\t", produto.getNome());
		System.out.printf("QUANTIDADE:%8d\t", getQtdAtual());
	}

}
