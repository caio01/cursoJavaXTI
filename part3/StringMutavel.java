package part3;
/**
 * @author Caio Oliveira
 * Aula 060 - Curso Java XTI
*/
public class StringMutavel {
    public static void main(String[] args){

        StringBuffer s0 = new StringBuffer();
        StringBuilder s1 = new StringBuilder("Java");

        System.out.println(s1.capacity());
        System.out.println(s0.capacity());

        s1.append(" Trabalhando...");
        System.out.println(s1);

        String url = new StringBuilder("www.cpqi.com").delete(0, 4).toString();
        System.out.println(url);
    }
}
