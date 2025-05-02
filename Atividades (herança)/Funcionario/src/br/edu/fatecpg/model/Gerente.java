package br.edu.fatecpg.model;

public class Gerente implements Funcionario{

	@Override
	public void baterPonto(){
		System.out.println("o gerente não bate ponto!");
		
	}

	@Override
	public void solicitarMaterial(){
		System.out.println("solicitando material!");
		
	}
	public void fecharCaixa() {
		System.out.println("fechando caixa!");
		
	}


}
