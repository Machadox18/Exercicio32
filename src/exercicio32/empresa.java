package exercicio32;

import java.util.Scanner;

public class empresa {
private String nome;
private String endereco;
private String cidade;
private String estado;
private String cep;
private String telefone;

Scanner scanner = new Scanner(System.in);
public empresa() {
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.telefone = "";
        }

        public empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
                this.nome = nome;
                this.endereco = endereco;
                this.cidade = cidade;
                this.estado = estado;
                this.cep = cep;
                this.telefone = telefone;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getEndereco() {
                return endereco;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        public String getCidade() {
                return cidade;
        }

        public void setCidade(String cidade) {
                this.cidade = cidade;
        }

        public String getEstado() {
                return estado;
        }

        public void setEstado(String estado) {
                this.estado = estado;
        }

        public String getCep() {
                return cep;
        }

        public void setCep(String cep) {
                this.cep = cep;
        }

        public String getTelefone() {
                return telefone;
        }

        public void setTelefone(String telefone) {
                this.telefone = telefone;
        }
public void solicitarDados() {
        System.out.println("Digite seu nome: ");
        this.nome = scanner.nextLine();
        System.out.println("Digite seu endereco: ");
        this.endereco = scanner.nextLine();
        System.out.println("Digite seu cidade: ");
        this.cidade = scanner.nextLine();
        System.out.println("Digite seu estado: ");
        this.estado = scanner.nextLine();
        System.out.println("Digite seu cep: ");
        this.cep = scanner.nextLine();
        System.out.println("Digite seu telefone: ");
        this.telefone = scanner.nextLine();
}
public void imprimirDados() {
        System.out.println("----- DADOS DE EMPRESAS -----");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Cep: " + cep);
        System.out.println("Telefone: " + telefone);
}







}





