public class DesafioRaizQuad {
    
    
    int raiz(int num){
        int raiz = 0, impar = 1;
        while(num >= impar){
            num -= impar;
            impar += 2;
            raiz++;
        }
        return raiz;

    }
}
