import java.util.Scanner;

public class Uri1154{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int quantidade_idades = 0;
        int soma_idades = 0;
        int idade = 1;
        while( idade > 0){
            idade = scanner.nextInt();
            if(idade > 0){
                soma_idades += idade;
                quantidade_idades++;
            }
        }

        double media_idades = (double)soma_idades / (double)quantidade_idades;

        System.out.printf("%.2f\n", media_idades);

    }
}
