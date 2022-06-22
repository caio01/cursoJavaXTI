/**
 * @author Caio Oliveira
 *         Aula 090 - Curso Java XTI
 */
package part5;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.add("Caio");
        fila.add("João");
        fila.add("Maria");
        fila.add("José");
        System.out.println(fila);

        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila);

        LinkedList<String> f = (LinkedList<String>) fila;
        f.addFirst("Francisco");
        f.addLast("Fábio");
        System.out.println(f);

        System.out.println(f.peekFirst());
        System.out.println(f.peekLast());

        System.out.println(f.pollFirst());
        System.out.println(f.pollLast());

    }
}
