package br.com.github.jcestaro.testes.factory;

public class Main {

    public static void main(String[] args) {

        FactoryMembroFamilia membro1 = criaNovoMembroNaFabrica("Aria", "Stark");
        FactoryMembroFamilia membro2 = criaNovoMembroNaFabrica("Cersei", "lannister");
        FactoryMembroFamilia membro3 = criaNovoMembroNaFabrica("Rob", "Stark");
        FactoryMembroFamilia membro4 = criaNovoMembroNaFabrica("Sansa", "Stark");
        FactoryMembroFamilia membro5 = criaNovoMembroNaFabrica("Tyron", "lannister");

    }

    public static FactoryMembroFamilia criaNovoMembroNaFabrica(String nome, String familia){
        String novoNome = nome;
        FactoryMembroFamilia novoMembro = new FactoryMembroFamilia();
        novoMembro.criaNovoMembro(familia, novoNome);
        return novoMembro;
    }
}
