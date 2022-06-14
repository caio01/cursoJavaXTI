/**
 * @author Caio Oliveira
 * Aula 046 - Curso Java XTI
*/
package part3;

public enum Medida {
    
    MM("Milímetro"), CM("Centímetro"), M("Metro");

    public String titulo;
    Medida(String titulo){
        this.titulo = titulo;
    }

}
