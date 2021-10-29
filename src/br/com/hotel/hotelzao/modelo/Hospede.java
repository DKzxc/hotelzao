package br.com.hotel.hotelzao.modelo;

public class Hospede {

    private String nomeCompleto;
    private String cpf;
    private String profissao;
    private int idade;
    private Endereco endereco;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
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

    public void setEndereço(Endereco endereco) {
        this.endereço = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
