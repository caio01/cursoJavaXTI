package part3;
/**
 * @author Caio Oliveira
 * Aula 062 - Curso Java XTI
*/

import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
    public static void main(String[] args){

        Path path = Paths.get("C:/Users/cinacio/Documents/cursoJavaXTI/part3");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());

        //CRIAÇÃO DE DIRETÓRIOS
        //Files.createDirectories(path.getParent());

    }
}
