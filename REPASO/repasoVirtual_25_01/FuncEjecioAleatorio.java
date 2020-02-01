package dia25_01;

import java.util.Scanner;

public class FuncEjecioAleatorio {

	public static void main(String[] args) {
		Scanner entradaEscaner = new Scanner(System.in);
		System.out.println("introduzca el numero min");
		int num_min = entradaEscaner.nextInt();
		
		System.out.println("Introduzca el numero max");
		int num_max = entradaEscaner.nextInt();
		
		System.out.println("Min: "+ num_min + " && Max: "+num_max);
		System.out.println("El valor aleatorio es: "+ calcularAleatorioMinMax(num_min, num_max));
	}
	
	
	/**
	 * Funcion calcular Aleatorio
	 * @param min valor minimo
	 * @param max valor maximo
	 * @return numero_aleatorio
	 */
	public static int calcularAleatorioMinMax (int min, int max) {
		int rango = max-min;
		int numero_aleatorio = (int) (Math.random()*(rango+1)+min);
		return numero_aleatorio;
	}

}
