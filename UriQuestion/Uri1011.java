import java.util.Scanner;

public class Uri1011{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double pi = 3.14159;

        double volume = (4.0/3.0) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}