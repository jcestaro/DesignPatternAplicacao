package br.com.github.jcestaro.testes.interpreter;

public class Multiplicacao implements Operador {

	private Operador esquerda;
	private Operador direita;

	public Multiplicacao(Operador esquerda, Operador direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int interpreta() {
		return this.esquerda.interpreta() * this.direita.interpreta();
	}
}
