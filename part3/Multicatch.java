/**
 * @author Caio Oliveira
 * Aula 054 - Curso Java XTI
*/

package part3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multicatch{

    public static void dividir(Scanner s)
        throws InputMismatchException, ArithmeticException
    {
        System.out.println("Primeiro número: ");
                int a = s.nextInt();
                System.out.println("Segundo número: ");
                int b = s.nextInt();

                System.out.println(a / b);
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        boolean continua = true;
        do{
            try {
                dividir(s);
                continua = false;

            }catch(InputMismatchException | ArithmeticException e1){
                System.out.println("Numero inválido!");
                //e1.printStackTrace();
                //e1.getStackTrace();
                //e1.getMessage();
                s.nextLine();
            }
        }while(continua);   
    }
}