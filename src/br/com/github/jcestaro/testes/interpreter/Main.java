package br.com.github.jcestaro.testes.interpreter;

public class Main {

	public static void main(String[] args) {
		Numero numero5 = new Numero(5);
		Numero numero20 = new Numero(20);
		Numero numero25 = new Numero(25);
		Numero numero18 = new Numero(18);

		Operador soma = new Soma(numero5, numero20);
		Operador subtracao = new Subtracao(numero25, numero18);

		System.out.println("O resultado da operação de " + numero5 + " + " + numero20 + " é: " + soma.interpreta());
		System.out.println("O resultado da operação de " + numero25 + " - " + numero18 + " é: " + subtracao.interpreta());

		Operador multiplicacao = new Multiplicacao(soma, subtracao);

		System.out.println("O resultado da operação de " + numero5 + " + " + numero20 + " * " + numero25 + " - " + numero18 + " é: " + multiplicacao.interpreta());

		Operador divisao = new Divisao(multiplicacao, soma);

		System.out.println("O resultado da operação de " + multiplicacao.interpreta() + " / " + soma.interpreta() + " é: " + divisao.interpreta());
	}
}
