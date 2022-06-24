/**
 * @author Caio Oliveira
 * Aula 071 - Curso Java XTI
 * part. 4 -> Vídeos 065 à 080
*/
package part4;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public interface Datas3 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.FEBRUARY, 12);
        Date date = c.getTime();

        Locale brasil = new Locale("pt", "BR");
        Locale india = new Locale("hi", "IN");
        Locale usa = Locale.US;

        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(f.format(date));

        f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        System.out.println(f.format(date));

        f = DateFormat.getDateInstance(DateFormat.FULL, india);
        System.out.println(f.format(date));

        f = DateFormat.getDateInstance(DateFormat.FULL, usa);
        System.out.println(f.format(date));
    }
}
