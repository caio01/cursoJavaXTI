/**
 * @author Caio Oliveira
 * Aula 089 - Curso Java XTI
 * part. 5 -> Vídeos 081 à 096
*/
package part5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {
    public static void main(String[] args) {

        String[] cores = { "Verde", "Amarelo", "Azul", "Branco", "Azul", "Amarelo", "Verde" };

        List<String> list = Arrays.asList(cores);
        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);

    }
}
