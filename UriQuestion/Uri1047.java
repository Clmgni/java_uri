import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int hora_inicio = scanner.nextInt();
        int minuto_inicio = scanner.nextInt();
        int hora_fim = scanner.nextInt();
        int minuto_fim = scanner.nextInt();
        int total_horas = 0;
        int total_minutos = 0;
        if(hora_inicio < hora_fim){
            if(minuto_inicio <= minuto_fim){
                total_horas = hora_fim - hora_inicio;
                total_minutos = minuto_fim - minuto_inicio;

            }else if(minuto_inicio > minuto_fim){
                int minutos_ate_fim_hora = 60 - minuto_inicio;
                total_minutos = minutos_ate_fim_hora + minuto_fim;
                total_horas = (hora_fim - hora_inicio) - 1;
            }
        }else if((hora_inicio > hora_fim)){
            if(minuto_inicio <= minuto_fim){
                int horas_ate_fim_dia = 24 - hora_inicio;
                total_horas = horas_ate_fim_dia + hora_fim;
                total_minutos = minuto_fim - minuto_inicio;
            }else if(minuto_inicio > minuto_fim){
                int minutos_ate_fim_hora = 60 - minuto_inicio;
                total_minutos = minutos_ate_fim_hora + minuto_fim;
                int horas_ate_fim_dia = 24 - hora_inicio;
                total_horas = (horas_ate_fim_dia + hora_fim) -1 ;
            }
        }else if((hora_inicio == hora_fim)){
            if(minuto_inicio < minuto_fim){      
                total_horas = hora_fim - hora_inicio;        
                total_minutos = minuto_fim - minuto_inicio;
            }else if(minuto_inicio > minuto_fim){
                int minutos_ate_fim_hora = 60 - minuto_inicio;
                total_minutos = minutos_ate_fim_hora + minuto_fim;  
                int horas_ate_fim_dia = 24 - hora_inicio;
                total_horas = (horas_ate_fim_dia + hora_fim) - 1;
            }else if(minuto_inicio == minuto_fim){
                total_horas = 24;
                total_minutos = 0;
            }
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", total_horas, total_minutos);
    }
}