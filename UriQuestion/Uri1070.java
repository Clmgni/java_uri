import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
 
        int numero_recebido = scanner.nextInt();
        int total_impares = 0;
        
        while(total_impares < 6){
            if(numero_recebido % 2 != 0){
                System.out.println(numero_recebido);
                total_impares++;
            }
            numero_recebido++;
        }
    }
}