package repaso01_02;

import java.util.Scanner;

/**
 * 8. Pedir dos fechas y mostrar mediante una función el número de días que hay de diferencia. 
 * Inicialmente supone que todos los meses de 30 días. 
 * ( EXTRA : Tener en cuentanº día según día de mes y año bisiesto o no).
 * 
 * @author Manuel Vazquez
 *
 */
public class Ej8_Boletin3 {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int dia1 = 0;
		int mes1 = 0;
		int anio1 = 0;
		
		int dia2 = 0;
		int mes2 = 0;
		int anio2 = 0;
		
		System.out.println("Introduzca la fecha 1");
		System.out.println("dia:");
		dia1 = entradaEscaner.nextInt();
		System.out.println("mes:");
		mes1 = entradaEscaner.nextInt();
		System.out.println("año:");
		anio1 = entradaEscaner.nextInt();
		
		System.out.println("Introduzca la fecha 2");
		System.out.println("dia:");
		dia2 = entradaEscaner.nextInt();
		System.out.println("mes:");
		mes2 = entradaEscaner.nextInt();
		System.out.println("año:");
		anio2 = entradaEscaner.nextInt();
		
		int fecha1EnDias = convertirFechaDias(dia1, mes1, anio1);
		System.out.println("Dias trasncurridos fecha1: "+fecha1EnDias);
		int fecha2EnDias = convertirFechaDias(dia2, mes2, anio2);
		System.out.println("Dias trasncurridos fecha2: "+fecha2EnDias);
		
		int diffFechas = Math.abs(fecha2EnDias-fecha1EnDias);
		System.out.println("diferencia de días: "+diffFechas);
		
	}
	
	public static int convertirFechaDias(int dia, int mes, int anio) {
		int dias_transcurridos = dia + (mes*30) + (anio*30*12);
		return dias_transcurridos;
	}

}
