/**
 * @author Caio Oliveira
 * Aula 105 e 106 - Curso Java XTI
*/
package part6.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {

    ServerSocket server;
    List<PrintWriter> escritores = new ArrayList<>();

    public ChatServer() {
        try {
            server = new ServerSocket(5000);
            while(true) {
                Socket socket = server.accept();
                new Thread(new EscutaCliente(socket)).start();
                PrintWriter p = new PrintWriter(socket.getOutputStream());
                escritores.add(p);
            }
        }catch (IOException e) {}
    }

    private void encaminharParaTodos(String texto) {
        try{
            for (PrintWriter w : escritores) {
                w.println(texto);
                w.flush();
            }
        } catch (Exception e) {}
    }

    private class EscutaCliente implements Runnable {

        Scanner leitor;
        public EscutaCliente(Socket socket) {
            try{
                leitor = new Scanner(socket.getInputStream());
            } catch (Exception e) {}
        }

        @Override
        public void run() {
            try{
                String texto;
                while((texto = leitor.nextLine()) != null){
                    System.out.println(texto);
                    encaminharParaTodos(texto);
                }
            } catch (Exception e) {}
        }
        
    }

    public static void main(String[] args) throws IOException {
        new ChatServer();
    }
}
