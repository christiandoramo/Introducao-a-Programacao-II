package questao05;

import java.time.LocalDate;
import java.time.Period;

import questao05.Enums.GRUPOS;

public class Pessoa {
	private String cpf;
	private String grupo;
	private String nome;
	private LocalDate dataNascimento;

	public Pessoa(String cpf, String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		if (grupo == null && calcularIdade() >= 65)
			grupo = "IDOSOS";
	}

	public Pessoa(String cpf, String nome, LocalDate dataNascimento, GRUPOS grupoTipo) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;

		switch (grupoTipo) {
		case IDOSOS:
			grupo = "IDOSOS";
		case TRABALHADORESDASAUDE:
			grupo = "TRABALHADORES DA SAÚDE";
		case OUTRASPRIORIDADES:
			grupo = "OUTRAS PRIORIDADES";
		default:
			grupo = "GRUPO NÃO INFORMADO";
		}
		if (grupo.equals("GRUPO NÃO INFORMADO") && calcularIdade() >= 65)
			grupo = "IDOSOS";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int calcularIdade() {
		LocalDate hoje = LocalDate.now();
		Period period = Period.between(dataNascimento, hoje);
		// Period retorna Duration corrigido pelas variações do calendario
		int idade = period.getYears();
		return idade;
	}

}
