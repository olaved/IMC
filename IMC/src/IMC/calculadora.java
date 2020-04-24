package IMC;

import java.util.Scanner;

public class calculadora {
	

	
	static void imc(float altura, float peso) {
		
		float imc=peso/(altura*altura);
		
		if ( imc<=15 ) {
			System.out.println("Delgade muy severa");
		}
		
		else if ( imc>15 && imc<16 ) {
			System.out.println("Delgade severa");
		}		

		else if ( imc>=16 && imc<=18.4 ) {
			System.out.println("Delgadez");
		}
		
		else if ( imc>=18.5 && imc<=24.9 ) {
			System.out.println("Peso saludable");
		}
		
		else if ( imc>=25 && imc<=29.9 ) {
			System.out.println("Sobrepeso");
		}
		
		else if ( imc>=30 && imc<34.9 ) {
			System.out.println("Obesidad severa");
		}
		
		else if ( imc>=35 ) {
			System.out.println("Obesidad morbida");
		}
		System.out.println(imc);
		return;
	}

}
