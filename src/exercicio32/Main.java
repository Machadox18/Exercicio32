package exercicio32;

public class Main {
    public static void main(String[] args) {
    empresa empresa = new empresa();
    empresa.solicitarDados();
    empresa.imprimirDados();

    System.out.println("\n-----------------------------\n");

    restaurante restaurante = new restaurante();
    restaurante.solicitarDados();
    restaurante.imprimirDados();
    }
}


