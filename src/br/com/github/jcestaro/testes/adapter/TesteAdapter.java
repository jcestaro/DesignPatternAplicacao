package br.com.github.jcestaro.testes.adapter;

public class TesteAdapter {

    public static void main(String[] args) {
        CaboTipoC caboC = new CaboTipoC();

        AdaptadorDeCarregadorMicroB adaptador = new AdaptadorDeCarregadorMicroB(caboC);
        adaptador.CarregaCelularMicroB();
    }
}
