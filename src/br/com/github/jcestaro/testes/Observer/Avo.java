package br.com.github.jcestaro.testes.Observer;

import java.util.Observable;

public class Avo extends Observable implements Revista {
    private String acao = "";

    private void mudaEstado() {
        setChanged();
        notifyObservers(acao);
    }

    @Override
    public void exibirSecaoReceitas() {
        acao = "Receitas";
        System.out.println("Avo abre a seção de Receitas!");
        this.mudaEstado();
    }
    @Override
    public void exibirSecaoExportes() {
        acao = "Esportes";
        System.out.println("Avo abre a seção de Esportes!");
        this.mudaEstado();
    }

    @Override
    public void exibirSecaoPolitica() {
        acao = "Politica";
        System.out.println("Avo abre a seção de Política!");
        this.mudaEstado();
    }
}
