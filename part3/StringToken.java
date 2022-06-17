package part3;
/**
 * @author Caio Oliveira
 * Aula 059 - Curso Java XTI
*/
public class StringToken {
    public static void main(String[] args){
        String s = "XHTML; CSS; JavaScript; jQuery; Java";
        String[] tokens = s.split(";");
        System.out.println(tokens.length + " tokens");
        for(String token : tokens){
            System.out.println(token);
        }


    }
}
