import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double medida_final = 0.0;
        if((A + B) > C && (A + C) > B && (B + C) > A){
            medida_final = A + B + C;
            System.out.printf("Perimetro = %.1f", medida_final);
        }else{
            medida_final = ((A + B) * C)/2.0;
            System.out.printf("Area = %.1f", medida_final);
        }
        
    }
}