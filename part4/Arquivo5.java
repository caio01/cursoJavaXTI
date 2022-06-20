/**
 * @author Caio Oliveira
 * Aula 066 - Curso Java XTI
*/

package part4;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {
    public static void main(String[] args) throws IOException {

        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for (Path path : dirs) {
            System.out.println(path);
        }

        // LISTAR CONTEÚDO DE UM DIRETÓRIO
        Path dir = Paths.get("C:/");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {

            for (Path path : stream) {
                System.out.println(path.getFileName());
            }

        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }

        // LISTAR PARTIÇÕES
        FileSystem fs = FileSystems.getDefault();
        for (FileStore store : fs.getFileStores()) {
            System.out.println("Unidade: " + store.toString());
            System.out.println("Total de espaço(em bytes): " + store.getTotalSpace());
            System.out.println("Total de espaço disponível(em bytes): " + store.getUsableSpace());
            System.out
                    .println("Total de espaço utlizado(em bytes): " + (store.getTotalSpace() - store.getUsableSpace()));
            System.out.println();

        }

    }
}
