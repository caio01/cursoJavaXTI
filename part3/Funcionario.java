/**
 * @author Caio Oliveira
 * Aulas 039 e 040 - Curso Java XTI
*/

package part3;

public class Funcionario {
    private static int qtdFunc;
    private String nome;
    private boolean ativo;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAtivo(boolean ativo){
        if(ativo = true){
            Funcionario.qtdFunc++;
        }
        this.ativo = ativo;
    }

    public boolean isAtivo(){
        return ativo;
    }

    public static int QtdFunc(){
        return qtdFunc;
    }

}