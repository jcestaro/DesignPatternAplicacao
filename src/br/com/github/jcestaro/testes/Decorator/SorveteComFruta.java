package br.com.github.jcestaro.testes.Decorator;

public class SorveteComFruta extends SorveteDecorator {

	@Override
	public void fazerSorvete() {
		sorveteNovo = new SorveteComFruta();

		System.out.println("Sorvete com fruta pronto!");
	}
}
