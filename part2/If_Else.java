/**
 * @author Caio Oliveira
 * Aula 023 - Curso Java XTI
*/
package part2;
public class If_Else {
    public static void main(String[] args){
        int idade = 10;
        if(idade < 11){
            System.out.println("Criança");
        }

        boolean passou = true;
        if(passou){
            System.out.println("Contratado");
        }
        int numero = 11;
        if((numero%2)==0){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }


        if(idade < 11){
            System.out.println("Criança");
        }else if(idade > 11 && idade <=18){
            System.out.println("Adolescente");
        }else if(idade > 18 && idade < 60){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }    
}
