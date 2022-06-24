/**
 * @author Caio Oliveira
 * Aula 011 - Curso Java XTI
 * part. 1 -> Vídeos 001 à 019
 */
package part1;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // Chamada do programa
        // System.out.println(args[0]);

        // Interagindo com o usuário
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = s.nextLine();
        System.out.println("Bem vindo " + nome);
        s.close();

    }
}
