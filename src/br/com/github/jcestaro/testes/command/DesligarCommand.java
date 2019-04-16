package br.com.github.jcestaro.testes.command;

public class DesligarCommand implements Command {


    @Override
    public void executa(EstadoLuz estado) {
        estado.exibeEstado();
    }
}
