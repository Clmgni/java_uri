import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int numero_recebido = 0;
        int total_pares = 0;

        for(int total_numero = 0; total_numero < 5; total_numero++){
            numero_recebido = scanner.nextInt();
            if(numero_recebido % 2 == 0){
                total_pares++;
            }
        }

        System.out.println(total_pares + " valores pares");
    }
}