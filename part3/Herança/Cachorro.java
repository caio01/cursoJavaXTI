/**
 * @author Caio Oliveira
 * Aulas 047 à 049 - Curso Java XTI
*/
package part3.Herança;

public class Cachorro extends Animal {
    public Cachorro(){
        super(30, "Carne");
    }

    public void fazerBarulho(){
        System.out.println("Au, Au!");
    }
}
