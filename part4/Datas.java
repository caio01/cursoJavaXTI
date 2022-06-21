/**
 * @author Caio Oliveira
 * Aula 069 - Curso Java XTI
*/
package part4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public interface Datas {
    public static void main(String[] args) {

        // 01 de Jan de 1970 até agora, em milisegundos
        System.out.println(System.currentTimeMillis());

        Date agora = new Date();
        System.out.println(agora);

        // MÉTODOS
        agora.getTime();
        agora.setTime(1_000_000_000L);
        // agora.compareTo(...);

        Calendar c = Calendar.getInstance();
        new GregorianCalendar();
        c.set(1980, Calendar.FEBRUARY, 12);
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        c.set(Calendar.YEAR, 2000);
        System.out.println(c.getTime());

        c.clear(Calendar.MINUTE);
        c.clear(Calendar.SECOND);
        System.out.println(c.getTime());

        c.add(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.YEAR, -1);
        System.out.println(c.getTime());

        // ADICIONA A QUANTIDADE SOLICITADA, MAS NÃO RODA A UNIDADE DE TEMPO SUPERIOR
        c.roll(Calendar.DAY_OF_MONTH, 20);
        System.out.println(c.getTime());

    }
}
