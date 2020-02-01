package repasoPresencial31_01;

import java.util.Scanner;

/**
 * Ej1 Examen Recuperación Examen presencial.
 * @author Manuel Vazquez
 *
 */
public class EjLaborable {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int dia_entrada;
		System.out.println("Ingrese dia de la semana");
		dia_entrada=entradaEscaner.nextInt();
		
		if (dia_entrada>=1 && dia_entrada<=7) {
			
			System.out.println("usando el IF");
			if (dia_entrada>=1 && dia_entrada<=5) {
				System.out.println("Es laborable");
				
			} else {
				System.out.println("No es laborable");
			}
			
			System.out.println("Usando el switch");
			switch (dia_entrada) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Es laborable");
				break;
			case 6:
			case 7:
				System.out.println("No es laborable");
				break;
			}
			
			char inChar = 'a';
			switch (inChar) {
			case 'a':
				
				break;
			case 'b':
				
				break;

			default:
				break;
			}
			
			
			String entrada = "lunes";
			switch (entrada) {
			case "lunes":
				
				break;
			case "martes":
				
				break;

			default:
				break;
			}
			
			
		} else {

			
			System.out.println("Formato incorrecto");
			
		}

	}

}
