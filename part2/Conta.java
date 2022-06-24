/**
 * @author Caio Oliveira
 * Aula 036 - Curso Java XTI
 * part. 2 -> Vídeos 020 à 038
 */

package part2;

public class Conta {

    String cliente;
    double saldo;

    void exibeSaldo() {
        System.out.println(cliente + " seu saldo é: " + saldo);
    }

    void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    void deposita(double valor) {
        saldo += valor;
    }

    void transferePara(Conta destino, double valor) {
        this.saca(valor);
        destino.deposita(valor);
    }
}
