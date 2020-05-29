import java.util.Scanner;

public class Uri1115{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int coord_x = 0;
        int coord_y = 0;
        String quadrante = "";

        do{
            coord_x = scanner.nextInt();
            coord_y = scanner.nextInt();

            if(coord_x > 0 && coord_y > 0)
                quadrante = "primeiro";
            else if(coord_x < 0 && coord_y > 0)
                quadrante = "segundo";
            else if(coord_x < 0 && coord_y < 0) 
                quadrante = "terceiro"; 
            else if(coord_x > 0 && coord_y < 0) 
                quadrante = "quarto";     
            else
                break;
            System.out.println(quadrante);
        }while(coord_x != 0 || coord_y != 0);
    }
}