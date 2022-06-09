/**
 * @author Caio Oliveira
 * Aula 010 - Curso Java XTI
 */

public class ClassesWrapper{

    public static void main(String[] args) {
        Integer idade = new Integer(31);
        Double preco = new Double("12.45");
        int i = preco.intValue();
        byte b = preco.byteValue();
        Boolean casado = new Boolean("yes");

        double d1 = Double.parseDouble("123.45");
        int i1 = Integer.parseInt("123");
        float f1 = Float.parseFloat("3.14F");

        int i2 = Integer.valueOf("101011", 2);

        

    }
} 

