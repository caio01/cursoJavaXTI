/**
 * @author Caio Oliveira
 * Aula 039 - Curso Java XTI
*/

package part3;

public class FuncionarioPacote {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.setNome("Caio");
        f1.setAtivo(true);
        System.out.println(f1.getNome());
        System.out.println(f1.isAtivo());

        f2.setNome("João");
        f2.setAtivo(true);
        System.out.println(f2.getNome());
        System.out.println(f2.isAtivo());

        System.out.println(Funcionario.QtdFunc());
    }
}
