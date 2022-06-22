/**
 * @author Caio Oliveira
 *         Aula 096 - Curso Java XTI
 */
package part5.threads;

public interface Ponte {

    public void set(int valor) throws InterruptedException;

    public int get() throws InterruptedException;

}
