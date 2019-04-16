package br.com.github.jcestaro.testes.state;

public class TvLigada implements Estado {

	@Override
	public void exibeEstado() {
		System.out.println("TV está Ligada.");
	}
}
