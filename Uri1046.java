import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio = entrada.nextInt();
        int fim = entrada.nextInt();
        int duracao = 24 - (24 + inicio - fim) % 24;
        if (inicio == fim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }

    }
}