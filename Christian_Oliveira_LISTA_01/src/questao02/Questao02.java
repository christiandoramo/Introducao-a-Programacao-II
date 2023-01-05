package questao02;

public class Questao02 {
	public static void main(String[] args) {
		Solucao sol = new Solucao();
		System.out.println(sol.buddyStrings("ab", "ab"));
	}
}

//* 2) Algoritmo simples em Java 1 (pontuação 40 pontos)
//Dadas duas strings A e B com todas as letras em minúsculas, retorne ‘true’ se, e somente se, for
//possível trocar duas letras em A de tal forma que o resultado seja igual a B. Essa troca não
//remove, adiciona ou substitui nenhuma letra e as letras de A a serem trocadas não precisam ser
//consecutivas.
//Example 1:
//Input: A = "ab", B = "ba"
//Output: true
//Example 2:
//Input: A = "ab", B = "ab"
//Output: false
//Example 3:
//Input: A = "aa", B = "aa"
//Output: true
//Example 4:
//Input: A = "aaaaaaabc", B = "aaaaaaacb"
//Output: true
//Example 5:
//Input: A = "", B = "aa"
//Output: false
//Aqui segue um pequeno código inicial:
//class Solution:
//def buddyStrings(String A, String B):
//# Fill this in.
//Solution test = new Solution();
//print test.buddyStrings('aaaaaaabc', 'aaaaaaacb')
//# True
//print test.buddyStrings('aaaaaabbc', 'aaaaaaacb')
//# False
