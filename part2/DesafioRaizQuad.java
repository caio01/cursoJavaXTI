/**
 * @author Caio Oliveira
 * Aula 038 - Curso Java XTI
 * part. 2 -> Vídeos 020 à 038
 * Cálculo da Raiz Quadrada por Peel
 */
package part2;

public class DesafioRaizQuad {

    int raiz(int num) {
        int raiz = 0, impar = 1;
        while (num >= impar) {
            num -= impar;
            impar += 2;
            raiz++;
        }
        return raiz;

    }
}
