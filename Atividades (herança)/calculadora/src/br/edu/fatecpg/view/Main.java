package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Soma " + calc.somar(10,5));
		System.out.println("subtração "+calc.subtrair(10,5));
		System.out.println("multiplicação "+ calc.multiplicar(10,5));
		System.out.println("Dividir "+ calc.dividir(10,5));
		
		
	}

}
