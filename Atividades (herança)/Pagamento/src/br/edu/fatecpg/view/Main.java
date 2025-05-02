package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;

public class Main {

	public static void main(String[] args) {
		 Pagamento pagamentoDinheiro = new PagamentoDinheiro(100);
		 
	        pagamentoDinheiro.calcularPagamento();
	        System.out.println(pagamentoDinheiro.emitirRecibo());

	        System.out.println(); 

	       
	        Pagamento pagamentoCartao = new PagamentoCartao(100);
	        
	        pagamentoCartao.calcularPagamento();
	        System.out.println(pagamentoCartao.emitirRecibo());
	}

}
