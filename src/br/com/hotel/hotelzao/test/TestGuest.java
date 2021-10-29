package br.com.hotel.hotelzao.test;

import br.com.hotel.hotelzao.model.Adress;
import br.com.hotel.hotelzao.model.Guest;

public class TestGuest {

    public static void main(String[] args) {

        Adress endereco = new Adress("Rua jiraya",400,"Mezopotamia","Acre");
        Guest g1 = new Guest("Jao","111.111.111-11","pedrerao",29,endereco);

        System.out.println(g1.getFullName());
        System.out.println(g1.getAge());
        System.out.println(g1.getOccupation());
        System.out.println(g1.getDocument());
        System.out.println("---------------------");
        System.out.println(g1.getAdress().getStreet());
        System.out.println(g1.getAdress().getNumber());
        System.out.println(g1.getAdress().getCity());
        System.out.println(g1.getAdress().getState());
    }

}
