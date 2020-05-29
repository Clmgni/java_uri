import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int senha_tentada = 0;

        while(senha_tentada != 2002){
            senha_tentada = scanner.nextInt();
            if(senha_tentada == 2002){
                break;
            }
            System.out.println("Senha Invalida");
        }

        System.out.print("Acesso permitido");
    }
}