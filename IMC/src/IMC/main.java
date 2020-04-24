package IMC;

import java.util.Scanner;

public class main {
	
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		//		System.out.println("Calculadora de IMC");
		System.out.println("Calculadora de IMC");
		System.out.println("Ingresa la altura");
		String altura = sc.nextLine();
		float altura1 = Float.parseFloat(altura);

		System.out.println("Ingresa el peso");
		String peso = sc.nextLine();
	    int peso1 = Integer.parseInt(peso);
				
		calculadora m1=new calculadora();
		calculadora.imc(altura1, peso1);
		



	}

}
