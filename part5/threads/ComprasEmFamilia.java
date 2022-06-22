/**
 * @author Caio Oliveira
 *         Aula 095 - Curso Java XTI
 */
package part5.threads;

public class ComprasEmFamilia implements Runnable {

    ContaConjunta conta = new ContaConjunta();

    @Override
    public void run() {
        String client = Thread.currentThread().getName();
        try {
            for (int i = 0; i < 5; i++) {
                conta.sacar(20, client);
                if (conta.getSaldo() < 0) {
                    System.out.println("Estorou");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ComprasEmFamilia irAsCompas = new ComprasEmFamilia();
        new Thread(irAsCompas, "Pai").start();
        new Thread(irAsCompas, "Mãe").start();
        new Thread(irAsCompas, "Filha").start();
        new Thread(irAsCompas, "Tio").start();

    }

}
