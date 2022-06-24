/**
 * @author Caio Oliveira
 * Aulas 047 à 051 - Curso Java XTI
 * part. 3 -> Vídeos 039 à 064
*/
package part3.Herança;

public class Cachorro extends Animal {
    public Cachorro() {
        super(30, "Carne");
    }

    public void fazerBarulho() {
        System.out.println("Au, Au!");
    }
}
