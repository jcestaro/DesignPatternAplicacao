package br.com.github.jcestaro.testes.memento;

public class Main {

    public static void main(String[] args) {
        Candidato candidato = new Candidato();

        candidato.adicionarCandidato("Jon Snow"+System.lineSeparator());
        candidato.adicionarCandidato("Daenerys Targaryen"+System.lineSeparator());
        candidato.adicionarCandidato("Aria Stark"+System.lineSeparator());
        candidato.adicionarCandidato("Jamie Lannister"+System.lineSeparator());
        candidato.adicionarCandidato("Sansa Stark"+System.lineSeparator());
        candidato.mostrarCandidatosVivos();

        System.out.println("Mata o primeiro : ");
        candidato.matarUltimoCandidato();
        candidato.mostrarCandidatosVivos();

        System.out.println("Mata o segundo : ");
        candidato.matarUltimoCandidato();
        candidato.mostrarCandidatosVivos();

        System.out.println("Mata o terceiro : ");
        candidato.matarUltimoCandidato();
        candidato.mostrarCandidatosVivos();

        System.out.println("Mata o quarto : ");
        candidato.matarUltimoCandidato();

        System.out.println("Rei dos tronos : ");
        candidato.mostrarCandidatosVivos();
    }
}
