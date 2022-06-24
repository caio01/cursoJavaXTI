/**
 * @author Caio Oliveira
 * Aula 104 - Curso Java XTI
 * part. 6 -> Vídeos 097 à 116
*/
package part6.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        while (true) {
            Socket socket = server.accept();
            try (PrintWriter w = new PrintWriter(socket.getOutputStream())) {
                w.println("Aprenda Java");
                server.close();
            }
        }
    }
}
