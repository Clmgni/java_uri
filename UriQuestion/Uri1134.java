import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int total_alcool = 0;
        int total_gasolina = 0;
        int total_diesel = 0;
        int opcao_escolhida = 0;
        do{ 
            opcao_escolhida = scanner.nextInt();
            switch(opcao_escolhida){
                case 1: total_alcool++; break;
                case 2: total_gasolina++; break;
                case 3: total_diesel++; break;
                case 4: 
                        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", total_alcool, total_gasolina, total_diesel);
                        break;
                default: continue;
            };
        }while(opcao_escolhida != 4);
    }
}