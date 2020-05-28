import java.util.Scanner;
public class Leitura{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int a;
        float b;

        System.out.println("Digite um valor inteiro");
        a = teclado.nextInt();
        b = teclado.nextFloat();

        System.out.println("Voce digitou " + a + " e " + b );
    }
}