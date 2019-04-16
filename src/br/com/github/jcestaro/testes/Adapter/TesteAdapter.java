package br.com.github.jcestaro.testes.Adapter;

public class TesteAdapter {

    public static void main(String[] args) {
        CaboTipoC caboC = new CaboTipoC();

        AdaptadorDeCarregadorMicroB adaptador = new AdaptadorDeCarregadorMicroB(caboC);
        adaptador.CarregaCelularMicroB();
    }
}
