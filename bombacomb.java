public class bombacomb {
	private String nome;
	private float precoLitro;
	private float valorTotal;
	private float qtdeLitros;
	private boolean abastecendo;

	public bombacomb(String nome, float precoLitro) {
		super();
		this.nome = nome;
		this.precoLitro = precoLitro;
	}

	public float getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(float precoLitro) {
		this.precoLitro = precoLitro;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public float getQtdeLitros() {
		return qtdeLitros;
	}

	/*
	 *  o metodo puxar gancho apenas habilita algum tipo de abastecimento
	 */
	public void puxarGancho() {
		abastecendo = true;
		qtdeLitros = 0.0f;
		valorTotal = 0.0f;
	}
	
	/*
	 * voltar gancho desabilita o abastecimento
	 */

	public void voltarGancho() {
		abastecendo = false;
	}

	/*
	 * este metodo retorna se deu certo o abastecimento, pois
	 * para abastecer, a variavel abastecendo tem que estar verdadeira
	 */
	public boolean abastecerPorLitros(float qtd) {
		if (abastecendo) {
			qtdeLitros = qtd;
			valorTotal = qtdeLitros * precoLitro;
			return true;
		}
		else {
			return false;
		}
		
	}

	/* mesma explicacao do metodo anterior 
	 * 
	 */
	public boolean abastecerPorValor(float valor) {
		if (abastecendo) {
			valorTotal = valor;
			qtdeLitros = valorTotal / precoLitro;
			return true;
		}
		else {
			return false;
		}
	}

	public String exibirInfo() {
		String res;
		res = " Bomba de Combustivel " + nome + "\n" + " ------------------------------------\n"
				+ " Preco do Litro R$: " + String.format("%.2f", precoLitro) + "\n" + " Total de Litros  : "
				+ String.format("%.2f", qtdeLitros) + "\n" + " Total a Pagar  R$: " + String.format("%.2f", valorTotal)
				+ "\n" + " ====================================";
		return res;

	}
}