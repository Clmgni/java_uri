import java.util.Scanner;
public class Relogio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora    = scanner.nextInt();
        int minuto  = scanner.nextInt();
        int segundo = scanner.nextInt();

        Time time = new Time();

        time.setTime(hora, minuto, segundo);

        System.out.println(time.exibirHoraUniversal());
        System.out.println(time.exibirHoraPadrao());
    }
}