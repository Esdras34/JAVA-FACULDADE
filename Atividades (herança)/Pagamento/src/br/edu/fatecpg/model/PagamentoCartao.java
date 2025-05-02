package br.edu.fatecpg.model;

public class PagamentoCartao implements Pagamento{
	
	public double pagamentoOriginal;
	public double pagamentoFinal;
	
	public PagamentoCartao(double pagamentoOriginal) {
		this.pagamentoOriginal = pagamentoOriginal;
	}
	@Override
	public void calcularPagamento() {
		pagamentoFinal = pagamentoOriginal * 1.05;
	
	}

	@Override
	public String emitirRecibo(){
	
		return "Pagamento em Cartão:\n" +
		           "Valor original: R$" + pagamentoOriginal + "\n" +
		           "taxa (5%): R$" + ( pagamentoFinal - pagamentoOriginal) + "\n" +
		           "Valor final: R$" + pagamentoFinal;
	}

}
