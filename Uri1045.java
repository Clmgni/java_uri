import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble(), B = entrada.nextDouble(), C = entrada.nextDouble();
        double AA = Math.max(A, Math.max(B, C));
        double BB = 0;
        double CC = 0;
        // inicio do max e min
        if (AA == A) {
            BB = Math.max(B, C);
            CC = Math.min(B, C);
        }
        if (AA == B) {
            BB = Math.max(A, C);
            CC = Math.min(A, C);
        }
        if (AA == C) {
            BB = Math.max(B, A);
            CC = Math.min(B, A);
        }
        // fim do max ou min
        if (AA >= (BB + CC)) {
            System.out.print("NAO FORMA TRIANGULO\n");

        } else if (AA * AA > ((BB * BB) + (CC * CC))) {
            System.out.print("TRIANGULO OBTUSANGULO\n");
        }
        if (AA * AA == ((BB * BB) + (CC * CC))) {
            System.out.print("TRIANGULO RETANGULO\n");
        }

        if (AA * AA < ((BB * BB) + (CC * CC))) {
            System.out.print("TRIANGULO ACUTANGULO\n");
        }
        if ((AA == BB) && (AA == CC)) {
            System.out.print("TRIANGULO EQUILATERO\n");
        }
        if (((AA == BB) && (AA != CC)) || ((AA == CC) && (AA != BB)) || ((BB == CC) && (BB != AA))) {
            System.out.print("TRIANGULO ISOSCELES\n");
        }
    }

}