package br.com.github.jcestaro.testes.State;

public class TvDesligada implements Estado {

	@Override
	public void exibeEstado() {
		System.out.println("TV está Desligada.");
	}
}
