/**
 * @author Caio Oliveira
 * Aula 012 - Curso Java XTI
 */
package part1;
import javax.swing.JOptionPane;

public class EntradaGrafica {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        JOptionPane.showMessageDialog(null, nome);    
        
        

    }
}
