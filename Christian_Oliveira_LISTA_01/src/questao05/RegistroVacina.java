package questao05;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

import questao05.Enums.LOCAIS;

public class RegistroVacina {
	private String id;

	private LocalDate data_vacinacao;
	private String atendente;
	private int dose;
	private String local;
	private String grupo;
	private Vacina vacina;
	private Pessoa vacinado;

	public RegistroVacina(String id, LocalDate data_vacinacao, String atendente, int dose, LOCAIS localidade,
			Vacina vacina, Pessoa vacinado) {
		grupo = vacinado.getGrupo();
		this.vacinado = vacinado;
		this.vacina = vacina;
		this.id = id;
		this.data_vacinacao = data_vacinacao;
		this.atendente = atendente;
		this.dose = dose;
		switch (localidade) {
		case DRIVETHRUUFRPE:
			local = "DRIVE THRU - UFRPE - UNIVERSIDADE RURAL";
		case DRIVETHRUGERALDAO:
			local = "DRIVE THRU GERALDÃO";
		case CENTRODEVACINACAOPARQUEDEEXPOSICAO:
			local = "CENTRO DE VACINAÇÃO PARQUE DE EXPOSIÇÃO";
		case CENTRODEVACINACAOCOMPAZARIANOSUASSUNA:
			local = "CENTRO DE VACINAÇÃO COMPAZ ARIANO SUASSUNA";
		case DRIVETHRUPARQUEDEEXPOSICAO:
			local = "DRIVE THRU PARQUE DE EXPOSIÇÃO";
		case DRIVETHRUARRUDA:
			local = "DRIVE THRU ARRUDA";
		default:
			local = "LOCAL NÃO INFORMADO";
		}
	}

	public RegistroVacina(String id, LocalDate data_vacinacao, String atendente, int dose, String localidade,
			String grupo, Vacina vacina, Pessoa vacinado) {
		this.vacinado = vacinado;
		this.vacina = vacina;
		this.id = id;
		this.data_vacinacao = data_vacinacao;
		this.atendente = atendente;
		this.dose = dose;
		this.grupo = grupo;
		local = localidade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getData_vacinacao() {
		return data_vacinacao;
	}

	public void setData_vacinacao(LocalDate data_vacinacao) {
		LocalDate hoje = LocalDate.now();
		Period diferenca = Period.between(hoje, data_vacinacao);
		if (diferenca.getDays() >= 0)
			this.data_vacinacao = data_vacinacao;
		else
			System.out.println("Erro: Data anterior a data atual");
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		if (dose == 1 || dose == 2) // "valores possíveis para o atributo dose: 1 ou 2"
			this.dose = dose;
		else
			System.out.println("Erro: Apenas dose 1 e dose 2 podem ser registrados");
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public Pessoa getVacinado() {
		return vacinado;
	}

	public void setVacinado(Pessoa vacinado) {
		this.vacinado = vacinado;
	}

	@Override
	public String toString() {
		return getVacinado().toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroVacina other = (RegistroVacina) obj;
		return Objects.equals(getVacinado().getCpf(), other.getVacinado().getCpf());
	}

}
