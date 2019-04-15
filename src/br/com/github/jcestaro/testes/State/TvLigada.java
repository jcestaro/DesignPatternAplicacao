package br.com.github.jcestaro.testes.State;

public class TvLigada implements Estado {

	@Override
	public void exibeEstado() {
		System.out.println("TV está Ligada.");
	}
}
