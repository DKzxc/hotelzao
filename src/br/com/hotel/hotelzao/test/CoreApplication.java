package br.com.hotel.hotelzao.test;

import java.io.IOException;

public class CoreApplication {

    // ----------------------------
    // Funções Utéis
    // ----------------------------
    public static void imprimirNoConsole(String textoParaMostrar) {
        System.out.println(textoParaMostrar);
    }

    public static String obterInputDoUsuario() {
        String textoDigitado = "";
        try {
            textoDigitado = Application.userInput();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textoDigitado;
    }
    // ----------------------------

    /**
     * TODO
     * Implementar o código para cadastrar um novo hospede
     */
    public static void cadastrarNovoHospede() {

    }

    /**
     * TODO
     * Implementar o código para fazer a listagem dos quartos
     * Esse método deve imprimir no console todos os quartos do hotel
     */
    public static void listarQuartos() {

    }

    /**
     * TODO
     * Implementar o código para fazer check-in de um cliente cadastrado em um quarto.
     */
    public static void checkIn() {

    }

    /**
     * TODO
     * Implementar o código para fazer check-out de um cliente que já estava hospedado
     */
    public static void checkOut() {

    }
}
