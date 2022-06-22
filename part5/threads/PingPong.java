/**
 * @author Caio Oliveira
 *         Aula 093 - Curso Java XTI
 */
package part5.threads;

public class PingPong extends Thread {

    String p;
    long time;

    public PingPong(String p, long time) {
        this.p = p;
        this.time = time;
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.print(p + " ");
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {

        new PingPong("ping", 1500).start();
        new PingPong("PONG", 1500).start();

        System.out.println("Ver Thread");

    }
}
