/**
 * @author Caio Oliveira
 * Aula 053 - Curso Java XTI
*/

package part3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        boolean continua = true;
        do{
            try {
                
                System.out.println("Primeiro número: ");
                int a = s.nextInt();
                System.out.println("Segundo número: ");
                int b = s.nextInt();

                System.out.println(a / b);
                s.close();
                continua = false;

            }catch(InputMismatchException e1){
                System.out.println("Numeros devem ser inteiros.");
                s.nextLine();
            }catch(ArithmeticException e2){
                System.out.println("Divisor deve ser diferente de zero.");
                s.nextLine();
            }finally{
                System.out.println("Finally executado!");
            }
        }while(continua);   
    }
}