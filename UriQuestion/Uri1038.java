import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int id_produto = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double preco_unitario = 0.0;

        switch(id_produto){
            case 1: 
                preco_unitario = 4.00;
                break;
            case 2:
                preco_unitario = 4.50;
                break;
            case 3:
                preco_unitario = 5.00;
                break;
            case 4:
                preco_unitario = 2.00;
                break;
            case 5:
                preco_unitario = 1.50;
                break;
            default:
                preco_unitario = 0.0;
                break;
        }

        double preco_total = preco_unitario * quantidade;

        System.out.printf("Total: R$ %.2f\n", preco_total);
    }
}