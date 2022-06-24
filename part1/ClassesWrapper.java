/**
 * @author Caio Oliveira
 * Aula 010 - Curso Java XTI
 * part. 1 -> Vídeos 001 à 019
 */
package part1;

public class ClassesWrapper {

    public static void main(String[] args) {
        Integer idade = 31;
        Double preco = 12.45;
        int i = preco.intValue();
        byte b = preco.byteValue();
        Boolean casado = true;

        double d1 = Double.parseDouble("123.45");
        int i1 = Integer.parseInt("123");
        float f1 = Float.parseFloat("3.14F");

        int i2 = Integer.valueOf("101011", 2);

        System.out.println(i + b + d1 + i1 + f1 + i2 + idade);
        System.out.println(casado);

    }
}
