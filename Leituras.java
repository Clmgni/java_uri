import java.util.Scanner;

public class Leituras{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int a;
        float b;

        System.out.println("Digite um valor inteiro");
        a = scanner.nextInt();

        System.out.println("Digite um valor com ponto flutuante");
        b = scanner.nextFloat();

        System.out.println("Voce digitou "+a+" e "+b);

    }
}