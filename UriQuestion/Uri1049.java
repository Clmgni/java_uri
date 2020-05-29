import java.util.Scanner;

public class Uri1049{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        String caract_1 = scanner.nextLine();
        String caract_2 = scanner.nextLine();
        String caract_3 = scanner.nextLine();

        String resultado = "";

        if(caract_1.equals("vertebrado")){
            if(caract_2.equals("ave")){
                if(caract_3.equals("carnivoro")){
                    resultado = "aguia";
                }else if(caract_3.equals("onivoro")){
                    resultado = "pombo";
                }
            }else if(caract_2.equals("mamifero")){
                if(caract_3.equals("onivoro")){
                    resultado = "homem";
                }else if(caract_3.equals("herbivoro")){
                    resultado = "vaca";
                }
            }
        }else if(caract_1.equals("invertebrado")){
            if(caract_2.equals("inseto")){
                if(caract_3.equals("hematofago")){
                    resultado = "pulga";
                }else if(caract_3.equals("herbivoro")){
                    resultado = "lagarta";
                }
            }else if(caract_2.equals("anelideo")){
                if(caract_3.equals("hematofago")){
                    resultado = "sanguessuga";
                }else if(caract_3.equals("onivoro")){
                    resultado = "minhoca";
                }
            }
        }

        System.out.println(resultado);
    }
}