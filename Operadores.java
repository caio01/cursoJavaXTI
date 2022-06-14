import java.util.Scanner;

/**
 * @author Caio Oliveira
 * Aula 013 à 018 - Curso Java XTI
 */

public class Operadores {
    public static void main(String[] args){
        //Aula 013
        
        //2 + 3 operador binário
        //-2 operador unário
        //true ? "sim" : "não" operador ternário

        int x3 = 9 + 4;
        System.out.println(x3);

        double y = 7 - 4 + 3 * 2;
        System.out.println(y);


        //Aula 014
        double d = 7 * 3;
        String s = "Oi " + "Programador Java";
        double d2 = 7 % 3;
        double z = -3;
        d++; //pré-incremento
        --d2; //pós-incremento
        System.out.println(d2);
        System.out.println(d+s+z);



        //Aula 015
        int a = 6;
        System.out.println(a==6);
        System.out.println(a!=7);
        System.out.println(a<8);
        System.out.println(a>=5);

        Integer q = 10;
        System.out.println(q instanceof Integer);


        //Aula 016
        System.out.println((a >= 1) || (a <= 5));
        System.out.println((a >= 1) && (a <= 5));
        System.out.println(!(a >= 1));
        


        //Aula 017
        int x = 5;
        x += 3; //equivalente à x = x + 3;
        x -= 3; //equivalente à x = x - 3;
        x *= 3; //equivalente à x = x * 3;
        x /= 3; //equivalente à x = x / 3;
        x %= 3; //equivalente ao resto da divisão de 3/3;
        System.out.println(x);



        //Aula 018
        int idade = 23;
        String r = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(r);

        String sexo = "Masculino", pais = "Brasil";
        System.out.println(sexo + pais);


        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        double raio = sc.nextDouble();
        sc.close();


        //Diametro : 2r
        double diametro = 2 * raio;
        System.out.println("Diametro: " + diametro);

        //Circunferencia : 2 * pi * r
        double pi = Math.PI;
        double circunferencia = 2 * pi * raio;
        System.out.println("Circunferencia: " + circunferencia);

        //Área : pi * r2
        double area = pi * (raio * raio);
        System.out.println("Área: " + area);
    
    }
}