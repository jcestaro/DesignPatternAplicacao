package br.com.github.jcestaro.testes.adapter;

public class CaboTipoC {

        private boolean conexao = false;

        public boolean conectaNoCelular(){
            System.out.println("Cabo tipo C Conectado na entrada tipo C");
            return conexao = true;
        }

    @Override
    public String toString() {
        return "CaboTipoC{" +
                "conexao=" + conexao +
                '}';
    }
}
