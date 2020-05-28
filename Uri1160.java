import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class _1160_Crescimento_Populacional {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(), anos;
        double g1, g2; 
        int pa, pb;
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        for (int i = 0; i < t; i++) {
            anos = 101;
            pa = in.nextInt();
            pb = in.nextInt();
            g1 = format.parse(in.next()).doubleValue();
            g2 = format.parse(in.next()).doubleValue();
            for (int j = 0; j < 100; j++) {
                pa = (int) ((1 + (g1 / 100)) * pa);
                pb = (int) ((1 + (g2 / 100)) * pb); 
                if (pa > pb) {
                    anos = (j + 1);
                    break;
                }
            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
        in.close();
    }
}