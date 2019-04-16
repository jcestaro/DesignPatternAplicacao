package br.com.github.jcestaro.testes.decorator;

public class SorveteComFruta extends SorveteDecorator {

	@Override
	public void fazerSorvete() {
		sorveteNovo = new SorveteComFruta();

		System.out.println("Sorvete com fruta pronto!");
	}
}
