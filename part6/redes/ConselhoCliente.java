/**
 * @author Caio Oliveira
 * Aula 104 - Curso Java XTI
 * part. 6 -> Vídeos 097 à 116
*/
package part6.redes;

import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("192.168.1.10", 5000);
        Scanner s = new Scanner(client.getInputStream());
        System.out.println("Mensagem: " + s.nextLine());
        s.close();
        client.close();
    }
}
