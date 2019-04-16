package br.com.github.jcestaro.testes.observer;

import java.util.Observable;
import java.util.Observer;

public class Neto implements Observer, Revista {
    @Override
    public void exibirSecaoReceitas() {
        System.out.println("Neto abre a seção de Receitas!");
    }

    @Override
    public void exibirSecaoExportes() {
        System.out.println("Neto abre a seção de Esportes!");
    }

    @Override
    public void exibirSecaoPolitica() {
        System.out.println("Neto abre a seção de Política!");
    }

    @Override
    public void update(Observable obj, Object arg) {
        Avo avoObservado = (Avo) obj;
        String acao = String.valueOf(arg);

        if (acao.equals("Receitas")){
            this.exibirSecaoReceitas();
        }
        else if (acao.equals("Esportes")){
            this.exibirSecaoExportes();
        }
        else if (acao.equals("Politica")){
            this.exibirSecaoPolitica();
        }
    }
}
