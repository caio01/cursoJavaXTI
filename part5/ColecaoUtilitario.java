/**
 * @author Caio Oliveira
 * Aula 087 - Curso Java XTI
*/
package part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Guaraná");
        list.add("Uva");
        list.add("Manga");
        list.add("Coco");
        list.add("Açaí");
        list.add("Banana");

        System.out.println(list);

        Collections.sort(list); // COLOCA EM ORDEM ALFABÉTICA
        System.out.println(list);

        Collections.reverse(list); // COLOCA EM ORDEM INVERSA
        System.out.println(list);

        Collections.shuffle(list); // EMBARALHA A LISTA
        System.out.println(list);

        Collections.addAll(list, "Cupuaçu", "Laranja", "Laranja"); // COLOCA EM ORDEM ALFABÉTICA
        System.out.println(list);

        System.out.println(Collections.frequency(list, "Laranja"));

        List<String> list2 = Arrays.asList("Acerola", "Graviola");
        boolean d = Collections.disjoint(list, list2);
        System.out.println(d);

        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, "Guaraná"));

        Collections.fill(list, "Açaí");
        System.out.println(list);

        Collections.unmodifiableCollection(list); // COLEÇÃO NAO MODIFICAVEL

    }
}
