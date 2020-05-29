import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int hora_inicio = scanner.nextInt();
        int hora_fim = scanner.nextInt();
        int total_horas = 0;
        if(hora_inicio < hora_fim){
            total_horas = hora_fim - hora_inicio;
        }else{
            int horas_ate_fim_dia = 24 - hora_inicio;
            total_horas = horas_ate_fim_dia + hora_fim;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", total_horas);
    }
}