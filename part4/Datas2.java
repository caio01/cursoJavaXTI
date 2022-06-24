/**
 * @author Caio Oliveira
 * Aula 070 - Curso Java XTI
 * part. 4 -> Vídeos 065 à 080
*/
package part4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.set(1980, Calendar.FEBRUARY, 12);
        Date date = c.getTime();
        System.out.println(date);

        // FORMATAÇÃO DE DATA
        DateFormat f = DateFormat.getDateInstance();
        System.out.print("DATE: ");
        System.out.println(f.format(date));

        // FORMATAÇÃO DE HORA
        f = DateFormat.getTimeInstance();
        System.out.print("TIME: ");
        System.out.println(f.format(date));

        // FORMATAÇÃO DE DATA E HORA
        f = DateFormat.getDateTimeInstance();
        System.out.print("DATE_TIME: ");
        System.out.println(f.format(date));

        // ESTILOS
        f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.print("FULL: ");
        System.out.println(f.format(date));

        f = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.print("LONG: ");
        System.out.println(f.format(date));

        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.print("MEDIUM: ");
        System.out.println(f.format(date));

        f = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.print("SHORT: ");
        System.out.println(f.format(date));

        // TRANSFORMAR STRING EM DATA
        Date data2 = f.parse("12/02/1980");
        System.out.println(data2);

        // SIMPLE DATE FORMAT
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("SIMPLE DATE FORMAT: ");
        System.out.println(sdf.format(date));

    }
}
