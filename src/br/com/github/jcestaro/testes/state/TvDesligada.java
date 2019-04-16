package br.com.github.jcestaro.testes.state;

public class TvDesligada implements Estado {

	@Override
	public void exibeEstado() {
		System.out.println("TV está Desligada.");
	}
}
