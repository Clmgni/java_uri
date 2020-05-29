import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double ponto_x = scanner.nextDouble();
        double ponto_y = scanner.nextDouble();
        String quadrante = "";
        if(ponto_x == 0.0 && ponto_y == 0.0){
            quadrante = "Origem";
        }else if(ponto_x > 0.0 && ponto_y > 0.0){
            quadrante = "Q1";
        }else if(ponto_x > 0.0 && ponto_y < 0.0){
            quadrante = "Q4";
        }else if(ponto_x < 0.0 && ponto_y > 0.0){
            quadrante = "Q2";
        }else if(ponto_x < 0.0 && ponto_y < 0.0){
            quadrante = "Q3";
        }else if(ponto_x == 0.0 && ponto_y != 0.0){
            quadrante = "Eixo Y";
        }else if(ponto_x != 0.0 && ponto_y == 0.0){
            quadrante = "Eixo X";
        }

        System.out.println(quadrante);
    }
}