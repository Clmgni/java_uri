import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int numero_recebido = 0;
        int total_par = 0;
        int total_impar = 0;
        int total_positivo = 0;
        int total_negativo = 0;

        for(int contagem = 0; contagem < 5; contagem++){
            numero_recebido = scanner.nextInt();
            if(numero_recebido > 0.0){
                total_positivo++;
            }else if(numero_recebido < 0.0){
                total_negativo++;
            }

            if(numero_recebido % 2 == 0){
                total_par++;
            }else{
                total_impar++;
            }
            

        }
        
        System.out.println(total_par+" valor(es) par(es)");
        System.out.println(total_impar+" valor(es) impar(es)");
        System.out.println(total_positivo+" valor(es) positivo(s)");
        System.out.println(total_negativo+" valor(es) negativo(s)");
    }
}