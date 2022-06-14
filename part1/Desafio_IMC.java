/**
 * @author Caio Oliveira
 * Aula 019 - Curso Java XTI
 * Desafio IMC - Calcular IMC
 * 
 * IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 */
package part1;
import javax.swing.JOptionPane;
public class Desafio_IMC {
    public static void main(String[] args){
        
        String peso = JOptionPane.showInputDialog("Qual seu peso em kg?");
        String altura = JOptionPane.showInputDialog("Qual sua altura em m?");
        
        int pesoEmQuilogramas = Integer.parseInt(peso);
        double alturaEmMetros = Double.parseDouble(altura);
        double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

        String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do peso";
        msg = "IMC = " + imc + "\n" + msg;
        
        JOptionPane.showMessageDialog(null, msg);
        //System.out.println("IMC = " + imc);
        //System.out.println(msg);

    }
}
