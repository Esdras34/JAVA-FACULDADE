 package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;

public class Main {

	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor();
		
		Gerente gerente = new Gerente();
		
		Faxineiro faxineiro = new Faxineiro();
		
	
		
		
		
		System.out.println("--- Ações do Vendedor ---");
		vendedor.baterPonto();
		vendedor.solicitarMaterial();
		vendedor.realizarVenda();
		vendedor.fecharCaixa();

		System.out.println("\n--- Ações do Gerente ---");
		gerente.baterPonto();
		gerente.solicitarMaterial();
		gerente.fecharCaixa();
		
		System.out.println("\n--- Ações do Faxineiro ---");
		faxineiro.baterPonto();
		faxineiro.solicitarMaterial();

	}
}