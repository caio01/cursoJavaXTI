/**
 * @author Caio Oliveira
 * Aula 030 - Curso Java XTI
 * part. 2 -> Vídeos 020 à 038
*/
package part2;

public class Label_Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        boolean[][] matrix = {
                { false, true, false, false, false },
                { false, false, false, false, false }
        };

        busca: for (int a = 0; a < matrix.length; a++) {
            System.out.print("A ");
            for (int b = 0; b < matrix[a].length; b++) {
                if (b < 3) {
                    break busca;
                }
            }
            System.out.println("B ");
        }

    }
}
