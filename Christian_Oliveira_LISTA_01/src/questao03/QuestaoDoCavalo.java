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
		double prob = cavalo.probDeEstarEmCampo(x, y, k);
		System.out.printf("Probabilidade de estar em campo: %f", prob);
	}
}
//3) Algoritmo simples em Java 2 (pontuação 60 pontos)
//Este problema foi recentemente usado em seleção para desenvolvedor do Google: um
//tabuleiro de xadrez é um matriz de 8x8. Dado um cavalo em qualquer posição (x, y) do
//tabuleiro e um dado número de movimentos ‘k’ a serem feitos por ele. Queremos
//descobrir, depois de k movimentos feitos pelo cavalo, qual a probabilidade de ele ainda
//estar dentro do tabuleiro. Uma vez que o cavalo tenha saído do tabuleiro, ele não
//pode mover novamente e estará considerado fora do tabuleiro. Resolva essa
//questão em Java.
//Aqui segue um pequeno código inicial:
//def is_knight_on_board(x, y, k):
//# Fill this in.
//print is_knight_on_board(0, 0, 1)
//# 0.25
//
