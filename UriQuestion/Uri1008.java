import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int numero_funcionario, quantidade_horas;
        float valor_hora;

        numero_funcionario = scanner.nextInt();
        quantidade_horas = scanner.nextInt();
        valor_hora = scanner.nextFloat();

        float salario = quantidade_horas * valor_hora;

        System.out.println("NUMBER = "+numero_funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }
}