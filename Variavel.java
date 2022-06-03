/**
 * Apresentar os conceitos de Variável
 * @author Caio Oliveira
 */

public class Variavel{

    public static void main(String[] args) {
        
        String nome = "Caio";
        int idade = 23;
        boolean casado = true;
        
        if(casado == true){
            System.out.println("Seu nome é: " + nome + ", você tem " + idade + " anos, e é casado!");    
        }
        else{
            System.out.println("Seu nome é: " + nome + ", você tem " + idade + " anos, e não é casado!");
        }
    }
}