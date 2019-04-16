package br.com.github.jcestaro.testes.memento;

public class CandidatoMemento {

    protected String estadoCandidato;

    public CandidatoMemento(String nomeCandidato) {
        estadoCandidato = nomeCandidato;
    }

    public String getCandidato() {
        return estadoCandidato;
    }

    @Override
    public String toString() {
        return "" + estadoCandidato;
    }
}
