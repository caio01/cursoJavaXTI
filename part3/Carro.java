/**
 * @author Caio Oliveira
 * Aulas 044 e 045 - Curso Java XTI
 * part. 3 -> Vídeos 039 à 064
*/
package part3;

public class Carro {
    String modelo;
    int velMax;
    double segZeroCem;
    Motor motor;

    public Carro() {

    }

    public Carro(String modelo, int velMax, double segZeroCem, Motor motor) {
        this.modelo = modelo;
        this.velMax = velMax;
        this.segZeroCem = segZeroCem;
        this.motor = motor;

    }

}
