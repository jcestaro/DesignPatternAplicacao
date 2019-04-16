package br.com.github.jcestaro.testes.command;

public class teste {

    public static void main(String[] args) {
        Desligada off = new Desligada();
        Ligada on = new Ligada();

        DesligarCommand desligar = new DesligarCommand();
        desligar.executa(on);

        LigarCommand ligar = new LigarCommand();
        ligar.executa(off);


    }
}
