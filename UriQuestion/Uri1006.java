import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double media_1 = scanner.nextDouble();
        double media_2 = scanner.nextDouble();
        double media_3 = scanner.nextDouble();

        double media_final = ((media_1 * 2.0) + (media_2 * 3.0) + (media_3 * 5.0)) / 10;

        System.out.printf("MEDIA = %.1f\n", media_final);
    }
}