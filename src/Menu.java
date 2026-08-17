import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Menu {

    File file = new File("src\\relatorios\\menuInicial.txt").getAbsoluteFile();
    GerenciadorPet gerenciadorPet = new GerenciadorPet();
    GerenciadorArquivo gerenciadorArq = new GerenciadorArquivo();
    Scanner scanner = new Scanner(System.in);

    public void menuInicial() {
    
        boolean continuar = true;
        while (continuar) {

            try(BufferedReader br = new BufferedReader(new FileReader(file))){
                String menuInicial;
                while ((menuInicial = br.readLine()) != null ){
                    System.out.println(menuInicial);

                }

                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        gerenciadorArq.lerArquivoPet(gerenciadorPet);
                        break;

                    case 2:
                        System.out.println("Digite o nome do pet que você quer alterar: ");
                        String textoBuscadoParaAlterar = scanner.nextLine();
                        List<Pet> resultado = gerenciadorPet.listarPetCriterio(textoBuscadoParaAlterar);

                        System.out.println("Digite o index do pet: ");
                        int index = Integer.parseInt(scanner.nextLine()) - 1;

                        gerenciadorPet.alterarPet(index, resultado);
                        break;

                    case 3:
                    gerenciadorPet.deletarPet();
                        break;

                    case 4:
                    gerenciadorPet.listarTodosPet();
                        break;

                    case 5:
                        System.out.println("Digite algum critério do pet (nome, idade, raça) que você quer procurar: ");
                        String textoBuscado = scanner.nextLine();
                        gerenciadorPet.listarPetCriterio(textoBuscado);
                        break;

                    case 6:
                    continuar = false;
                    System.out.println("Saindo...");
                        break;

                    default:
                    System.out.println("Opção inválida, tente novamente!");
                }
            } catch (Exception e) {
            System.out.println(e.getMessage());

            }
        }
    
    }

}
