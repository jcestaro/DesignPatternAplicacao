package br.com.github.jcestaro.testes.facade;

public class Endereco {

    private String Rua;
    private int numero;
    private String bairro;
    private String cidade;

    public Endereco(String rua, int numero, String bairro, String cidade) {
        Rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getRua() {
        return Rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "Rua='" + Rua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
