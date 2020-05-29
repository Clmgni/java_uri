import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int numero_recebido = scanner.nextInt();

        for(int contagem = 1; contagem <= numero_recebido; contagem++){
            if(contagem % 2 != 0){
                System.out.println(contagem);
            }
        }
    }
}