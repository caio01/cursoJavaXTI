/**
 * @author Caio Oliveira
 * Aula 067 - Curso Java XTI
 * part. 4 -> Vídeos 065 à 080
*/

package part4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serializa {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] nomes = { "Caio", "João", "Maria" };

        // ESCRITA DE OBJETO
        FileOutputStream fos = new FileOutputStream("C:/Users/Caio Oliveira/Documents/cursoJavaXTI/part4/objeto.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(nomes);
        oos.close();

        // LEITURA DE OBJETO
        FileInputStream fis = new FileInputStream("C:/Users/Caio Oliveira/Documents/cursoJavaXTI/part4/objeto.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String[] nomes1 = (String[]) ois.readObject();
        ois.close();

        System.out.println(Arrays.toString(nomes1));

    }
}