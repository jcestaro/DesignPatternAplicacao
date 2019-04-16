package br.com.github.jcestaro.testes.decorator;

import java.util.ArrayList;
import java.util.List;

public class Decorator {

	public static void main(String[] args) {
		List<Sorvete> sorveteria = new ArrayList<>();

		sorveteria.add(new SorveteSimples());
		sorveteria.add(new SorveteComNutella());
		sorveteria.add(new SorveteComFruta());

		sorveteria.forEach(sorvete -> sorvete.fazerSorvete());
	}
}
