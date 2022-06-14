/**
 * @author Caio Oliveira
 * Aula 028 - Curso Java XTI
 */

package part2;
import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        int[] pares = {2,4,6,8};

        for(int par : pares){
            System.out.println(par);
        }


    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i<10; i++){
        list.add(i);
    }

    for(Integer numero : list){
        System.out.println(numero);
    }
    }
}
