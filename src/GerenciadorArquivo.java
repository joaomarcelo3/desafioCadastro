import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorArquivo {
   
    public void lerArquivo(GerenciadorPet gPet){

        File file = new File("src\\relatorios\\formulario.txt").getAbsoluteFile();
        Scanner scanner = new Scanner(System.in);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String pergunta;
            int indice = 0;
            sexoPetEnum sexo = null;
            tipoPetEnum tipo = null;
            List<String> respostas = new ArrayList<>();

            while ((pergunta = br.readLine()) != null ) {

                System.out.println(pergunta);

                String resposta = scanner.nextLine();
                respostas.add(resposta);
                try {

                    if (indice == 1) {
                        tipo = tipoPetEnum.valueOf(respostas.get(1).toUpperCase());
                    }
                    if (indice == 2) {
                        sexo = sexoPetEnum.valueOf(respostas.get(2).toUpperCase());
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                indice++;
            }
                gPet.cadastrarPet(respostas, tipo, sexo);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void salvarPet(Pet pet){

        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");
        String dataFormatada = data.format(formato);

        String nomePetFormatado = pet.getNomePet().toUpperCase().replace(" ", "");

        File file = new File("src\\petsCadastrados\\" + dataFormatada + "-" + nomePetFormatado + ".TXT").getAbsoluteFile();
        file.getParentFile().mkdirs();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){

            bw.write(pet.getNomePet());
            bw.newLine();
            bw.write(pet.getTipoPet().name());
            bw.newLine();
            bw.write(pet.getSexoPet().name());
            bw.newLine();
            bw.write(pet.getEnderecoEncontradoPet());
            bw.newLine();
            bw.write(Integer.toString(pet.getIdadePet()));
            bw.newLine();
            bw.write(pet.getPesoPet());
            bw.newLine();
            bw.write(pet.getRacaPet());
            bw.flush();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
