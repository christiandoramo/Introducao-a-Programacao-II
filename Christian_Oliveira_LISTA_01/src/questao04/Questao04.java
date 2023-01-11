package questao04;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		// 4) java.time (pontuação total 40 pontos)
		// Estude o pacote java.time.* e, usando as classes dele, escreva um programa
		// que:

		// a) (5 pontos) Pegue uma data que o usuário digitou no teclado e transforme em
		// um objeto do tipo apropriado que será usado em outras partes do seu programa
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a data uma data no formato \"dia/mes/ano\"");
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataLocal = LocalDate.parse(scanner.nextLine(), formatador);
		LocalDateTime tempo = dataLocal.atTime(0, 0);// at(0,0) para igualar a hora
		String dataString = formatador.format(dataLocal);
		System.out.println("A data é: " + dataString);
		Duration diferenca = Duration.between(tempo, LocalDate.now().atStartOfDay());// atStartOfDay para igualar a hora

		// b) (5 pontos) Imprima a diferença (em dias) da data de hoje para a data que o
		// usuário digitou no teclado
		System.out.println(Math.abs(diferenca.toDays()) + " dias de diferença ente a data digitada e hoje");
		LocalDate dataSomada = dataLocal.plusDays(110);

		// c) (5 pontos) Some 110 dias à data digitada pelo usuário e imprima qual a
		// nova data obtida
		System.out.println("A data " + dataString + " acrescentada de 110 dias é: " + dataSomada.format(formatador));

		// d) (5 pontos) Altere o mês da data informada para ser igual ao mês de agosto
		dataLocal = LocalDate.of(dataLocal.getYear(), Month.AUGUST, dataLocal.getDayOfMonth());
		System.out.println("Essa mesma data mas no mês de agosto fica " + dataLocal.format(formatador));

		// e) (5 pontos) Imprima a data alterada no formato “dd-MMM-YYYY”. Para isso
		// você deve usar a classe java.time.format.DateTimeFormatter.
		formatador = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println("Data formatada (dd-MMM-yyyy): " + dataLocal.format(formatador));

		// f) (15 pontos) Nesta mesma classe que você escreve seu programa, crie um
		// método que recebe duas datas (java.time.LocalDate) e calcula a quantidade de
		// dias úteis (excluindo sábados e domingos) contidos entre essas duas datas.
		// Para testar o método mencionado, peça que o usuário forneça duas datas
		// usando o teclado e então calcule a quantidade de dias úteis entre essas datas
		// através da invocação do método
		formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Digite a data 1 (formato: dia/mes/ano)");
		String dat1 = scanner.nextLine();
		LocalDate data1 = LocalDate.parse(dat1, formatador);
		System.out.println("Digite a data 2 (formato: dia/mes/ano)");
		String dat2 = scanner.nextLine();
		LocalDate data2 = LocalDate.parse(dat2, formatador);
		scanner.close();
		Integer diasUteis = calculaTotalDiasUteis(data1, data2);
		System.out.println("O total de dias úteis de " + data1.format(formatador) + " e " + data2.format(formatador)
				+ " (excluindo feriados) é: " + diasUteis + "dias uteis");

	}

	static private Integer calculaTotalDiasUteis(LocalDate data1, LocalDate data2) {
		Period per = Period.between(data1, data2);
		// diferente de duration, contabiliza o calendario ISO-8601
		int diferenca = Math.abs(per.getDays());
		int diasUteis = 0;
		for (int dia = 0; dia <= diferenca; dia++) {
			// deverá checar dias uteis """contidos""" entre data1 e data2, logo checa em
			// dia == 0 e em dia == distancia
			Boolean bSabado = data1.plusDays(dia).getDayOfWeek().equals(DayOfWeek.SATURDAY);
			Boolean bDomingo = data1.plusDays(dia).getDayOfWeek().equals(DayOfWeek.SUNDAY);
			if (!bSabado && !bDomingo) {
				diasUteis++;
			}
		}
		return diasUteis;
	}
}
