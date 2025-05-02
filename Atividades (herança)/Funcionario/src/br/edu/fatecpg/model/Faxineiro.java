package br.edu.fatecpg.model;

public class Faxineiro implements Funcionario{

	@Override
	public void baterPonto() {
		System.out.println("ponto batido!");
		
	}

	@Override
	public void solicitarMaterial() {
		System.out.println("solicitando material!");
	}

}
