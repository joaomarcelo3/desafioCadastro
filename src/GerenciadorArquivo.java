import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorArquivo {
   
    public void lerArquivo(GerenciadorPet gPet){

        File file = new File("src\\relatorios\\formulario.txt").getAbsoluteFile();
        Scanner scanner = new Scanner(System.in);

        try(BufferedReader bw = new BufferedReader(new FileReader(file));){
            
            String pergunta;
            List<String> respostas = new ArrayList<>();

            while ((pergunta = bw.readLine()) != null ){
                
                System.out.println(pergunta);
                
                String resposta = scanner.nextLine();
                respostas.add(resposta);
            }
            gPet.cadastrarPet(respostas);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
