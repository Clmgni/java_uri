import java.util.Scanner;

public class Uri1160{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int quantidade_testes = scanner.nextInt();
        int pop_a = 0;
        int pop_b = 0;
        double cresc_a = 0;
        double cresc_b = 0;

        for(int teste = 1; teste <= quantidade_testes; teste++){            
            pop_a = scanner.nextInt();
            pop_b = scanner.nextInt();
            cresc_a = scanner.nextDouble();
            cresc_b = scanner.nextDouble();
            int anos = 0;
            while( (pop_a <= pop_b) && anos <= 100){
                pop_a += (pop_a * (cresc_a/100));
                pop_b += (pop_b * (cresc_b/100));
                anos++;
                
            }
            System.out.printf(anos <= 100 ? "%d anos.\n" : "Mais de 1 seculo.\n", anos);
        }

    }
}
