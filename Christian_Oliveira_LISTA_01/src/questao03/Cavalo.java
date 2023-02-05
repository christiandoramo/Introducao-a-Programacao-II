package questao03;

//AQUI É CONTABILIZADO OS MOVIMENTOS POSSIVEIS FORA DO TABULEIRO
//POR ISSO QUE A CADA JOGADA A PROBABILIDADE DE SE ESTAR EM CAMPO DIMINUI
// DIFERENTEMENTE DA TENTATIVA2 QUE AUMENTA POR NÃO CONTABILIZAR

public class Cavalo {
	public double probDoCavalo(int k, int x, int y) {
		double[][] matriz1 = new double[8][8];
		int[] movimentosLinha = new int[] { 2, 2, 1, 1, -1, -1, -2, -2 };
		int[] movimentosColuna = new int[] { 1, -1, 2, -2, 2, -2, 1, -1 };
		matriz1[x][y] = 1.0;
		for (; k > 0; k--) {
			double[][] matriz2 = new double[8][8];
			for (int linha = 0; linha < 8; linha++) {
				for (int coluna = 0; coluna < 8; coluna++) {
					for (int movimentos = 0; movimentos < 8; movimentos++) {
						int novaColuna = coluna + movimentosColuna[movimentos];
						int novaLinha = linha + movimentosLinha[movimentos];
						if (0 <= novaLinha && novaLinha < 8 && 0 <= novaColuna && novaColuna < 8) {
							matriz2[novaLinha][novaColuna] += matriz1[linha][coluna] / 8.0;
						}
					}
				}
			}
			matriz1 = matriz2;
		}
		double prob = 0.0;
		for (double[] linha : matriz1) {
			for (double valor : linha) {
				prob += valor;	
			}
		}
		return prob;
	}
}
