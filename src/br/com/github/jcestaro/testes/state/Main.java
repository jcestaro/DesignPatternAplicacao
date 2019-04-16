package br.com.github.jcestaro.testes.state;

public class Main {

	public static void main(String[] args) {
		TV tv = new TV();
		Estado tvDesligada = new TvDesligada();
		Estado tvLigada = new TvLigada();

		tv.setEstadoDaTV(tvLigada);
		tv.exibeEstado();

		tv.setEstadoDaTV(tvDesligada);
		tv.exibeEstado();
	}
}
