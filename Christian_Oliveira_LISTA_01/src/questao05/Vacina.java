package questao05;

import questao05.Enums.VACINAS;

public class Vacina {
	private int codigo;
	private String nome;
	private String lote;

	public Vacina( VACINAS vacinaTipo,String lote) {
		super();
		++codigo;
		this.lote = lote;
		switch(vacinaTipo) {
		case CORONAVAC:
			nome = "CORONAVAC";
		case OXFORD: 
			nome = "OXFORD";
		default:
			nome = "VACINA NÃO INFORMADA";
		}
	}
	
	public Vacina(int codigo, VACINAS vacinaTipo,String lote) {
		super();
		this.codigo = codigo;
		this.lote = lote;
		switch(vacinaTipo) {
		case CORONAVAC:
			nome = "CORONAVAC";
		case OXFORD: 
			nome = "OXFORD";
		default:
			nome = "VACINA NÃO INFORMADA";
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

}
