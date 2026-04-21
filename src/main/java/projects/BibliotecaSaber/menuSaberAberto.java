package projects.BibliotecaSaber;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class menuSaberAberto {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<informacoesLeitor> listaDeLeitores = new ArrayList<>();
    informacoesLeitor infoLeitor = new informacoesLeitor();

    public int exibirMenu() {
        ArrayList<String> opcoesUsuario = new ArrayList<>();
        opcoesUsuario.add("\n--- MENU PRINCIPAL ---");
        opcoesUsuario.add("1. Verificar livros em estoque");
        opcoesUsuario.add("2. Consultar emprestimo");
        opcoesUsuario.add("3. Verificar perfil de leitor");
        opcoesUsuario.add("4. Cadastro Leitor");
        opcoesUsuario.add("Escolha uma opção");

        for (String opcaoMenu : opcoesUsuario){
            System.out.println(opcaoMenu);
        }

        int opcao =- 1; // Inicializa com um valor padrão

        try { //utilizando o TRCATCH para controle de fluxo
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) { //Utilizando o switch-case do que o IF pois o switch case e mais otimizado
                case 1:
                    System.out.println("Verificando...");
                    break;
                case 2:
                    System.out.println("Consultando coisas...");
                    break;
                case 3:
                    System.out.println("Indo pro perfil...");
                    break;
                case 4:
                    infoLeitor.cadastroLeitor(sc, listaDeLeitores);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Erro !!! \n Tente utilizar 0, 1, 2 ou 3");
                    break;
            }
        } catch (InputMismatchException e) { //Utilizando o ImputMismatch para caso o usuario digita algo fora do esperado
            System.out.println("Erro: Digite apenas números!");
            sc.next();
            sc.nextLine();
            opcao =- 1;
        }

        return opcao;
    }
}