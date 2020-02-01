package repasoPresencial31_01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Juego del ahorcado. Primera aproximación al algortimo del juego.
 * @author Manuel Vazquez
 *
 */
public class Ahorcado {

	public static void main(String[] args) {
		String palabra_objetivo = "Patata";
		String palaba_input = "";
		Scanner entradaEscaner = new Scanner(System.in);
		
		System.out.println("Numero de letras: "+palabra_objetivo.length());
		
		
		palabra_objetivo = palabra_objetivo.toLowerCase();
		char[] letras = new char[palabra_objetivo.length()];
		System.out.println("***********************");
		
		while(!palaba_input.equals(palabra_objetivo)) {
			System.out.println(Arrays.toString(letras));
			System.out.println("Introduzca letra");
			char inChar = entradaEscaner.nextLine().charAt(0);

			for (int i = 0; i < letras.length; i++) {
				if (palabra_objetivo.charAt(i)==inChar) {
					letras[i]=inChar;
				}
			}

			System.out.println(Arrays.toString(letras));
			
			System.out.println("Introduzca una palabra:");
			palaba_input = entradaEscaner.nextLine();
			
			System.out.println("***********************");
		}
		System.out.println("Acerto la palabra!!");

	}

	
}