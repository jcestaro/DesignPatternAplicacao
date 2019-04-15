package br.com.github.jcestaro.testes.Decorator;

public class SorveteDecorator implements Sorvete {

	Sorvete sorveteNovo;

	@Override
	public void fazerSorvete() {
		System.out.println("Sorvete simples pronto!");
	}
}
