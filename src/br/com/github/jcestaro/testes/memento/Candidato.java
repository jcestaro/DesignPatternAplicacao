package br.com.github.jcestaro.testes.memento;

public class Candidato {

    protected String candidato;
    CandidatoCuidador candidatoCuidador;

    public Candidato() {
        candidatoCuidador = new CandidatoCuidador();
        candidato = new String();
    }

    public void adicionarCandidato(String novoCandidato) {
        candidatoCuidador.adicionarCandidato(new CandidatoMemento(candidato));
        candidato += novoCandidato;
    }

    public void matarUltimoCandidato() {
        candidato = candidatoCuidador.getUltimoEstadoSalvo().getCandidato();
    }

    public void mostrarCandidatosVivos() {
        System.out.println(candidato);
    }
}
