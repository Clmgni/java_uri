import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto = 0.0;
        double resto_salario = salario;
        if(salario >= 0.0 && salario <= 2000.00){
            imposto = 0.0;
        }else if(salario > 2000.00 && salario <= 3000.00){
            resto_salario = salario - 2000;
            imposto = resto_salario * 0.8;
        }else if(salario > 3000.00 && salario <= 4500.00){
            imposto = 1000 * 0.08;
            resto_salario = salario - 3000.00;
            imposto = imposto + (resto_salario * 0.18);
        }else if(salario > 4500.00){
            imposto = (1000 * 0.08) + (1500 * 0.18);
            resto_salario = salario - 4500.00;
            imposto = imposto + (resto_salario * 0.28);            
        }

        if(imposto > 0.0){
            System.out.printf("R$ %.2f\n", imposto);
        }else{
            System.out.println("Isento");
        }
    }
}