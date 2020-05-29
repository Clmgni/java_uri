import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int valor_total = scanner.nextInt();
        
        int valor_restante = valor_total;
        int total_nota_100 = valor_restante / 100;
        valor_restante = valor_restante % 100;
        int total_nota_50 = valor_restante / 50;
        valor_restante = valor_restante % 50;
        int total_nota_20 = valor_restante / 20;
        valor_restante = valor_restante % 20;
        int total_nota_10 = valor_restante / 10;
        valor_restante = valor_restante % 10;
        int total_nota_5 = valor_restante / 5;
        valor_restante = valor_restante % 5;
        int total_nota_2 = valor_restante / 2;
        valor_restante = valor_restante % 2;        
        int total_nota_1 = valor_restante / 1;

        System.out.println(valor_total);
        System.out.printf("%d nota(s) de R$ 100,00\n", total_nota_100);
        System.out.printf("%d nota(s) de R$ 50,00\n", total_nota_50);
        System.out.printf("%d nota(s) de R$ 20,00\n", total_nota_20);
        System.out.printf("%d nota(s) de R$ 10,00\n", total_nota_10);
        System.out.printf("%d nota(s) de R$ 5,00\n", total_nota_5);
        System.out.printf("%d nota(s) de R$ 2,00\n", total_nota_2);
        System.out.printf("%d nota(s) de R$ 1,00\n", total_nota_1);
    }
}