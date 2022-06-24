/**
 * @author Caio Oliveira
 * Aulas 047 e 051 - Curso Java XTI
 * part. 3 -> Vídeos 039 à 064
*/
package part3.Herança;

public abstract class Animal {
    double peso;
    String comida;
    // private p1; //não está visível pelas subclasses
    // protected p2; //está visível para as subclasses

    public Animal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }

    final void dormir() {
        System.out.println("Dormiu!");
    }

    abstract void fazerBarulho();

}
