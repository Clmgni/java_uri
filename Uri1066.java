import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, par=0, impar=0, positivo=0, negativo=0;

        for (int i=0; i<5; i++) {
            N = input.nextInt();
            if (N % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }
            if (N > 0) {
                positivo++;
            }
            if (N < 0) {
                negativo++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}