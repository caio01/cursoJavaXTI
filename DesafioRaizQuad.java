public class DesafioRaizQuad {
    
    
    int raiz(int num){
        int impar = 1;
        if(num > impar){
            num -= impar;
            impar += 2;
        }
        return num;

    }
}
