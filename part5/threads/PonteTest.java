/**
 * @author Caio Oliveira
 * Aula 096 - Curso Java XTI
 * part. 5 -> Vídeos 081 à 096
 */
package part5.threads;

public class PonteTest {
    public static void main(String[] args) {
        Ponte ponte = new PonteSincronizada();
        new Thread(new Produtor(ponte)).start();
        new Thread(new Consumidor(ponte)).start();
    }
}
