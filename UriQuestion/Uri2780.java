import java.util.Scanner;

public class Uri2780{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        int valor_cesta = 0;
        if(distancia <= 800){
            valor_cesta = 1;
        }else if(distancia <= 1400){
            valor_cesta = 2;
        }else if(distancia <= 2000){
            valor_cesta = 3;
        }

        System.out.println(valor_cesta);
        
    }
}