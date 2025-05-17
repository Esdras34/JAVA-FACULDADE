package br.edu.fatecpg.atividade4.model;

public class PagamentoCartao extends Pagamento{

	@Override
	public void ProcessarPagamento() {
		System.out.println("Processando pagamento via cartão de crédito");
	}
	

}
