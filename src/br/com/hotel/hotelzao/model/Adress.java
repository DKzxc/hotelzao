package br.com.hotel.hotelzao.model;

public class Adress {

    private String street;
    private int number;
    private String city;
    private String state;

    public Adress(String street,int number,String city,String state){

        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
