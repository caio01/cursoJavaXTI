/**
 * @author Caio Oliveira
 * Aula 076 - Curso Java XTI
 * part. 4 -> Vídeos 065 à 080
*/

package part4.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts2 extends JFrame {
    public Layouts2() {
        super("Layouts2");

        Container c = getContentPane();

        c.setLayout(new BorderLayout(5, 5));
        c.add(BorderLayout.NORTH, new JButton("N"));
        c.add(BorderLayout.SOUTH, new JButton("S"));
        c.add(BorderLayout.CENTER, new JButton("C"));
        c.add(BorderLayout.EAST, new JButton("E"));
        c.add(BorderLayout.WEST, new JButton("W"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layouts2();
    }
}
