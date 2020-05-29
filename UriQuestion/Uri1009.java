import java.util.Scanner;

public class Uri1009{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        String nome_vendedor = scanner.nextLine();
        double salario = scanner.nextDouble();
        double total_vendas = scanner.nextDouble();

        double salario_total = salario + (total_vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n",salario_total);
    }
}