import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double media_1 = scanner.nextDouble();
        double media_2 = scanner.nextDouble();

        double media_final = ((media_1 * 3.5) + (media_2 * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media_final);
    }
}