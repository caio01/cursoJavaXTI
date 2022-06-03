/**
 * Apresentar os conceitos de Variável
 * @author Caio Oliveira
 */

public class Variavel{

    public static void main(String[] args) {
        
        String nome = "Caio";
        int idade = 23;
        boolean casado = true;

        byte b = 127; //cem
        short s = 32767;//32 mil
        int i = 2_000_000_000;//2 bilhões
        long l = 9_000_000_000_000_000_000L;//9 quintilhões
        double d = 1.7976931348623157E+308D;//IEEE 754
        float f = 123F;

        byte bb = 0b01010101;//8 bits / 1 byte
        short ss = 0b0101010101010101;//16 bits / 2 bytes
        int ii = 0b01010101010101010101010101010101;//16 bits / 2 bytes

        i = s;       //Cast Implícito
        i = (int) l; //Cast Explícito

        if(casado == true){
            System.out.println("Seu nome é: " + nome + ", você tem " + idade + " anos, e é casado!");    
        }
        else{
            System.out.println("Seu nome é: " + nome + ", você tem " + idade + " anos, e não é casado!");
        }
    }
}