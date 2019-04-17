package br.com.github.jcestaro.testes.facade;

public class GerenciamentoUsuarioFacade {

    private String nome;
    private String email;
    private int idade;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    public GerenciamentoUsuarioFacade(String nome, String email, int idade, String rua, int numero, String bairro, String cidade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;

        cadastrarNovoDinheiro();
    }

    void cadastrarNovoDinheiro(){
        Usuario user = new Usuario(nome, email,idade);
        Endereco address = new Endereco(rua,numero,bairro, cidade);

        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println(user + System.lineSeparator()+address);
    }







}
