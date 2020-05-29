import java.util.Scanner;

public class Uri2313{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int IsTriangulo = 0;
        String TipoTriangulo = "";
        String TrianguloRetangulo = "N";
        double medida_final = 0.0;
        if((A + B) > C && (A + C) > B && (B + C) > A){
            IsTriangulo = 1;
            if(( A == B ) && (A == C) && ( B == C)){
                TipoTriangulo = "Valido-Equilatero";
            }else if(( A == B ) || (A == C) || ( B == C)){
                TipoTriangulo = "Valido-Isoceles";
            }else if(( A != B ) && (A != C) && ( B != C)){
                TipoTriangulo = "Valido-Escaleno";
            }

            if((A * A == (B * B + C * C)) 
            || (B * B == (A * A + C * C))
            || (C * C == (A * A + B * B))){
                TrianguloRetangulo = "S";
            }
        }
        
        if(IsTriangulo == 1){
            System.out.println(TipoTriangulo);
            System.out.println("Retangulo: "+TrianguloRetangulo);
        }else{
            System.out.println("Invalido");
        }
        
    }
}