package projects.BibliotecaSaber;

public class mainSaberAberto {
    static void main() {
        livrosEstoque livrosDisponiveis = new livrosEstoque();
        menuSaberAberto exibirMenuOpcoes = new menuSaberAberto();

        int opcao = -1;

        // Enquanto o usuário não digitar 0, o menu volta a aparecer
        while (opcao != 0) {
            opcao = exibirMenuOpcoes.exibirMenu();
        }
    }
}
