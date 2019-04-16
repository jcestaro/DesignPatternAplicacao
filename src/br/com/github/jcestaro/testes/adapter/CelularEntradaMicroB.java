package br.com.github.jcestaro.testes.adapter;

public class CelularEntradaMicroB {

    public void conectarCaboMicroB (){
        try{
            System.out.println("Celular carregando...");
            Thread.sleep(1500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
