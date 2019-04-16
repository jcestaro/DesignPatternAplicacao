package br.com.github.jcestaro.testes.factory;

public class FactoryMembroFamilia {

    public void criaNovoMembro(String nomeFamilia, String nome){
        if(nomeFamilia.equalsIgnoreCase("stark")){

            MembroFamiliaStark novoStark = new MembroFamiliaStark(nome);
            exibeNovoMembro(novoStark.nome, novoStark.sobrenome, novoStark.brasao);

        }else if(nomeFamilia.equalsIgnoreCase("lannister")){
            MembroFamiliaLannister novoLannister = new MembroFamiliaLannister(nome);
            exibeNovoMembro(novoLannister.nome, novoLannister.sobrenome, novoLannister.brasao);
        }
    }

    private void exibeNovoMembro(String nome, String sobrenome, String brasao){
        System.out.println("Novo membro : " + nome + " " + sobrenome + ", brasão : " + brasao);
    }
}
