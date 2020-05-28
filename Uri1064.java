import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        float acumulador = 0;
        for (int i = 0; i < 6; i++) {
            float num = entrada.nextFloat();
            if (num > 0) {
                contador = contador + 1;
                acumulador = acumulador + num;
            }
        }
        System.out.println(contador + " valores positivos");
        System.out.printf("%.1f\n", (acumulador / contador));
    }
}