package br.com.github.jcestaro.testes.Decorator;

public class SorveteComNutella extends SorveteDecorator {

	@Override
	public void fazerSorvete() {
		sorveteNovo = new SorveteComNutella();

		System.out.println("Sorvete com nutella pronto!");
	}
}
