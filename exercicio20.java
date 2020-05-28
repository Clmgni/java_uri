import java.util.Scanner;
public class exercicio20{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    int sexo;
    float altura;
    float pesoideal;

    System.out.println("Digite o sexo (1 H ou 0 M)");
    sexo = teclado.nextInt();
    System.out.println("Digite a altura em cm");
    altura = teclado.nextFloat();
    
    if (sexo==1){
        pesoideal=(72.7f * altura)-58f;
        System.out.println("Peso ideal (1) : " + pesoideal);
    }
    else {     
        pesoideal=(68.1f * altura)-44.7f;
        System.out.println("Peso ideal (0) : " + pesoideal);
    }
}
}