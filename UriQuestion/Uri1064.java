import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double numero_recebido = 0.0;
        int numeros_positivos = 0;
        double valor_total_positivo = 0.0;
        double media = 0.0;

        for(int contagem = 1; contagem <= 6; contagem++){
            numero_recebido = scanner.nextDouble();
            if(numero_recebido > 0.0){
                numeros_positivos++;
                valor_total_positivo += numero_recebido;
            }
            

        }
        media = valor_total_positivo / numeros_positivos;
        System.out.println(numeros_positivos + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}