/**
 * @author Caio Oliveira
 * Aulas 047 e 051 - Curso Java XTI
 * part. 3 -> Vídeos 039 à 064
*/
package part3.Herança;

public class AnimalTest {

    public static void barulho(Animal animal) {
        animal.fazerBarulho();
    }

    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.comida = "Carne";
        c.fazerBarulho();

        Galinha g = new Galinha();
        g.comida = "Milho";
        g.fazerBarulho();

        System.out.println(c instanceof Cachorro);
        System.out.println(c instanceof Animal);
    }
}
