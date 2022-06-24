/**
 * @author Caio Oliveira
 * Aula 052 - Curso Java XTI
 * part. 3 -> Vídeos 039 à 064
*/
package part3.Interface;

public class InterfaceTest {

    public static void area(AreaCalculavel o) {
        System.out.println(o.calculaArea());
    }

    public static void volume(VolumeCalculavel o) {
        System.out.println(o.calculaVolume());
    }

    public static void main(String[] args) {
        area(new Quadrado(2));
        volume(new Cubo(2));
    }
}
