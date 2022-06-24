/**
 * @author Caio Oliveira
 * Aula 096 - Curso Java XTI
 * part. 5 -> Vídeos 081 à 096
 */
package part5.threads;

import java.util.Random;

public class Produtor implements Runnable {

    private Ponte ponte;

    public Produtor(Ponte ponte) {
        this.ponte = ponte;
    }

    private Random random = new Random();

    @Override
    public void run() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(random.nextInt(3000));
                total += i;
                ponte.set(i);
                System.out.println("\t" + total);
            } catch (InterruptedException e) {
            }
        }
    }
}
