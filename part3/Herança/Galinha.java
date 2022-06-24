/**
 * @author Caio Oliveira
 * Aulas 047 à 051 - Curso Java XTI
 * part. 3 -> Vídeos 039 à 064
*/
package part3.Herança;

public class Galinha extends Animal {

    public Galinha() {
        super(2, "Milho");
    }

    public void fazerBarulho() {
        System.out.println("Có, Có!");
    }
}
