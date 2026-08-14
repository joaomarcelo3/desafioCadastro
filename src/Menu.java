import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
                String pergunta;
                while ((pergunta = br.readLine()) != null ){
                    System.out.println(pergunta);

                }

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
                    default:
                    System.out.println("Opção inválida, tente novamente!");
                }
            } catch (Exception e) {
            System.out.println(e.getMessage());

            }
        }
    
    }

}
