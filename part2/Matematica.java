/**
 * @author Caio Oliveira
 * Aula 037 - Curso Java XTI
 * part. 2 -> Vídeos 020 à 038
 */
package part2;

public class Matematica {

    /**
     * 
     * @param um
     * @param dois
     * @return o maior dos dois números
     */
    int maior(int um, int dois) {
        if (um > dois) {
            return um;
        } else {
            return dois;
        }
    }

    double soma(double... numeros) {
        double total = 0;
        for (double n : numeros) {
            total += n;
        }
        return total;
    }

}
