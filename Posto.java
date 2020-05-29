import java.util.Scanner;
public class posto {
	public static void main(String args[]) {
		bombacomb b;
		b = new bombacomb("Gasolina",3.49f);
        int modo;
        float qtde;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por litro (1) ou por valor (2)?");
        modo = teclado.nextInt();
        System.out.println("Digite o valor:");
        qtde = teclado.nextFloat();
        boolean deuCerto;
		
        b.puxarGancho();
        if (modo==2){
            deuCerto = b.abastecerPorValor(qtde);
        }
        else {
            deuCerto = b.abastecerPorLitros(qtde);
        }
		b.voltarGancho();
		
		if (deuCerto) {
			System.out.println(b.exibirInfo());
		}
		else {
			System.out.println("Nao rolou o abastecimento");
		}
		
	}
}