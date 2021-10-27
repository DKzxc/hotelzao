package br.com.hotel.hotelzao.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static final int COMANDO_CADASTRAR_NOVO_HOSPEDE = 1;
    public static final int COMANDO_LISTAR_QUARTOS = 2;
    public static final int COMANDO_CHECK_IN = 3;
    public static final int COMANDO_CHECK_OUT = 4;
    public static final int COMANDO_EXIT = 5;

    public static void main(String[] args) throws InterruptedException, IOException {

        // Loop principal do programa
        while (true) {
            imprimeMenuPrincipal();
            String comando = userInput();

            if (verificaSeComandoEhValido(comando) == false) {
                System.out.println("Comando Inválido");
                esperarUsuarioTeclarEnter();
            } else {
                int numeroComando = Integer.parseInt(comando);

                if (numeroComando == COMANDO_CADASTRAR_NOVO_HOSPEDE) {
                    CoreApplication.cadastrarNovoHospede();
                } else if (numeroComando == COMANDO_LISTAR_QUARTOS) {
                    CoreApplication.listarQuartos();
                } else if (numeroComando == COMANDO_CHECK_IN) {
                    CoreApplication.checkIn();
                } else if (numeroComando == COMANDO_CHECK_OUT) {
                    CoreApplication.checkOut();
                } else if (numeroComando == COMANDO_EXIT) {
                    break;
                }
            }

            limpaTela();
            Thread.sleep(100);
        }

        System.err.println("Até logo...");
    }

    private static void esperarUsuarioTeclarEnter() throws IOException {
        userInput();
    }

    private static boolean verificaSeComandoEhValido(String comando) {
        try {
            Integer.parseInt(comando);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static String userInput() throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        // Reading data using readLine
        return reader.readLine();
    }

    private static void imprimeMenuPrincipal() throws InterruptedException {
        System.out.println("-------------------------------------------");
        System.out.println("\tBem vindo ao SysHotel ");
        System.out.println("-------------------------------------------");
        System.out.println(" O que você deseja fazer?");
        System.out.println("\t1- Cadastrar novo Hóspede");
        System.out.println("\t2- Verificar lista de Quartos disponiveis");
        System.out.println("\t3- Fazer Check-in");
        System.out.println("\t4- Fazer Check-out");
        System.out.println("\t5- Sair");
        System.out.print("Digite o número do comando: ");
        System.out.flush();
        Thread.sleep(10);
    }

    private static void limpaTela() throws IOException {
        System.out.println("\n\n\n\n\n\n\n\n\n");
    }
}
