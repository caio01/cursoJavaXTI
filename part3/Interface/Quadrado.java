/**
 * @author Caio Oliveira
 * Aula 052 - Curso Java XTI
 * part. 3 -> Vídeos 039 à 064
*/
package part3.Interface;

public class Quadrado implements AreaCalculavel {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
