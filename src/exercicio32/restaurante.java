package exercicio32;

import java.util.Scanner;

public class restaurante extends empresa {
private String comida;
private double pesoComida;

    Scanner scanner = new Scanner(System.in);
    public restaurante() {
    super();
    comida = "";
    pesoComida = 0.0;
    }

    public restaurante(String comida, double pesoComida, String nome, String endereco, String cidade, String estado, String cep, String telefone) {
        super(nome, endereco, cidade, estado, cep, telefone);
        this.comida = comida;
        this.pesoComida = pesoComida;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public double getPesoComida() {
        return pesoComida;
    }

    public void setPesoComida(double pesoComida) {
        this.pesoComida = pesoComida;
    }

    @Override
    public void solicitarDados() {
        super.solicitarDados();
        System.out.println("Qual a sua comida:");
        comida = scanner.nextLine();
        System.out.println("Qual o peso da sua comida:");
        pesoComida = scanner.nextDouble();
    }
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Sua comida: " + comida);
        System.out.println("Peso da sua comida: " + pesoComida);
    }


}



