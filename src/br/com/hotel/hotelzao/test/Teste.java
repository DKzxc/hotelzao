package br.com.hotel.hotelzao.test;

import br.com.hotel.hotelzao.modelo.Cliente;
import br.com.hotel.hotelzao.modelo.Endereco;

public class Teste {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Endereco endereco = new Endereco();

        cliente.setNome("Tadeu Del Grandi");
        cliente.setCpf("22.222.222-22");
        cliente.setIdade(24);
        cliente.setProfissao("Tatoador");

        cliente.setEndereco(endereco);
        endereco.setEstado("SP");

        cliente.getEndereco().setCidade("Boituva");
        cliente.getEndereco().setBairro("Vila Natal");
        cliente.getEndereco().setNomeRua("Rua Deiz pras Onzi");

        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getProfissao());


        System.out.println(cliente.getEndereco().getNomeRua());

    }


}
