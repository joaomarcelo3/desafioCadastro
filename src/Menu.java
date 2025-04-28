import java.util.Scanner;

public class Menu {

    GerenciadorPet gerenciadorPet = new GerenciadorPet();
    GerenciadorArquivo gerenciadorArq = new GerenciadorArquivo();
    Scanner scanner = new Scanner(System.in);

    public void menuInicial() {
    
        boolean continuar = true;
        while (continuar) {

            System.out.println("1 - Cadastrar um novo pet");
            System.out.println("2 - Alterar os dados do pet cadastrado");
            System.out.println("3 - Deletar um pet cadastrado");
            System.out.println("4 - Listar todos os pets cadastrados");
            System.out.println("5 - Listar pets por algum critério (idade, nome, raça)");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            try {

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    gerenciadorArq.lerArquivo(gerenciadorPet);
                    break;
                case 2:
                gerenciadorPet.alterarPet();
                    break;
                case 3:
                gerenciadorPet.deletarPet();
                    break;
                case 4:
                gerenciadorPet.listarTodosPet();
                    break;
                case 5:
                gerenciadorPet.listarPetCriterio();
                    break;
                case 6:
                continuar = false;
                System.out.println("Saindo...");
                    break;
                }

            // } catch (Exception e) {
            // System.out.println(e.getMessage());
            // e.printStackTrace();
            } catch (NumberFormatException e ){
                System.out.println("Opção inválida, tente novamente!");
            }
        }
    
    }

}
