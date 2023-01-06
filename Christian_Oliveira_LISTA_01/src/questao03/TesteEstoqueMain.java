package questao03;

public class TesteEstoqueMain {
	public static void main(String[] args) {
	}
}
//3) Estoque (pontuação 40 pontos)
//Escreva as seguintes classes em Java. Você tem a liberdade de definir os tipos
//dos atributos, então pense bem para usar um tipo adequado ao propósito (ex.:
//atributo com o nome ‘produto’ deve ser do tipo Produto que você definiu):
//a) Produto:
//● Deverá conter os atributos privados: codigo, nome.
//● Deverá conter um construtor sem parâmetros e outro contendo os
//parâmetros (codigo, nome).
//● Deverá conter o método:
//
//○ Método que altera o nome do produto
//■ mudarNome(nome)
//
//b) Estoque:
//● Deverá conter os atributos privados: produto, qtdAtual e qtdMinima.
//● Deverá conter um construtor sem parâmetros e outro contendo os
//parâmetros (produto, qtdAtual e qtdMinima).
//● Deverá conter os métodos:
//○ Método que altera o valor da quantidade mínima
//■ mudarQtdMinima(qtdMinima)
//○ Método soma ao valor atual o valor passado
//■ reporEstoque(qtd)
//○ Método subtrai do valor atual o valor passado
//■ darBaixa(qtd)
//○ Método que escreve os valores atuais dos atributos
//■ relatorio()
//
//c) Escreva uma classe TesteEstoqueMain que vai realizar as seguintes
//operações:
//● Instanciar os objetos:
//○ produto01
//■ codigo: 1
//■ nome: Teclado
//○ produto02
//■ codigo: 2
//■ nome: Mouse
//○ estoque1
//■ produto: produto01
//■ qtdAtual: 20
//■ qtdMinima: 15
//○ estoque2
//
//■ produto: produto02
//■ qtdAtual: 30
//■ qtdMinima: 10
//d) Execute as operações na seguinte ordem:
//
//● Dar baixa em 10 unidades de estoque1;
//● Fazer a reposição de 19 unidades de estoque2;
//● Executar o método relatorio das instâncias estoque1 e estoque2;
//● Mudar o nome do produto01 para "Teclado virtual";
//● Executar o método relatorio da instância de estoque responsável pelo
//atributo produto01;