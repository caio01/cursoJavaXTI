/**
 * @author Caio Oliveira
 * Aula 022 - Curso Java XTI
 * part. 2 -> Vídeos 020 à 038
*/
package part2;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add(0, "Vermelho");
        cores.add("Amarelo");
        cores.add("Azul");

        System.out.println(cores.toString());
        System.out.println(cores.size());
        System.out.println(cores.get(2));

        cores.remove("Branco");
        System.out.println(cores.contains("Amarelo"));
    }
}
