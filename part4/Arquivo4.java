/**
 * @author Caio Oliveira
 * Aula 065 - Curso Java XTI
*/
package part4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/Caio Oliveira/Documents/cursoJavaXTI/part4/texto.txt");

        // VERIFICA SE O ARQUIVO EXISTE
        System.out.println(Files.exists(path));
        // VERIFICA SE É UM DIRETÓRIO
        System.out.println(Files.isDirectory(path));
        // VERIFICA SE É UM ARQUIVO REGULAR (IMAGEM, TEXTO, ETC)
        System.out.println(Files.isRegularFile(path));
        // VERIFICA SE CONSEGUE LER O ARQUIVO
        System.out.println(Files.isReadable(path));
        // VERIFICA SE CONSEGUE EXECUTAR O ARQUIVO
        System.out.println(Files.isExecutable(path));
        // VERIFICA SE O TAMANHO DO ARQUIVO
        System.out.println(Files.size(path));
        // VERIFICA SE QUANDO FOI A ÚLTIMA MODIFICAÇÃO REALIZADA
        System.out.println(Files.getLastModifiedTime(path));
        // VERIFICA QUEM É O "DONO" DO ARQUIVO
        System.out.println(Files.getOwner(path));
        // VERIFICA QUAL É O TIPO DO ARQUIVO
        System.out.println(Files.probeContentType(path));

        // DELETE
        // Files.delete(path);
        // Files.deleteIfExists(path);

        // CRIAR
        Path path2 = Paths.get("C:/Users/Caio Oliveira/Documents/cursoJavaXTI/part4/fonte.txt");
        Files.deleteIfExists(path2);
        Files.createFile(path2);
        Files.write(path2, "Meu texto".getBytes());

        // COPIAR
        Path copia = Paths.get("C:/Users/Caio Oliveira/Documents/cursoJavaXTI/part4/copia.txt");
        Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);

        // MOVER
        Path mover = Paths.get("C:/Users/Caio Oliveira/Documents/cursoJavaXTI/part4/mover/fonte.txt");
        Files.createDirectories(mover.getParent());
        Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);

    }
}
