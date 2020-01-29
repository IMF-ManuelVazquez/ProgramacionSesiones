package s9_EStructurasDeControl;

import java.util.Scanner;

public class EstructurasControl2 {

	public static void main(String[] args) {
		
		// ESTRUCTURAS DE SELECCION
		// IF ..  		>>  SI y no se contempla el caso contrario. (1 opcion).
		// IF .. ELSE	>>  SI... SINO. Se contempla el caso contrario. (2opciones)
		// SWITCH 		>>  SELECCIÓN MULTIPLE.
		
		int nota = 5;
		
		// IF
		if (nota == 10) {
			System.out.println("tienes un 10");
		}
		
		// IF .. ELSE SIMPLE
		if (nota==10) {
			System.out.println("otra vez tienes un 10");
		}else {
			System.out.println("lo siento no tienes un 10");
		}
		
		// IF .. ELSE MULTIPLE
		if (nota==10) {
			System.out.println("otra vez tienes un 10");
		}else {
			if (nota == 5) {
				System.out.println("pues tienes un 5");
			}else {
				System.out.println("No acierto con tu nota");
			}
		}
		
		// IF .. ELSE ANIDADO
		if (nota==10) {
			System.out.println("otra vez tienes un 10");
		}else if (nota == 5) {
			System.out.println("pues tienes un 5");
		}else {
			System.out.println("No acierto con tu nota");
		}
		
		// DECISION MULTIPLE: SWITCH
		
		switch (nota) {
		case 0:
			System.out.println("tienes un 0 ");
			break;
		case 1:
			System.out.println("tienes un 1 ");
			break;
		case 2:
			System.out.println("tienes un 2 ");
			break;

		default:
			System.out.println("default");
		}
		
		System.out.println("********************************************");
		System.out.println("ESTRUCTURAS DE REPETICION");
		System.out.println("WHILE");
		
//		int contador = 0;
//		while (contador <100) {
//			System.out.println("hola mundo, por "+ contador +" veces");
//			//contador = contador + 1;
//			contador++;
//			// caso practico de while: recalculamos contador como un valor aleatorio entre 0 y 100;
//			// caso practido de uso de while: el usuario introduce un valor y cuando escribe -1 termina.
//		}
//		
//		// caso practido de uso de while: el usuario introduce un valor y cuando escribe -1 termina. de 0 a n veces.
//		Scanner entrada_escaner = new Scanner(System.in);
//		System.out.println("Dame datos");
//		int entrada = entrada_escaner.nextInt();
//		while (entrada != - 1) {
//			System.out.println("Dame datos");
//			entrada = entrada_escaner.nextInt();
//		}
//		
//		// do.. while 
//		contador = 0;
//		do {
//			System.out.println("hola mundo, por "+ contador +" veces");
//			contador++;
//		} while (contador <100);
//		
//		// caso practido de uso de do.. while: el usuario introduce un valor y cuando escribe -1 termina. de 1 a n veces
//		entrada = 0;
//		do {
//			System.out.println("Dame datos");
//			entrada = entrada_escaner.nextInt();
//		} while (entrada != - 1);
		
		
		// USO DEL FOR.
		// FOR INCREMENTAL
		System.out.println("FOR INCREMENTAL");
		for (int i = 0; i < 10; i++) {
			System.out.println("hola mundo: "+ i);
		}
		
		
		// FOR DECREMENTAL
		System.out.println("FOR DECREMENTAL");
		for (int i = 10; i > 0; i--) {
			System.out.println("hola mundo: "+ i);
		}
		
		// RETO: 
		System.out.println("FOR TRAMPA");
		for (int i = 0; i == 10; i++) {
			System.out.println("hola mundo: "+ i);
		}
		
		// RETO2:
		System.out.println("FOR RETO 2 - VER NUMEROS PARES DE 0 A 10");
		for (int i = 0; i <= 10; i=i+2) {
			System.out.println("hola mundo: "+ i);
		}
		
		System.out.println("FOR RETO 2 - VER LOS NUMEROS IMPARES DE 0 A 10");
		for (int i = 1; i <= 10; i=i+2) {
			System.out.println("hola mundo: "+ i);
		}
		
		// DIME LOS NUMEROS PARES DE 0 A 10 USANDO UN IF Y RECORRIENDO TODOS LOS VALORES DE 0 A 10.
		System.out.println("DIME LOS NUMEROS PARES DE 0 A 10 USANDO UN IF Y RECORRIENDO TODOS LOS VALORES DE 0 A 10");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("hola mundo: "+ i);
			}
		}
		// FOR (INICIO, UNA CONDICION, TRANSICION-QUE HACER TRAS LAS INSTRUCCIONES)
	
		
	}

}
