package questao03;

import java.util.Scanner;

public class QuestaoDoCavalo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cavalo cavalo = new Cavalo();
		int x, y, k;
		do {
			System.out.println("Num tabuleiro 8x8 escolha a posicao do cavalo");
			System.out.println("posicao do eixo x (1-8): ");
			x = scan.nextInt();
			System.out.println("posicao do eixo y (1-8): ");
			y = scan.nextInt();
			System.out.println("numero de movimentos do cavalo: ");
			k = scan.nextInt();
		} while (k < 0);
		scan.close();
		double prob = cavalo.probDoCavalo(k, x-1, y-1);
		System.out.printf("Probabilidade de estar em campo: %f", prob);
	}
}