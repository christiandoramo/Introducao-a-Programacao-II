package questao03;

import java.util.Objects;

//	a)
public class Produto {
	private String codigo;
	private String nome;

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

	public Produto() {
	}

	public Produto(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return (codigo + "			" + nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo); // && Objects.equals(nome, other.nome);
	}
}
