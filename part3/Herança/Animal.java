/**
 * @author Caio Oliveira
 * Aulas 047 e 048 - Curso Java XTI
*/
package part3.Herança;

public class Animal {
    double peso;
    String comida;
    //private p1; //não está visível pelas subclasses
    //protected p2; //está visível para as subclasses

    public Animal(double peso, String comida){
        this.peso = peso;
        this.comida = comida;
    }

    void dormir(){System.out.println("Dormiu!");}
    void fazerBarulho(){System.out.println("Fazendo barulho!");}
    
}
