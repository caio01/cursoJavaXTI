/**
 * @author Caio Oliveira
 * Aula 028 - Curso Java XTI
*/

import java.util.ArrayList;
import java.util.Scanner;

public class While_DoWhile {
    public static void main(String[] args) {
        int i = 0;
        while(i < 2){
            System.out.println(i);
            i++;
        }

        do{
            System.out.println(i);
            i++;
        }while(i<2);
    


    ArrayList<String> produtos = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    System.out.println("Liste seus produtos: Para sair, digite FIM");
    s.close();

    String produto;
    while(!"FIM".equals(produto = s.nextLine())){
        produtos.add(produto);
    }

    System.out.println(produtos.toString());
    }
}
