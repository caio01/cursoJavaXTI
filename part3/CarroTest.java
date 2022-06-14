/**
 * @author Caio Oliveira
 * Aulas 044 - Curso Java XTI
*/
package part3;

public class CarroTest {
    public static void main(String[] args){
        Carro ferrari = new Carro();
        ferrari.modelo = "Ferrari Enzo";
        ferrari.velMax = 349;
        ferrari.segZeroCem = 3.2;
        Motor v12 = new Motor();
        v12.tipo = "V12";
        v12.potencia = 660;
        ferrari.motor = v12;
        
        Carro k = new Carro("Koenigsegg CXR", 430, 3.1, new Motor("V8", 1018));
        System.out.println(k.modelo);
        System.out.println(k.motor.potencia);
    }
}
