/**
 * @author Caio Oliveira
 * Aula 021 - Curso Java XTI
*/

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args){
        String[] uma = {"Ricardo","Sandra"};
        String[][] duas = 
        {
            {"Ricardo","M","DF"},
            {"Sandra","F","MA"}
        };
        System.out.println(uma);
        System.out.println(duas.length);
        System.out.println(duas[0].length);



        //////////////////////////////////////
        //Sorteia uma carta de um baralho
        /////////////////////////////////////
        String[] faces = 
        {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
        String[] naipes =
        {"Espadas","Paus","Copas","Reis"};

        Random r = new Random();
        
        int indiceFace = r.nextInt(faces.length);
        String face = faces[indiceFace];

        int indiceNaipe = r.nextInt(naipes.length);
        String naipe = naipes[indiceNaipe];

        String carta = face + " " + naipe;
        System.out.println(carta);

    }   
}
