package questao05;

import java.util.function.Consumer;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RelacaoVacinados {
	private List<RegistroVacina> vacinados = new ArrayList<>();
	private Integer codigoAtual = 0;

	public String getRegistros() {
		return (++codigoAtual).toString();
	}

	public void setRegistros(String codigo) {
		this.codigoAtual = Integer.parseInt(codigo);
	}

	public void adicionar(RegistroVacina vacinacao) {
		vacinados.add(vacinacao);
	}

	public List<RegistroVacina> getVacinados() {
		return vacinados;
	}

	public void setVacinados(List<RegistroVacina> vacinados) {
		this.vacinados = vacinados;
	}

	public void relatorio() {
		int vacinadosPeloMenos1dose = vacinados.stream().filter(r -> r.getDose() == 1).mapToInt(sem2dose -> 1).sum();
		int jacares = vacinadosPeloMenos1dose
				- vacinados.stream().filter(r -> r.getDose() == 2).mapToInt(sem2dose -> 1).sum();
		int totalVacinados = (int) calcularTotalVacinadosAcimade(0);
		int totalIdosos1doseenao2 = totalDeIdososQueTomaram1aDose();
		listarPessoasQueNaoTomaram2aDose();
		System.out.println("Total de vacinados acima de 65 anos: " + totalIdosos1doseenao2);
		System.out.println("Total de vacinados que não tomaram a 2a. dose: " + jacares);
		System.out.println("Total de vacinados que tomaram a 2a. dose: " + totalVacinados);
	}

	public double calcularTotalVacinadosAcimade(int idade) {
		int totalVacinados = vacinados.stream()
				.filter(registrado -> registrado.getDose() >= 2 && registrado.getVacinado().calcularIdade() >= idade)
				.mapToInt(Maisde18eTomouMaisde2Doses -> 1).sum();
		return totalVacinados;
	}

	public void totalDeIdososQueTomaram2aDose() {
		int total = vacinados.stream()
				.filter(registrado -> registrado.getDose() >= 2 && registrado.getVacinado().calcularIdade() >= 65)
				.mapToInt(Maisde60eTomouMaisde1Dose -> 1).sum();
		System.out.println(total);
	}

	public int totalDeIdososQueTomaram1aDose() {
		int total = vacinados.stream()
				.filter(registrado -> registrado.getDose() == 1 && registrado.getVacinado().calcularIdade() >= 65)
				.mapToInt(Maisde60eTomouMaisde1Dose -> 1).sum();
		return total;
	}

	public void listarPessoasQueNaoTomaram2aDose() {
		System.out.printf("%-12s | %-20s | %10s | %30s%n", "CPF", "Nome", "Idade", "Data Indicada p. 2a Dose");
		System.out
				.println("-------------------------------------------------------------------------------------------");
		List<RegistroVacina> vacinadosMaisde2doses = vacinados.stream().filter(registrado -> registrado.getDose() > 1)
				.toList();
		List<RegistroVacina> jacares = vacinados.stream().filter(registrado -> registrado.getDose() == 1).toList();
		jacares = jacares.stream().filter(a -> {
			return vacinadosMaisde2doses.stream().filter(b -> !a.getVacinado().equals(b.getVacinado())).findAny()
					.isPresent();
		}).toList();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Consumer<RegistroVacina> vacinaAuditavel = x -> System.out.printf("%-12s | %-20s | %10d | %30s%n",
				x.getVacinado().getCpf(), x.getVacinado().getNome(), x.getVacinado().calcularIdade(),
				x.getData_vacinacao().plusDays(21).format(fmt));
		jacares.forEach(vacinaAuditavel);
		System.out
				.println("-------------------------------------------------------------------------------------------");
	}
}
