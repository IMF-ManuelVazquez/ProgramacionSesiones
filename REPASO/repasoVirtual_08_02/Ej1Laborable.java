package sesion08_02;

import java.util.Scanner;

public class Ej1Laborable {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		int dia_semana = 0;
		
		
		System.out.println("Ingrese un dia de la semana:");
		dia_semana = entrada_escaner.nextInt();
		
		if (dia_semana>=1 && dia_semana<=7) {
			
			// hacemos el resto del ejercicio
			
			if (dia_semana>=1 && dia_semana<=4) {
				System.out.println("Es laborable");
			} else {
				System.out.println("No laborable");
			}
			
			
		}
		

	}

}
