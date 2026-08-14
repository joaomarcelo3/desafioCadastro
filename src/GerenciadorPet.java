import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPet {
    GerenciadorArquivo gerenciadorArquivo = new GerenciadorArquivo();
    private List<Pet> pets;

    public GerenciadorPet(){
        this.pets = new ArrayList<>();
    }

    public void cadastrarPet(List<String> respostas) throws IOException {

        String resposta1 = respostas.get(1);
        tipoPetEnum tipo = tipoPetEnum.valueOf(resposta1.toUpperCase());

        String resposta2 = respostas.get(2);
        sexoPetEnum sexo = sexoPetEnum.valueOf(resposta2.toUpperCase());

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

    public void listarPetCriterio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarPetCriterio'");
    }

    
    
}
