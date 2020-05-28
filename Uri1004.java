import java.util.Scanner;
public class Uri1004 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, X;
        A = teclado.nextInt();
        B = teclado.nextInt();
        X = A * B;
        System.out.println("PROD = " + X);
    }
}