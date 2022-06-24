/**
 * @author Caio Oliveira
 * Aula 099 - Curso Java XTI
 * part. 6 -> Vídeos 097 à 116
*/
package part6.refinado;

public class Recursividade {
    public static int soma(int x) {
        if (x == 0) {
            return x;
        } else {
            return x + soma(x - 1);
        }
    }

    public static int potencia(int x, int e) {
        if (e == 1) {
            return x;
        } else {
            return x * potencia(x, e - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(soma(10));
        System.out.println(potencia(3, 4));
    }
}