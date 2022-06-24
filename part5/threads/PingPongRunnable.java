/**
 * @author Caio Oliveira
 * Aula 094 - Curso Java XTI
 * part. 5 -> Vídeos 081 à 096
 */
package part5.threads;

public class PingPongRunnable implements Runnable {

    String p;
    long time;

    public PingPongRunnable(String p, long time) {
        this.p = p;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.print(p + " ");
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {

        Runnable ping = new PingPongRunnable("ping", 1500);
        Runnable pong = new PingPongRunnable("PONG", 1500);

        new Thread(ping, "ping").start();
        new Thread(pong, "pong").start();

    }
}
