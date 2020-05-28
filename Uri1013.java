import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int maiorAB = (A+B+Math.abs(A-B))/2;
        int maiorBC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.printf(maiorBC +" eh o maior\n");
       

    }

}