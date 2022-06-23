/**
 * @author Caio Oliveira
 * Aula 097 - Curso Java XTI
*/
package part6.refinado;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector{

    public static long carregarMemoria() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< 100_000; i++){
            list.add(i);
        }
        return Runtime.getRuntime().freeMemory();
    }
    public static void main(String[] args) {
        
        Runtime rt = Runtime.getRuntime();
        int MB = 1_048_576;
        double total = rt.maxMemory()/MB;
        
        double inicio = total - (carregarMemoria()/MB);

        //rt.runFinalization();
        rt.gc();

        double fim = total - (rt.freeMemory()/MB);

        System.out.println("Início: " + inicio + " Final: " + fim);

    }
}