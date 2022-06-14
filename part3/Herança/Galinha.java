/**
 * @author Caio Oliveira
 * Aulas 047 à 049 - Curso Java XTI
*/
package part3.Herança;

public class Galinha extends Animal {
    
    public Galinha(){
        super(2, "Milho");
    }

    public void fazerBarulho(){
        System.out.println("Có, Có!");
    }
}
