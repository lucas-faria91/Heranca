package Atividade01;

public class Pessoa {
    private String nome;
    private String sobrenome;

    // Construtor sem parâmetros
    public Pessoa() {
    }

    // Construtor com parâmetros
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Métodos get e set para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos get e set para sobrenome
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Método que retorna o nome completo
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}