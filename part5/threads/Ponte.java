/**
 * @author Caio Oliveira
 * Aula 096 - Curso Java XTI
 * part. 5 -> Vídeos 081 à 096
 */
package part5.threads;

public interface Ponte {

    public void set(int valor) throws InterruptedException;

    public int get() throws InterruptedException;

}
