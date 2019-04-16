package br.com.github.jcestaro.testes.interpreter;

public class Numero implements Operador {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int interpreta() {
		return this.numero;
	}

	@Override
	public String toString() {
		return "" + numero;
	}
}
