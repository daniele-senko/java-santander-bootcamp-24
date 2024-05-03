###Declaração de Variáveis

Estrutura padrão
<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

Exemplos abaixo: 
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500. //recomendado é utilizar 2500 

<stringo>Atenção:</strong> existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:

public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
	}
}
