package projects.BibliotecaSaber;

import java.util.ArrayList;
import java.util.Scanner;

public class informacoesLeitor {

        private String nomeLeitor;
        private String idadeLeitor;
        private String cpfLeitor;
        private String ISBN;


    public void cadastroLeitor(Scanner sc, ArrayList<informacoesLeitor> listaCadastros){
        boolean dadosValidos;
        do {
            dadosValidos = true;
            System.out.println("Insira seu nome:");
            this.nomeLeitor = sc.nextLine();
            for (int i = 0; i < this.nomeLeitor.length(); i++){
                char verificadorDigito = this.nomeLeitor.charAt(i);
                if (Character.isDigit(verificadorDigito)){
                    System.out.println("Número detectado no nome do leitor");
                    dadosValidos = false;
                    break;
                }
            }
        }while (!dadosValidos);
        do {
            System.out.println("Insira sua idade");
            this.idadeLeitor = sc.nextLine();
            for (int i = 0; i < idadeLeitor.length(); i++){
                char verificadorCaractere = idadeLeitor.charAt(i);
                if (Character.isLetter(verificadorCaractere)){
                    System.out.println("Caractere identificado...");
                    dadosValidos = false;
                    break;
                }
            }
        }while (!dadosValidos);
        do {
            System.out.println("Insira seu CPF:");
            this.cpfLeitor = sc.nextLine();
            if (this.cpfLeitor.length() != 11){ //verificando se tem 11 digitos
                System.out.println("Digite um CPF correto \n O correto é 11 caracteres !!!");
                dadosValidos = false;
                break;
            }
            int contadorNumerosCPF = 0;
            for (int i = 0; i < this.cpfLeitor.length(); i++){ //Validador CPF
                char verificadorNumero = this.cpfLeitor.charAt(i);
                if (Character.isDigit(verificadorNumero)){
                    contadorNumerosCPF++;
                }else {
                    System.out.println("Digitos identificados");
                    dadosValidos = false;
                    break;
                }
            }
            if (contadorNumerosCPF == 11){
                System.out.println("CPF cadastrado com sucesso");
            }else {
                System.out.println("\"Caracteres inválidos detectados no CPF !!!");
                dadosValidos = false;
                break;
            }
        }while (!dadosValidos);
        do {
            System.out.println("Insira seu ISBN:");
            this.ISBN = sc.nextLine();
            if (this.ISBN.length() != 4){ //Verificando se possui 4 digitos
                System.out.println("Codigo ISBN invalido \nTente novamente \nMaixmo 4 caracteres");
                break;
            }
            int contadorCaracteresISBN = 0;
            int contadorNumerosISBN = 0;
            for (int i = 0; i < this.ISBN.length(); i++){ //fazendo um laço for para percorrer todo o ISBN para verificar se possui 2 caracteres e 2 digitos
                char c = this.ISBN.charAt(i);
                if (Character.isLetter(c)){
                    contadorCaracteresISBN++;
                }else if (Character.isDigit(c)){
                    contadorNumerosISBN++;
                }

            }
            if (contadorCaracteresISBN == 2 && contadorNumerosISBN == 2){
                System.out.println("Seu ISBN é valido");
                System.out.println("Seu cadastro foi feito com sucesso!");
            }else {
                System.out.println("ISBN inválido tente novamente");
                dadosValidos = false;
                break;
            }
        }while (!dadosValidos);
        System.out.println("\n--- Cadastro Finalizado com Sucesso! ---");
        listaCadastros.add(this);
    }
    public String getNomeLeitor() { return nomeLeitor; }
    public String getCpfLeitor() { return  cpfLeitor; }
}
