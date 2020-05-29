public class Uri1142{
    public static void main(String args[]){
        for(int inicio = 1, numero_linhas = new java.util.Scanner(System.in).nextInt(); 
            inicio <= 4 * numero_linhas; 
            System.out.printf((inicio % 4 != 0 ? "%s " : "PUM\n"), inicio++));
    }
}