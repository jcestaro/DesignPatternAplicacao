package br.com.github.jcestaro.testes.command;

public class Desligada implements EstadoLuz {
    @Override
    public void exibeEstado() {
        System.out.println("[Luz Desligada]");
        try{
            Thread.sleep(500);
            System.out.println("Ligando...");
            Thread.sleep(2000);
            System.out.println("[Luz ligada]");
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
