import java.util.Scanner;

public class Uri1015{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double coord_x_1 = scanner.nextDouble();
        double coord_y_1 = scanner.nextDouble();
        double coord_x_2 = scanner.nextDouble();
        double coord_y_2 = scanner.nextDouble();

        double distancia_final = Math.sqrt(Math.pow((coord_x_2 - coord_x_1), 2.0) + Math.pow((coord_y_2 - coord_y_1), 2.0));
        
        System.out.printf("%.4f\n", distancia_final);
    }
}