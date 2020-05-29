import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int numero_linhas = scanner.nextInt();
        int valor_atual = 0;
        
        for(int contagem=1; contagem <= numero_linhas; contagem++ ){
            valor_atual = contagem;
            System.out.printf("%d %d %d\n", valor_atual, valor_atual *= contagem, valor_atual *= contagem);
            valor_atual = contagem;
            System.out.printf("%d %d %d\n", valor_atual, (valor_atual *= contagem) + 1, (valor_atual *= contagem) + 1);
        }
    }
}