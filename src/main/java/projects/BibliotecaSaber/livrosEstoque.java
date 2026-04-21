package projects.BibliotecaSaber;

import java.util.Scanner;

public class livrosEstoque {
    private String nomeLivro;
    private String autorLivro;
    private String ISBN;

    public void setISBN(String ISBN) {
        if (ISBN.length() <= 4) {
            this.ISBN = ISBN; //Utilizando o this para receber o valor do valor do usuario digitado
        } else {
            this.ISBN = ISBN.substring(0, 4); /*Aqui utilizando com o substring para cortar o texto do usuario
                                                e pegar apenas os 4 digitos dele e verificar se está correto ou existe*/
            System.out.println("Aviso ID incorreto ou excedeu o limite de caractereste \n(Limite = 4)");
        }
    }

    class Livro { //Criação de classe que vai receber os valores do uusario
        private String titulo;
        private String autor;
        private String id;

        public Livro(String id, String titulo, String autor) { //fluxo para verificação de valores
            this.id = id.length() > 4 ? id.substring(0, 4) : id;
            this.titulo = titulo;
            this.autor = autor;
        }
    }

    public boolean cadastroLivro(Scanner sc) { //Aqui criamos um metodo de cadastroLivro que vai receber os valores do usuario
        System.out.println(" --- Cadastro do Livro ---");

        System.out.println(" --- Insira o seu ID --- \n(Máximo 4 digitos)");
        // Ajuste sutil: usei sc.next() para o ID e sc.nextLine() logo após para limpar o buffer
        this.ISBN = sc.next();
        sc.nextLine(); // Aplicando o sc.nextLine para limpeza de buffer e para não dar bug

        if (ISBN.length() > 4) {
            System.out.println("Seu ISBN " + ISBN + " está incorreto, tente novamente");
            return false;
        }

        System.out.println(" --- Digite o titulo do livro --- ");
        this.nomeLivro = sc.nextLine(); //utilizando o this para falar "aqui e o resultado"

        System.out.println(" --- Digite o nome do autor --- ");
        this.autorLivro = sc.nextLine(); //utilizando o this para falar "aqui e o resultado"

        novoLivro(ISBN, nomeLivro, autorLivro); //Criando o modulo que vai ser chamado
        return true;
    }

    public void novoLivro(String ISBN, String nomeLivro, String autorLivro) { //Criando o metodo que receberá valores
        // Como a classe Livro é interna, o Java a reconhece aqui dentro
        Livro novoLivro = new Livro(ISBN, nomeLivro, autorLivro); //Aplicando a criação
        System.out.println("Livro adicionado com sucesso !!!"); //Mensagem de confirmação de cadastro
    }
} // Fechamento correto da classe livrosEstoque