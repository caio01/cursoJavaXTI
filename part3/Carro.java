/**
 * @author Caio Oliveira
 * Aulas 044 - Curso Java XTI
*/
package part3;

public class Carro {
    String modelo;
    int velMax;
    double segZeroCem;
    Motor motor;
    

    public Carro(){

    }

    public Carro(String modelo, int velMax, double segZeroCem, Motor motor){
        this.modelo = modelo;
        this.velMax = velMax;
        this.segZeroCem = segZeroCem;       
        this.motor = motor;
        
    }


}
