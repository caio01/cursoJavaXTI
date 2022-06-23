/**
 * @author Caio Oliveira
 * Aula 098 - Curso Java XTI
*/
package part6.refinado;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aninhamento extends JFrame{

    JButton botao;
    public Aninhamento(){
        super("Aninhamento");

        botao = new JButton("Ok");
        botao.addActionListener(new ListenerAninhado());
        
        
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);       
    }
    
    public class ListenerAninhado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Classe Aninhada executa " + botao.getText());
        }
    }

    public static void main(String[] args) {
        new Aninhamento();
    }
}
