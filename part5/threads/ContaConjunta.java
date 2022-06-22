/**
 * @author Caio Oliveira
 *         Aula 095 - Curso Java XTI
 */
package part5.threads;

public class ContaConjunta {
    private int saldo = 100;

    public int getSaldo() {
        return saldo;
    }

    public synchronized void sacar(int valor, String cliente) throws InterruptedException {
        if (saldo >= valor) {
            int saldoOriginal = saldo;
            System.out.println(cliente + " esperando.");
            Thread.sleep(1000);
            saldo -= valor;
            String msg = cliente + " sacou " + valor
                    + " [Saldo original= " + saldoOriginal
                    + ", Saldo final=" + saldo + "]";
            System.out.println(msg);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
