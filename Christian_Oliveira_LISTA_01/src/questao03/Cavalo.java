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
				prob = 1 - probJogadasFora(x + 3, y + 3, k, 0, 8, prob);
			} else {
				prob = 1f;
			}
		}
		return prob;
	}

	private double probJogadasFora(int x, int y, int k, int jogadasFora, int jogadasPossiveis, double prob) {
		prob = 1f;
		k--;
		// L em formato cima para baixo
		if (matrizTotal[x + 3][y + 1] == 'x') {
			jogadasFora++;
		} else if (k > 0) {
			prob += probJogadasFora(x + 3, y + 1, k, jogadasFora, jogadasPossiveis * 8, prob);
		}
		if (matrizTotal[x + 3][y - 1] == 'x') {
			jogadasFora++;
		} else if (k > 0) {
			probJogadasFora(x + 3, y - 1, k, jogadasFora, jogadasPossiveis * 8, prob);
		}
		if (matrizTotal[x - 3][y + 1] == 'x') {
			jogadasFora++;
		} else if (k > 0) {
			prob += probJogadasFora(x - 3, y + 1, k, jogadasFora, jogadasPossiveis * 8, prob);
		}
		if (matrizTotal[x - 3][y - 1] == 'x') {
			jogadasFora++;
		} else if (k > 0) {
			prob += probJogadasFora(x - 3, y - 1, k, jogadasFora, jogadasPossiveis * 8, prob);
		}

		// L em formato baixo para cima
		if (matrizTotal[x + 1][y + 3] == 'x') {
			jogadasFora++;
		} else if (k > 0) {
			prob += probJogadasFora(x + 1, y + 3, k, jogadasFora, jogadasPossiveis * 8, prob);
		}
		if (matrizTotal[x + 1][y - 3] == 'x') {
			jogadasFora++;
		} else if (k > 0) {
			prob += probJogadasFora(x + 1, y - 3, k, jogadasFora, jogadasPossiveis * 8, prob);
		}
		if (matrizTotal[x - 1][y + 3] == 'x') {
			jogadasFora++;
		} else if (k > 0) {
			prob += probJogadasFora(x - 1, y + 3, k, jogadasFora, jogadasPossiveis * 8, prob);
		}
		if (matrizTotal[x - 1][y - 3] == 'x') {
			jogadasFora++;
		} else if (k > 0) {
			prob += probJogadasFora(x - 1, y - 3, k, jogadasFora, jogadasPossiveis * 8, prob);
		}
		prob *= (double) jogadasFora / (double) jogadasPossiveis;
		return prob;
	}
}

