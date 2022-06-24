/**
 * @author Caio Oliveira
 * Aula 020 - Curso Java XTI
 * part. 2 -> Vídeos 020 à 038
*/
package part2;

import java.util.Arrays;

public class ArraySimples {
    public static void main(String[] args) {
        String[] paises = { "Brasil", "Rússia", "Índia", "China" };
        System.out.println(paises[0]);

        int[] impares = new int[5];
        impares[0] = 1;
        impares[1] = 3;
        impares[2] = 5;
        impares[3] = 7;
        impares[4] = 9;

        System.out.println(paises.length);
        System.out.println(Arrays.toString(paises));

        int posicao = Arrays.binarySearch(paises, "Rússia");
        System.out.println(posicao);

        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));

        Double[] valores = { 12.35, 3456.3456 };
        System.out.println(valores[0].doubleValue());

    }
}