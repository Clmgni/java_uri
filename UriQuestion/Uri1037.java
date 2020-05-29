import java.util.Scanner;

public class Uri1037{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double numero = scanner.nextDouble();
        String intervalo = "";
        int sem_intervalo = 0;

        if( numero >= 0.0 && numero <= 25.0){
            intervalo = "[0,25]";
        }else{
            if(numero > 25.00 && numero <= 50.0){                
                intervalo = "(25,50]";
            }else{
                if(numero > 50.00 && numero <= 75.0){            
                    intervalo = "(50,75]";
                }else{
                    if(numero > 75.00 && numero <= 100.0){
                        intervalo = "(75,100]";
                    }else{
                        sem_intervalo = 1;
                    }
                }
            }
        }

        if(sem_intervalo != 1){
            System.out.printf("Intervalo %s\n", intervalo);
        }else{            
            System.out.printf("Fora de intervalo\n");
        }
    }
}