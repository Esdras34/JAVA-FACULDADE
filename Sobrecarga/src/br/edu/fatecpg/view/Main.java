package br.edu.fatecpg.view;
import br.edu.fatecpg.model.Calculadora;




public class Main {

	public static void main(String[] args) {
		
		Calculadora somar = new Calculadora();
		
		
		System.out.println("Soma int 5+5= "+ somar.somar1(5, 5));
		System.out.println("Soma double 5+5+5="+ somar.somar2(5, 5, 5));
		System.out.println("Soma int 5+5="+somar.somar3(5, 5));
		

	}

}
