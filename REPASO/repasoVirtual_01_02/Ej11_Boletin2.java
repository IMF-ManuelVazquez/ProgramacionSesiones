package repaso01_02;

import java.util.Scanner;

/**
 * Ej 11 Boletin2
 * 11. Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).
 * @author Manuel Vazquez
 *
 */
class Ej11_Boletin2 {

	public static void main(String[] args) {
		
		//String frase = "La lluvia en Sevilla es una maravilla";
		Scanner entradaEscaner = new Scanner(System.in);
		int contadorVocales =0;
		
		System.out.println("Ingrese una frase para analizar su numero de vocales");
		String frase = entradaEscaner.nextLine();
		frase = frase.toLowerCase();
		
		System.out.println("Tamaño del STring es: "+frase.length());
		
		for (int i = 0; i < frase.length(); i++) {
			//System.out.println(frase.charAt(i));
			char inChar = frase.charAt(i);
			if ((inChar=='a') || (inChar=='e') || (inChar=='i') || (inChar=='o') || (inChar=='u')) {
				contadorVocales++;
			}
//			if ((inChar=='A') || (inChar=='E') || (inChar=='I') || (inChar=='O') || (inChar=='U')) {
//				contadorVocales++;
//			}
		}
		
		System.out.println("Contador de vocales es: "+contadorVocales);

	}

}
