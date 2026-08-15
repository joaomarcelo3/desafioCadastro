import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class GerenciadorPet {
    GerenciadorArquivo gerenciadorArquivo = new GerenciadorArquivo();
    Scanner scanner = new Scanner(System.in);
    private List<Pet> pets;

    public GerenciadorPet(){
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
        gerenciadorArquivo.salvarPet(pet);

    }

    public void alterarPet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarPet'");
    }

    public void deletarPet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarPet'");
    }

    public void listarTodosPet() {
        System.out.println(pets.size());
        for (Pet pet : pets) {
            System.out.println(pet.toString());
        }
    }

    public List<Pet> listarPetCriterio(String textoBuscado) {
        List<Pet> listas = new ArrayList<>();
        int indice = 0;
        for (Pet pet : pets) {

            if (pet.getNomePet().toUpperCase().contains(textoBuscado.toUpperCase())) {
                indice++;
                listas.add(pet);
                System.out.println(indice +"." + pet.toString());
            }
        }
        return listas;
    }

    
    
}
