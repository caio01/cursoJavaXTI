/**
 * @author Caio Oliveira
 * Aula 025 - Curso Java XTI
 * Desafio para que o usuário tente acertar
 * o número do dado gerado randomicamente
 */
package part2;
import java.util.Random;
import javax.swing.JOptionPane;

public class DesafioDados {
    public static void main(String[] args){
        String msg = JOptionPane.showInputDialog("Qual seu palpite?");
        Integer palpite = Integer.parseInt(msg);

        Random r = new Random();
        int numDado = r.nextInt(6)+1;

        if(palpite == numDado){
            System.out.println("Parabéns, você errou!");
        }else{
            System.out.println("Que pena, você errou! O número do dado foi: " + numDado);
        }
    }    
}
