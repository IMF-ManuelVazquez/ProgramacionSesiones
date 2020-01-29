package boletin1;

public class CodigoUnidad5Repeticion {

	public static void main(String[] args) {
		
		
		// REPETICI�N: WHILE
		
		int contadorPRO = 10;
		
		while (contadorPRO < 5) {
			
			System.out.println("HOLA MUNDO");
			System.out.println(contadorPRO);
			contadorPRO = contadorPRO + 1;
			
		}
		
		System.out.println("Fin del bucle de repetici�n While");
		
		System.out.println("***********************************************************************************");
		
		// REPETICI�N: DO... WHILE
		
		int contador_do_while = 10;
		
		do {
			
			System.out.println("HOLA MUNDO");
			System.out.println(contadorPRO);
			contadorPRO = contadorPRO + 1;
			
		} while (contadorPRO < 5);
		
		System.out.println("Fin del bucle de repetici�n Do..while");
		
		
		/*
		 * 
		 * while : Se ejecuta de 0 a X veces...
		 * do..while : Se ejecuta de 1 a X veces
		 * 
		 * /
		 */
		
		System.out.println("***********************************************************************************");
		System.out.println("***********************************************************************************");
		
		
		// EJEMPLO DE FOR
		
//		System.out.println("transiciones ascendentes");
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println(i);
//	
//		}
//		
//		System.out.println("transiciones descendentes");
//		for (int i = 10; i > 0; i--) {
//			
//			System.out.println(i);
//	
//		}
		
		System.out.println("inici");
		
		for (int i=0; i==100; i++) {
			System.out.println(i);
		}
		
		System.out.println("fin");
		
		
	}

}
