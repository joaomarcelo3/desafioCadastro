package Teste;

import java.io.File;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        File file = new File("alou");
        System.out.printf("file path: "+file.getAbsolutePath());
        System.out.print("file: " +file);
        LocalDateTime data = LocalDateTime.now();
        System.out.println("Data: " + data);
    }
}
