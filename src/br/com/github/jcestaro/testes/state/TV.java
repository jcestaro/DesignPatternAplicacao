package br.com.github.jcestaro.testes.state;

public class TV implements Estado {

	private Estado estadoDaTV;

	public void setEstadoDaTV(Estado estadoDaTV) {
		this.estadoDaTV = estadoDaTV;
	}

	@Override
	public void exibeEstado() {
		this.estadoDaTV.exibeEstado();
	}
}
