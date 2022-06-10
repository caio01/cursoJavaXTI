public class Conta {
    
    String cliente;
    double saldo;        
    
    void exibeSaldo(){
        System.out.println(cliente + " seu saldo é: " + saldo);
    }

    void saca(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
    }
}
