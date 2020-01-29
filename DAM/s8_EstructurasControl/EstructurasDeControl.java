package s8_EstructurasControl;

import java.util.Scanner;

public class EstructurasDeControl {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		double nota = 0;
		int dia_de_semana = 0;
		
		System.out.println("Escriba la nota del alumno");
		nota = entrada_escaner.nextDouble();
		
		System.out.println("Lectura: "+nota);
		
		// SI QUEREMOS UNIR DOS CONDICIONES
		// && = Y
		// || = O
		
		// IF
		if ((nota >= 0) && (nota<=10)) {
			System.out.println("Nota válida");
			
			// IF ... ELSE
			if (nota >= 5) {
				System.out.println("El alumno ha aprobado");
				if (nota == 10) {
					System.out.println("El alumno ha conseguido matricula de honor");
				} else {
					System.out.println("El alumno no ha conseguido la matricula");
				}
			} else {
				System.out.println("El alumno ha suspendido");
			}
		}
		
		System.out.println("El algoritmo ha terminado");
		
		/********************************************************************/
		// SWITCH: SELECCION MULTIPLE -- MULTIPLES CAMINO.
		
		System.out.println("Introduzca un dia de la semana numero entre 1 y 7");
		dia_de_semana = (int) entrada_escaner.nextDouble();
		
		System.out.println("Dia introducido: "+dia_de_semana);
		
		switch (dia_de_semana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Condicion por defecto.. sino se cumple ninguna de las anteriores");
			break;
		}
		
		System.out.println("Fin del algortimo. Del switch");
		
		// Indicar si el dia es laborable o no. dada un numero entre 1 y 7
		switch (dia_de_semana) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Laborable");
			break;
		case 6:
		case 7:
			System.out.println("No laborable");
			break;

		default:
			System.out.println("Condicion por defecto.. sino se cumple ninguna de las anteriores");
			break;
		}

		// El mnes en que estamos dado un numero entre 1 y 12 ---> Enero,... Diciembre.
	}

}
