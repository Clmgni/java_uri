import java.util.Scanner;

public class Uri1007{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        System.out.println("DIFERENCA = "+ (A * B - C * D));
    }
}