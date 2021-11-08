package br.com.hotel.hotelzao.model;

public class Guest {

    private String fullName;
    private String document;
    private String occupation;
    private int age;
    private Adress adress;
    private static int totalGuest = 0;

    public static int getTotalGuest() {
        return totalGuest;
    }

    public Guest(String fullName, String document, String occupation, int age, Adress adress) {
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



//criamos um metodo pra imprimir tudo de uma vez
    public void mostrarInformacoes () {

        System.out.println(this.getFullName());
        System.out.println(this.getAge());
        System.out.println(this.getOccupation());
        System.out.println(this.getDocument());
        System.out.println("Endereço:");
        System.out.println(this.adress.getStreet());
        System.out.println(this.adress.getNumber());
        System.out.println(this.adress.getCity());
        System.out.println(this.adress.getState());
        System.out.println("---------------------");

    }

    //refactor Extract Method, encapsulamo dois News em um método la na Classe TestGuest, que ai copiei e colei
    //na classe Guest. Entao pra ficar mais facil atribuir os parametros, seleciona o método em
    //cinza e "Refactor/ Introduce Parameter. Pra usar, só dar New no método create
    public static Guest create(String fullName, String document, String street) {
        Adress endereco = new Adress(street,400,"Mezopotamia","Acre");
        Guest g1 = new Guest(fullName, document,"pedrerao",29,endereco);
        return g1;
    }

}
