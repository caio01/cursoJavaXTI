/**
 * @author Caio Oliveira
 * Aula 036 - Curso Java XTI
 */

import java.lang.Class.Conta;

public class ContaTest {
    public static void main(String[] args){

        Conta conta = new Conta();
        conta.cliente = "Caio";
        conta.saldo = 10000;

        Conta destino = new Conta();
        destino.cliente = "João";
        destino.saldo = 8000;

        conta.exibeSaldo();
        conta.saca(1000);
        conta.exibeSaldo();
        conta.deposita(2000);
        conta.exibeSaldo();

        conta.exibeSaldo();
        destino.exibeSaldo();
        conta.transferePara(destino, 2000);
        conta.exibeSaldo();
        destino.exibeSaldo();
    }
}
