/**
 * @author Caio Oliveira
 * Aula 105 e 106 - Curso Java XTI
 * part. 6 -> Vídeos 097 à 116
*/
package part6.redes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Container;
//import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatClient extends JFrame {

    JTextField textoParaEnviar;
    PrintWriter escritor;
    Socket socket;
    String nome;
    JTextArea textoRecebido;
    Scanner leitor;

    private class EscutaServidor implements Runnable {
        @Override
        public void run() {
            try {
                String texto;
                while ((texto = leitor.nextLine()) != null) {
                    textoRecebido.append(texto + "\n");
                }
            } catch (Exception e) {
            }
        }

    }

    public ChatClient(String nome) throws UnknownHostException, IOException {
        super("Chat: " + nome);
        this.nome = nome;

        // Font fonte = new Font("Serif", Font.PLAIN, 26);
        textoParaEnviar = new JTextField();
        // textoParaEnviar.setFont(fonte);
        JButton botao = new JButton("Enviar");
        // botao.setFont(fonte);
        botao.addActionListener(new EnviarListener());
        Container envio = new JPanel();
        envio.setLayout(new BorderLayout());
        envio.add(BorderLayout.CENTER, textoParaEnviar);
        envio.add(BorderLayout.EAST, botao);
        getContentPane().add(BorderLayout.SOUTH, envio);

        textoRecebido = new JTextArea();
        JScrollPane scroll = new JScrollPane(textoRecebido);

        getContentPane().add(BorderLayout.CENTER, scroll);

        configurarRede();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public class EnviarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            escritor.println(nome + " : " + textoParaEnviar.getText());
            escritor.flush();
            textoParaEnviar.setText("");
            textoParaEnviar.requestFocus();
        }

    }

    public void configurarRede() throws UnknownHostException, IOException {
        socket = new Socket("192.168.1.10", 5000);
        escritor = new PrintWriter(socket.getOutputStream());
        leitor = new Scanner(socket.getInputStream());
        new Thread(new EscutaServidor()).start();
    }

    public static void main(String[] args) throws UnknownHostException, IOException {
        new ChatClient("Caio");
        new ChatClient("Maria");
    }
}
