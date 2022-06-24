/**
 * @author Caio Oliveira
 * Aula 072 - Curso Java XTI
 * part. 4 -> Vídeos 065 à 080
*/

package part4;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numeros {
    public static void main(String[] args) throws ParseException {
        double saldo = 123_456.789;

        NumberFormat f = NumberFormat.getInstance();
        System.out.println(f.format(saldo));

        f = NumberFormat.getIntegerInstance();
        System.out.println(f.format(saldo));

        f = NumberFormat.getPercentInstance();
        System.out.println(f.format(0.25));

        f = NumberFormat.getCurrencyInstance();
        System.out.println(f.format(saldo));

        f.setMaximumFractionDigits(2);
        System.out.println(f.format(saldo));

        f = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(f.format(saldo));

        f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(f.format(saldo));

    }
}
