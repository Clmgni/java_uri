import java.util.Scanner;

public class Ex20{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu sexo: (0 - Homem/ 1 - Mulher)");
        int sexo = scanner.nextInt();
        String string_sexo = "";
        System.out.println("Digite sua altura: (Ex: 1,75)");
        double altura = scanner.nextDouble();
        double peso_ideal = 0.0;
        if((sexo == 0)){
            peso_ideal = (72.7 * altura) - 58.0;
            string_sexo = "Homem"; 
        }else{
            peso_ideal = (62.1 * altura) - 44.7;
            string_sexo = "Mulher";
        }

        System.out.printf("O peso para um(a) %s com altura de %.2f eh %.2f", string_sexo, altura, peso_ideal);
    }
}