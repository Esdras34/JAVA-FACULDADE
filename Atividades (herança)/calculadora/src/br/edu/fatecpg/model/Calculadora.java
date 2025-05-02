package br.edu.fatecpg.model;

public class Calculadora implements OperacaoMatematica{

	@Override
	public double somar(double a, double b) {
		
		return a + b;
	}

	@Override
	public double subtrair(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double dividir(double a, double b) {
		if(b==0) {
			System.out.println("A divisão por 0 não é permitida");
		}
		return a / b;
	}

}
	
