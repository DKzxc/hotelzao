package br.com.hotel.hotelzao.model;

public class Guest {

    private String fullName;
    private String document;
    private String occupation;
    private int age;
    private Adress adress;
    private static int totalGuest = 0;

    public Guest(String fullName, String document, String occupation, int age,Adress adress) {
        Guest.totalGuest++;

        this.fullName = fullName;
        this.document = document;
        this.occupation = occupation;
        this.age = age;
        this.adress = adress;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
