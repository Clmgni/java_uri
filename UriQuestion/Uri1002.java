import java.util.Scanner;

public class Uri1002{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);        
        double n = 3.14159;

        double raio = scanner.nextDouble();

        double area = n * (raio * raio);

        System.out.printf("A=%.4f%n",area);
    }
}