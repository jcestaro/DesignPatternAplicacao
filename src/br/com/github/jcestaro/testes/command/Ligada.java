package br.com.github.jcestaro.testes.command;

public class Ligada implements EstadoLuz {

    @Override
    public void exibeEstado() {
        System.out.println("[Luz Ligada]");
        try{
            Thread.sleep(500);
            System.out.println("Desligando...");
            Thread.sleep(2000);
            System.out.println("[Luz desligada]");
            System.out.println(

            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
