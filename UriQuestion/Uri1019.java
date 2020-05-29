import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int total_segundos = scanner.nextInt();
        int hora, minuto, segundos;

        hora = total_segundos / 3600;
        total_segundos = total_segundos % 3600 ;
        minuto = total_segundos / 60;
        segundos = total_segundos % 60;
        System.out.printf("%d:%d:%d\n", hora, minuto, segundos);

    }
}