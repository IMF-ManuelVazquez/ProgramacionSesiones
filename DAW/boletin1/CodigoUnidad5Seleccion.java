package boletin1;

import java.util.Scanner;

public class CodigoUnidad5Seleccion {

	public static void main(String[] args) {
		
		// ESCRIBIR POR PANTALLA
		System.out.println ("Hola mundo");
		System.out.println("hola mundo2");
		
		// LEER ENTRADA POR TECLADO.
//		Scanner escaner = new Scanner(System.in);
//		
//		int variable_int = escaner.nextInt();
//		double variable_double = escaner.nextDouble();
		
		
		System.out.println("***************************************************************************");
		int nota = 6;
		
		
		// ESTRUCTURA DE SELECCION: IF
		if (nota>=5) {
			System.out.println("APROBASTES");
			System.out.println("FELICIDADES");
		}
		

		// ESTRUCTURA DE SELECCION: IF - ELSE
		if (nota>=5) {
			System.out.println("APROBASTES");
			System.out.println("FELICIDADES");
			if (nota >= 9) {
				System.out.println("SOBRESALIENTE");
				if (nota == 10) {
					System.out.println("MATRICULA DE HONOR");
				}
				
			} else {
				
			}
		} else {
			System.out.println("SUSPENDISTES");
			System.out.println("Nos vemos en Junio");
		}
		
		
		System.out.println("***************************************************************************");
		
		int precio_movil_ganga = 100;
		int precio_movil = 90;
		
		if (precio_movil<=precio_movil_ganga) {
			System.out.println("GANGA");
		}else {
			System.out.println("NO ES UNA GANGA");
		}
		
		System.out.println("***************************************************************************");
		
		// ESTRUCTURA DE SELECCION: SWITCH
		
		int dia_semana = 5;
		
		if (dia_semana==1) {
			System.out.println("LUNES");
		}else if (dia_semana == 2) {
			System.out.println("LMAR");
		}else if (dia_semana == 3) {
			System.out.println("MIER");
		}else if (dia_semana == 4) {
			System.out.println("JUE");
		}else if (dia_semana == 5) {
			System.out.println("VIER");
		}else if (dia_semana == 6) {
			System.out.println("SAB");
		}else if (dia_semana == 7) {
			System.out.println("DOM");
		}else {
			System.out.println("Numero erroneo");
		}
		
		dia_semana = 10;
		
		switch (dia_semana) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIERC");
			break;
		case 4:
			System.out.println("JUEV");
			break;
		case 5:
			System.out.println("VIERN");
			break;
		case 6:
			System.out.println("SAB");
			break;
		case 7:
			System.out.println("DOM");
			break;
		default:
			System.out.println("Numero correspondiente al dia de la semana incorrecto");
			break;
		}
		
		System.out.println("FINALIZA LA CLASE ME ESTOY PASANDO EL TIEMPO");
		
	}

}
