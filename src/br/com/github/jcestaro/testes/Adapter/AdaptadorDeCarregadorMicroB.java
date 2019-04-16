package br.com.github.jcestaro.testes.Adapter;

public class AdaptadorDeCarregadorMicroB extends CelularEntradaMicroB {
    private CaboTipoC caboC;
    private CelularEntradaMicroB celular = new CelularEntradaMicroB();

    public AdaptadorDeCarregadorMicroB(CaboTipoC caboC) {
        this.caboC = caboC;
    }

    public void CarregaCelularMicroB(){
        if (caboC.conectaNoCelular()){
            this.celular.conectarCaboMicroB();
        }
        else {
            System.out.println("adatador incompativel!");
        }
    }
}
