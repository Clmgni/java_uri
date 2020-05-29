import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int tempo_viagem = scanner.nextInt();
        int velocidade_media = scanner.nextInt();

        int km_rodados = tempo_viagem * velocidade_media;

        double litros_gastos = km_rodados / 12.0;

        System.out.printf("%.3f\n", litros_gastos);
    }
}