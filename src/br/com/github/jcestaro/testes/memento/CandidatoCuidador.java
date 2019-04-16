package br.com.github.jcestaro.testes.memento;

import java.util.ArrayList;

public class CandidatoCuidador {

    protected ArrayList<CandidatoMemento> candidatos;

    public CandidatoCuidador() {
        candidatos = new ArrayList<>();
    }

    public void adicionarCandidato(CandidatoMemento novoCandidato) {
        candidatos.add(novoCandidato);
    }

    public CandidatoMemento getUltimoEstadoSalvo() {
        if (candidatos.size() <= 0) {
            return new CandidatoMemento("");
        }
        CandidatoMemento estadoSalvo = candidatos.get(candidatos.size() - 1);
        candidatos.remove(candidatos.size() - 1);
        return estadoSalvo;
    }
}
