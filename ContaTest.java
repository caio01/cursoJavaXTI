import java.lang.Class.Conta;

public class ContaTest {
    public static void main(String[] args){

        Conta conta = new Conta();
        conta.cliente = "Caio";
        conta.saldo = 10000;

        conta.exibeSaldo();
        conta.saca(1000);
        conta.exibeSaldo();
    }
}
