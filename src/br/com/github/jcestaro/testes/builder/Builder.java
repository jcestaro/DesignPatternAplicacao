package br.com.github.jcestaro.testes.builder;

public class Builder {

	public static void main(String[] args) {
		Lanche lanche = new Lanche.Builder("Brioche")
				.hamburguer(2)
				.queijo(true)
				.tomate(true)
				.bacon(true)
				.alface(false)
				.build();

		System.out.println(lanche);
	}
}
