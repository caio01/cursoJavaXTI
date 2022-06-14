/**
 * @author Caio Oliveira
 * Aula 046 - Curso Java XTI
*/
package part3;

public class EnumTest {

    public static void andar(Medida medida, int total){
        if(medida == Medida.M){
            //
        }
    }

    public static void main(String[] args){

        System.out.println(PecasXadrez.BISPO);
        System.out.println(Medida.M.titulo);

        for(Medida m : Medida.values()){
            System.out.println(m + ": " + m.titulo);

        andar(Medida.M, 100);
        }
    }
}
