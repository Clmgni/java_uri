import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int idade_dias = scanner.nextInt();

        int ano, mes, dia;

        ano = idade_dias / 365;
        idade_dias %= 365;
        mes = idade_dias / 30;
        dia = idade_dias % 30;

        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
    }
}