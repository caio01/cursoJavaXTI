/**
 * @author Caio Oliveira
 * Aula 052 - Curso Java XTI
 * part. 3 -> Vídeos 039 à 064
*/
package part3.Interface;

public class Cubo implements AreaCalculavel, VolumeCalculavel {
    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double calculaVolume() {
        return lado * lado * lado;
    }

    public double calculaArea() {
        return 6 * lado * lado;
    }

}
