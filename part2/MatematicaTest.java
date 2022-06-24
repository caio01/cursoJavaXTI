/**
 * @author Caio Oliveira
 * Aula 037 - Curso Java XTI
 * part. 2 -> Vídeos 020 à 038
 */
package part2;

public class MatematicaTest {
    public static void main(String[] args) {
        Matematica m = new Matematica();
        int ma = m.maior(10, 20);
        System.out.println(ma);

        double so = m.soma(10, 20, 30);
        System.out.println(so);
    }
}
