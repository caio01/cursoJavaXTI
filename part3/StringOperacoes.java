/**
 * @author Caio Oliveira
 * Aula 058 - Curso Java XTI
 * part. 3 -> Vídeos 039 à 064
*/
package part3;

public class StringOperacoes {
    public static void main(String[] args) {

        String s1 = "Write once";
        String s2 = s1 + "Run anywhere";
        String s3 = new String("JVM");

        char[] array = { 'J', 'a', 'v', 'a' };
        String s4 = new String(array);
        System.out.println(s2 + s4);

        // OPERAÇÕES
        System.out.println(s1.length());
        System.out.println(s3.toString());

        // LOCALIZAÇÃO
        System.out.println(s3.indexOf("J"));
        System.out.println(s3.lastIndexOf("M"));
        System.out.println(s3.isEmpty());

        // COMPARAÇÃO
        String a = "ABCDEF";
        a.equals("ABCDEF");
        a.equalsIgnoreCase("aBcDeF");
        a.startsWith("AB");
        a.endsWith("EF");
        a.toLowerCase();
        a.toUpperCase();

    }
}
