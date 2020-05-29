import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int km_total = scanner.nextInt();
        double litros = scanner.nextDouble();

        System.out.printf("%.3f km/l\n", (km_total / litros));
    }
}