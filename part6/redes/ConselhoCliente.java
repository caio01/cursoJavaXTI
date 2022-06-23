/**
 * @author Caio Oliveira
 * Aula 104 - Curso Java XTI
*/
package part6.redes;

import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("192.168.250.4", 5000);
        Scanner s = new Scanner(client.getInputStream());
        System.out.println("Mensagem: " + s.nextLine());
        s.close();
        client.close();
    }
}
