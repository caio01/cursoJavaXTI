/**
 * @author Caio Oliveira
 * Aula 096 - Curso Java XTI
 * part. 5 -> Vídeos 081 à 096
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
