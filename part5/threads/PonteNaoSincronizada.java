/**
 * @author Caio Oliveira
 *         Aula 096 - Curso Java XTI
 */
package part5.threads;

public class PonteNaoSincronizada implements Ponte {

    private int valor = -1;

    @Override
    public void set(int valor) throws InterruptedException {
        System.out.print("Produziu " + valor);
        this.valor = valor;
    }

    @Override
    public int get() throws InterruptedException {
        System.err.print("Consumiu " + valor);
        return valor;
    }

}
