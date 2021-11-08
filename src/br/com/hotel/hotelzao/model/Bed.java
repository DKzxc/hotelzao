package br.com.hotel.hotelzao.model;

public class Bed {

    private String king; //"Bed - King Size"
    private String superKing; //"Bed - Super King Size"
    private String single; //"Bed - Single"

    public Bed () {
        king = "Bed - King Size";
        superKing = "Bed - Super King Size";
        single = "Bed - Single";

    }

    public String getKing() {
        return king;
    }

    public String getSuperKing() {
        return superKing;
    }

    public String getSingle() {
        return single;
    }
}
