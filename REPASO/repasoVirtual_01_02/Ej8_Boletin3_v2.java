package repaso01_02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ej 8 Boletin 3 usando vectores en lugar de variables individuales.
 * @author Manuel Vazquez
 *
 */
public class Ej8_Boletin3_v2 {

	public static void main(String[] args) {
		
		int[] fecha1 = new int[3];
		int[] fecha2 = new int[3];
		Scanner entradaEscaner = new Scanner(System.in);
		
		
		System.out.println("Rellenar fecha 1");
		System.out.println("Ingrese dia, mes y año");
		for (int i = 0; i < fecha1.length; i++) {
			fecha1[i]=entradaEscaner.nextInt();
		}
		
		System.out.println("Rellenar fecha 2");
		System.out.println("Ingrese dia, mes y año");
		for (int i = 0; i < fecha2.length; i++) {
			fecha2[i]=entradaEscaner.nextInt();
		}

		System.out.println("fecha 1 registrada");
		System.out.println(Arrays.toString(fecha1));
		
		System.out.println("fecha 2 registrada");
		System.out.println(Arrays.toString(fecha2));
		
		int fecha1EnDias = convertirFechaDias(fecha1);
		System.out.println("Dias trasncurridos fecha1: "+fecha1EnDias);
		int fecha2EnDias = convertirFechaDias(fecha2);
		System.out.println("Dias trasncurridos fecha2: "+fecha2EnDias);
		
		CalculaDiffFechas(fecha1EnDias,fecha2EnDias);
		
	}
	
	/**
	 * Convertir las fechas en días transcurridos frente la fecha 0/0/0
	 * @param fecha VEctor con los datos de dia, mes y año
	 * @return Dias transcurridos totales (su conversión en días).
	 */
	public static int convertirFechaDias(int[] fecha) {
		int dias_transcurridos = fecha[0] + (fecha[1]*30) + (fecha[2]*30*12);
		return dias_transcurridos;
	}
	
	/**
	 * Dada fechas en su conversion en dias calcula la diferencia
	 * @param diasFecha1
	 * @param diasFecha2
	 */
	public static void CalculaDiffFechas(int diasFecha1, int diasFecha2) {
		int diffFechas = Math.abs(diasFecha1-diasFecha2);
		System.out.println("diferencia de días: "+diffFechas);
	}

}
