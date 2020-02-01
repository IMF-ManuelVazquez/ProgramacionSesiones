package repaso01_02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. Pedir dos fechas y mostrar mediante una función el número de días que hay de diferencia. 
 * Inicialmente supone que todos los meses de 30 días.  ( EXTRA : Tener en cuentanº día según día de mes y año bisiesto o no).
 * Hecho con matrices.
 * 
 * @author Manuel Vazquez
 *
 */
public class Ej8_Boletin3_v3 {

	public static void main(String[] args) {
		
		int[][] fechas = new int[2][3];
		Scanner entradaEscaner = new Scanner(System.in);
		
		System.out.println("Rellenar fechas");
		System.out.println("Ingrese dia, mes y año");
		for (int i = 0; i < fechas.length; i++) {
			System.out.println("Rellenar fecha "+(i+1));
			for (int j = 0; j < fechas[i].length; j++) {
				fechas[i][j] = entradaEscaner.nextInt();
			}
		}
		System.out.println("fechas registradas");
		System.out.println(Arrays.toString(fechas[0]));
		System.out.println(Arrays.toString(fechas[1]));
		
		int fecha1EnDias = convertirFechaDias(fechas[0]);
		System.out.println("Dias trasncurridos fecha1: "+fecha1EnDias);
		int fecha2EnDias = convertirFechaDias(fechas[1]);
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
	
	public static void CalculaDiffFechas(int diasFecha1, int diasFecha2) {
		int diffFechas = Math.abs(diasFecha1-diasFecha2);
		System.out.println("diferencia de días: "+diffFechas);
	}

}
