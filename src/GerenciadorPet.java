import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorPet {
    GerenciadorArquivo gerenciadorArquivo = new GerenciadorArquivo();
    Scanner scanner = new Scanner(System.in);
    private List<Pet> pets;

    public GerenciadorPet() {
        this.pets = new ArrayList<>();
    }

    public void cadastrarPet(List<String> respostas, tipoPetEnum tipo, sexoPetEnum sexo) throws IOException {

        Pet pet = new Pet(
                respostas.get(0),
                tipo,
                sexo,
                respostas.get(3),
                Integer.parseInt(respostas.get(4)),
                respostas.get(5),
                respostas.get(6));

        pets.add(pet);
        gerenciadorArquivo.salvarArquivoPet(pet);

    }

    public void alterarPet(int index, List<Pet> resultado) {
            Pet petParaAlterar = resultado.get(index);

            System.out.println("Novo nome: ");
            String novoNome = scanner.nextLine();
            petParaAlterar.setNomePet(novoNome);

            System.out.println("Novo endereço: ");
            String novoEndereco = scanner.nextLine();
            petParaAlterar.setEnderecoEncontradoPet(novoEndereco);

            System.out.println("Nova idade: ");
            int novaIdade = Integer.parseInt(scanner.nextLine());
            petParaAlterar.setIdadePet(novaIdade);

            System.out.println("Novo peso: ");
            String novoPeso = scanner.nextLine();
            petParaAlterar.setPesoPet(novoPeso);

            System.out.println("Nova raça: ");
            String novaRaca = scanner.nextLine();
            petParaAlterar.setRacaPet(novaRaca);

            System.out.println("Pet alterado com sucesso!");
    }

    public void deletarPet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarPet'");
    }

    public void listarTodosPet() {
        int indice = 0;
        for (Pet pet : pets) {
            indice++;
            System.out.println(indice + ". " + pet.toString());
        }
    }

    public List<Pet> listarPetCriterio(String textoBuscado) {
        List<Pet> listas = new ArrayList<>();
        int indice = 0;
        for (Pet pet : pets) {

            if (pet.getNomePet().toUpperCase().contains(textoBuscado.toUpperCase())) {
                indice++;
                listas.add(pet);
                System.out.println(indice + ". " + pet.toString());
            }
            else if (Integer.toString(pet.getIdadePet()).equals(textoBuscado)) {
                indice++;
                listas.add(pet);
                System.out.println(indice + ". " + pet.toString());
            }
            else if (pet.getRacaPet().toUpperCase().contains(textoBuscado.toUpperCase())) {
                indice++;
                listas.add(pet);
                System.out.println(indice + ". " + pet.toString());
            }
        }
        if (listas.isEmpty()){
            System.out.println("Pet não encontrado!");
        }
        return listas;
    }
}


