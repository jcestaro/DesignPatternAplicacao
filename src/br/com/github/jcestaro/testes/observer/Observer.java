package br.com.github.jcestaro.testes.observer;

public class Observer {

	public static void main(String[] args) {

		Avo avo = new Avo();
		Neto neto  = new Neto();

		avo.addObserver(neto);

		try{
			avo.exibirSecaoExportes();
			Thread.sleep(1000);
			avo.exibirSecaoReceitas();
			Thread.sleep(1000);
			avo.exibirSecaoPolitica();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
