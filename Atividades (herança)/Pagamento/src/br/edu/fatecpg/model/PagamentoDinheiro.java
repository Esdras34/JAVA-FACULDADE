package br.edu.fatecpg.model;

public class PagamentoDinheiro implements Pagamento{
	public double pagamentoOriginal;
	public double pagamentoFinal;
	
	public  PagamentoDinheiro(double pagamentoOriginal) {
		this. pagamentoOriginal = pagamentoOriginal;
		
	}
	  public void calcularPagamento(){
		pagamentoFinal = pagamentoOriginal * 0.90;
		
	}
	@Override
	public String emitirRecibo() {
		
		return "Pagamento em Dinheiro:\n" +
		           "Valor original: R$" + pagamentoOriginal + "\n" +
		           "Desconto (10%): R$" + (pagamentoOriginal - pagamentoFinal) + "\n" +
		           "Valor final: R$" + pagamentoFinal;
		
		
	}

}
