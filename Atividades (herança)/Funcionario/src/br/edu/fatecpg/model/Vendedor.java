  package br.edu.fatecpg.model;

public class Vendedor implements Funcionario{

	@Override
	public void baterPonto() {
		System.out.println("ponto batido!");
		
	}

	public void realizarVenda() {
		System.out.println("realizando venda!");
	}
	
		public void fecharCaixa() {
			System.out.println("fechando caixa!");
			
		
		}

		@Override
		public void solicitarMaterial() {
			System.out.println("solicitando material!");
			
		}
		
}
