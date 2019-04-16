package br.com.github.jcestaro.testes.decorator;

public class SorveteComNutella extends SorveteDecorator {

	@Override
	public void fazerSorvete() {
		sorveteNovo = new SorveteComNutella();

		System.out.println("Sorvete com nutella pronto!");
	}
}
