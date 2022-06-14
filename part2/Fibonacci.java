/**
 * @author Caio Oliveira
 * Aula 029 - Curso Java XTI
*/
package part2;
public class Fibonacci {
    public static void main(String[] args){
        int anterior = 0;
        int proximo = 1;

        System.out.println(anterior);

        while(proximo < 56){
            System.out.println(proximo);
            proximo = anterior + proximo; //proximo num Fibonacci
            anterior = proximo - anterior; //atualiza anterior
        }

    }
}
