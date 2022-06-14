/**
 * @author Caio Oliveira
 * Aula 024 - Curso Java XTI
*/
package part2;
public class Switch_{
    public static void main(String[] args){
        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Macho");
                break;
            case 'F':
                System.out.println("Femea");
                break;
            default:
                System.out.println("Outro");
        }
    }
}