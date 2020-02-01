package repaso01_02;

import java.util.Scanner;

/**
 * 13. Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el número de números introducidos
 * @author Manuel Vazquez
 *
 */
public class Ej13_Boletin2 {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int entrada = 0;
		int contador = 0;
		
//		do {   // 1 -- N
//			System.out.println("Ingrese un numero entero");
//			entrada = entradaEscaner.nextInt();
//			contador ++;
//		}while (entrada!=-1); 
//		
//		System.out.println("Fin del algoritmo");
//		System.out.println("Contador resultante: "+contador);
		
		while (entrada!=-1) {  // 0 --- N
			
			System.out.println("Ingrese un numero entero");
			entrada = entradaEscaner.nextInt();
			contador ++;
			
		}
		
		System.out.println("Fin del algoritmo");
		System.out.println("Contador resultante: "+contador);
		
		
		

	}

}
