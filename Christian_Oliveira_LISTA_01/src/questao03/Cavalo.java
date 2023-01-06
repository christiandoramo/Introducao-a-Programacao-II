package questao03;

public class Cavalo {
	char tabuleiro[][] = new char[8][8];
	char matrizTotal[][] = new char[14][14];

	public double probDeEstarEmCampo(int x, int y, int k) {
		double prob = 0f;
		x--;
		y--;
		if (x >= 0 && x < 8 && y >= 0 && y < 8) {
			if (k > 0) {
				for (int i = 0; i < 14; i++) {
					for (int j = 0; j < 14; j++) {
						matrizTotal[i][j] = 'x';
						// 'x' apenas em todo a matriz de jogadas possíveis
					}
				}
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						tabuleiro[i][j] = '-';
						matrizTotal[i + 3][j + 3] = '-';
						// agora 'x' apenas em região complementar ao tabuleiro
					}
				}
				prob = probJogadas(x + 3, y + 3, k, 0, 1, prob);
			} else {
				prob = 1f;
			}
		}
		return prob;
	}

	private double probJogadas(int x, int y, int k, int jogadasDentro, int jogadasPossiveis, double prob) {
		prob = 1.0;
		jogadasPossiveis *= 8;
		k--;
		// bools "está dentro do tabuleiro?" para cada posicao
		Boolean direita3baixo1 = matrizTotal[x + 3][y + 1] == '-';
		Boolean direita3cima1 = matrizTotal[x + 3][y - 1] == '-';
		Boolean esquerda3baixo1 = matrizTotal[x - 3][y + 1] == '-';
		Boolean esquerda3cima1 = matrizTotal[x - 3][y - 1] == '-';
		Boolean direita1baixo3 = matrizTotal[x + 1][y + 3] == '-';
		Boolean direita1cima3 = matrizTotal[x + 1][y - 3] == '-';
		Boolean esquerda1baixo3 = matrizTotal[x - 1][y + 3] == '-';
		Boolean esquerda1cima3 = matrizTotal[x - 1][y - 3] == '-';
		// jogadasDentro de cada prob interna
		if (direita3baixo1)
			jogadasDentro++;
		if (direita3cima1)
			jogadasDentro++;
		if (esquerda3baixo1)
			jogadasDentro++;
		if (esquerda3cima1)
			jogadasDentro++;
		if (direita1baixo3)
			jogadasDentro++;
		if (direita1cima3)
			jogadasDentro++;
		if (esquerda1baixo3)
			jogadasDentro++;
		if (esquerda1cima3)
			jogadasDentro++;
		// acumula prob total com probJogadas
		if (direita3baixo1 && k > 0)
			prob += probJogadas(x + 3, y + 1, k, jogadasDentro, jogadasPossiveis, prob);
		if (direita3cima1 && k > 0)
			prob += probJogadas(x + 3, y - 1, k, jogadasDentro, jogadasPossiveis, prob);
		if (esquerda3baixo1 && k > 0)
			prob += probJogadas(x - 3, y + 1, k, jogadasDentro, jogadasPossiveis, prob);
		if (esquerda3cima1 && k > 0)
			prob += probJogadas(x - 3, y - 1, k, jogadasDentro, jogadasPossiveis, prob);
		if (direita1baixo3 && k > 0)
			prob += probJogadas(x + 1, y + 3, k, jogadasDentro, jogadasPossiveis, prob);
		if (direita1cima3 && k > 0)
			prob += probJogadas(x + 1, y - 3, k, jogadasDentro, jogadasPossiveis, prob);
		if (esquerda1baixo3 && k > 0)
			prob += probJogadas(x - 1, y + 3, k, jogadasDentro, jogadasPossiveis, prob);
		if (esquerda1cima3 && k > 0)
			prob += probJogadas(x - 1, y - 3, k, jogadasDentro, jogadasPossiveis, prob);
		prob *= ((double) jogadasDentro / (double) jogadasPossiveis);
		return prob;
	}
}
