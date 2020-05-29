import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int p_1 = scanner.nextInt();
        int qtd_1 = scanner.nextInt();
        double preco_p_1 = scanner.nextDouble();
        
        int p_2 = scanner.nextInt();
        int qtd_2 = scanner.nextInt();
        double preco_p_2 = scanner.nextDouble();

        double preco_final = (preco_p_1 * qtd_1) + (preco_p_2 * qtd_2);
        

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", preco_final);
    }
}