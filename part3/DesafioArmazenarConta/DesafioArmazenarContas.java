/**
 * @author Caio Oliveira
 * Aula 064 - Curso Java XTI
 * Desafio para Armazenar Contas em um Arquivo .txt
 */
package part3.DesafioArmazenarConta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DesafioArmazenarContas {
    private Path path = Paths
            .get("C:/Users/cinacio/Documents/cursoJavaXTI/part3/conta.txt");
    private Charset utf8 = StandardCharsets.UTF_8;

    public void armazenarContas(ArrayList<Conta> contas) throws IOException {
        try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
            for (Conta conta : contas) {
                w.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
            }
        }

    }

    public ArrayList<Conta> recuperarContas() throws IOException {
        ArrayList<Conta> contas = new ArrayList<>();
        try (BufferedReader r = Files.newBufferedReader(path, utf8)) {
            String line = null;
            while ((line = r.readLine()) != null) {
                String[] t = line.split(";");
                Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
                contas.add(conta);
            }
        }
        return contas;
    }

    public static void main(String[] args) throws IOException {

        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Caio", 12056.57));
        contas.add(new Conta("João", 5265.95));
        contas.add(new Conta("Maria", 7584.24));
        contas.add(new Conta("José", 562485.31));

        DesafioArmazenarContas operacao = new DesafioArmazenarContas();

        operacao.armazenarContas(contas);
        ArrayList<Conta> contas2 = operacao.recuperarContas();
        for (Conta conta : contas2) {
            conta.exibeSaldo();
        }

    }

}
