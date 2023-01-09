package questao05;

public class Questao05 {

}

//5) Classes e relacionamentos (pontuação total 160 pontos)
//Com base no diagrama UML abaixo, implemente as classes em Java.
//
//● (10 pts) Vacina
//○ implemente os métodos get/set para cada atributo
//○ valores possíveis para o atributo nome:
//■ CORONAVAC
//■ OXFORD
//● (20 pts) Pessoa
//○ implemente os métodos get/set para cada atributo
//○ método calcularIdade(): retorna a idade da Pessoa com base no atributo
//dataNascimento
//● (10 pts) RegistroVacina:
//○ implemente os métodos get/set para cada atributo
//○ valores possíveis para o atributo grupo:
//■ IDOSOS
//■ TRABALHADORES DA SAÚDE
//■ OUTRAS PRIORIDADES
//○ valores possíveis para o atributo dose: 1 ou 2
//○ valores possíveis para o atributo local:
//■ DRIVE THRU - UFRPE - UNIVERSIDADE RURAL
//■ DRIVE THRU GERALDÃO
//■ CENTRO DE VACINAÇÃO PARQUE DE EXPOSIÇÃO
//■ CENTRO DE VACINAÇÃO COMPAZ ARIANO SUASSUNA
//■ DRIVE THRU PARQUE DE EXPOSIÇÃO
//■ DRIVE THRU ARRUDA
//● (80 pts) RelacaoVacinados:
//○ implemente os métodos get/set para o atributo vacinados
//
//○ método adicionar(RegistroVacina registro): adiciona um registro de Vacina
//ao objeto RelacaoVacinados
//○ método calcularTotalVacinadosAcimaDe(idade:int): efetua a soma de todas
//as pessoas acima da idade informada como parâmetro que foram
//vacinadas nas 2 doses
//○ metodo listarPessoasQueNãoTomaram2aDose(): void
//○ listarPessoasQueNãoTomaram2aDose(): imprima as pessoas que só
//tomaram a 1a dose e indique a data da próxima vacina somando 21 dias à
//data em que a mesma tomou a 1a dose
//
//OBS: Siga as tabulações e alinhamentos conforme exemplo. Observe que os valores
//numéricos estão alinhados à direita, enquanto os textuais estão alinhados à esquerda.
//Use o método System.out.printf(...) para atingir esse resultado de forma rápida
//e organizada. Vide https://bit.ly/2L6oIzV ou https://bit.ly/37GEvxb. Vídeo com exemplos
//de printf: https://bit.ly/39OKr9R.
//
//Tabela 1. Exemplo de impressão dos registros de vacina das pessoas que não
//
//tomaram a 2a dose
//
//CPF | Nome | Idade | Data Indicada p. 2a Dose
//-------------------------------------------------------------
//0333787383 | José Maria | 67 | 13/05/2021
//3830333787 | Maria José | 69 | 16/05/2021
//7870333383 | José Silva | 71 | 15/05/2021
//3787303383 | Maria Silva | 66 | 21/05/2021
//-------------------------------------------------------------
//Total de vacinados acima de 65 anos: 5
//Total de vacinados que não tomaram a 2a. dose: 4
//Total de vacinados que tomaram a 2a. dose: 1
//● (40 pts) Classe contendo método main:
//A. Escreva uma classe TesteVacinaMain que vai realizar as seguintes operações:
//○ Instanciar 5 objetos do tipo Pessoa contendo os dados apresentados na
//Tabela 1
//○ Instanciar 2 objetos do tipo Vacina para representar os dois possíveis
//valores dos atributo mencionados anteriormente (CORONAVAC, OXFORD)
//○ Instanciar 6 objetos do tipo RegistroVacina contendo os dados
//apresentados na Tabela 1 e associando-os diretamente aos objetos do tipo
//Pessoa e Vacina criados nos itens anteriores através da invocação de
//métodos do tipo set. Faça com que uma das pessoas instanciadas tenha
//dois objetos do tipo RegistroVacina associados, referentes às duas doses
//○ Instanciar 1 objeto do tipo RelacaoVacinados e adicione os 6 objetos do
//tipo RegistroVacina mencionados anteriormente
//
//B. Uma vez instanciados os objetos do Item A:
//
//● Crie um método que imprime os dados da Tabela 1 e execute-o no final do
//método main. Lembre-se que, para imprimir todos esses dados, você
//precisa implementar corretamente todos métodos da classe
//RelacaoVacinados