package br.com.hotel.hotelzao.modelo;

public class Hospede {

    private String nome;
    private String cpf;
    private String profissao;
    private int idade;
    private Endereco endereço;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }

    public Endereco getEndereço() {
        return endereço;
    }

}
