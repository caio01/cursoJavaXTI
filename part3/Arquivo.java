<<<<<<< HEAD
package part3;
/**
 * @author Caio Oliveira
 * Aula 062 - Curso Java XTI
*/

=======
/**
 * @author Caio Oliveira
 * Aula 063 - Curso Java XTI
*/
package part3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
>>>>>>> de702cc5571a04cba038bc8616481ef3cf474c67
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
<<<<<<< HEAD
    public static void main(String[] args){

        Path path = Paths.get("C:/Users/cinacio/Documents/cursoJavaXTI/part3");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());

        //CRIAÇÃO DE DIRETÓRIOS
        //Files.createDirectories(path.getParent());

=======
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/Caio Oliveira/Documents/cursoJavaXTI/part3/texto.txt");
        Charset utf8 = StandardCharsets.UTF_8;

        // LEITURA DE ARQUIVOS
        try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
            w.write("Outro texto\n");
            w.write("Mais um texto\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ESCRITA DE ARQUIVOS
        try (BufferedReader r = Files.newBufferedReader(path, utf8)) {
            String line = null;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
>>>>>>> de702cc5571a04cba038bc8616481ef3cf474c67
    }
}
