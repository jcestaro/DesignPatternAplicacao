package br.com.github.jcestaro.testes.command;

public class LigarCommand implements Command {

    @Override
    public void executa(EstadoLuz estado) {
        estado.exibeEstado();
    }
}
