package dia25_01;

import java.util.Scanner;

/**
 * 11 Diseñar un programa que dado un valor introducido N que muestre los 10 primeros
números impares posteriores a N y los 10 primeros números impares anteriores a N.

 * @author Manuel Vazquez
 *
 */

public class Boletin3_Ej11 {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int numero_entrada = 0;

		System.out.println("Introduzca un numero de entrada");
		numero_entrada = entradaEscaner.nextInt();
		
		System.out.println("NumeroEntrada: "+numero_entrada);
		System.out.println("Es Impar? "+ isImPar(numero_entrada));
		
		System.out.println("usar funcion impares posteriores");
		numeroImparesPosteriores(numero_entrada);
		
		System.out.println("usar funcion impares anteriores");
		numeroImparesAnteriores(numero_entrada);
		
		System.out.println("fin algoritmo");

	}
	
	public static void numeroImparesPosteriores(int numeroDePartida) {
		System.out.println("FUNCION NUMERO IMPARES POSTERIORES");
		int contadorImparesDetectados = 0;
		
		while (contadorImparesDetectados<10) {
			if (isImPar(numeroDePartida)) {
				System.out.println(numeroDePartida);
				contadorImparesDetectados++;
			}
			numeroDePartida++;
		}
		
	}
	
	public static void numeroImparesAnteriores(int numeroDePartida) {
		System.out.println("FUNCION NUMERO IMPARES ANTERIORES");
		
		int contadorImparesDetectados = 0;
		
		while (contadorImparesDetectados<10) {
			if (isImPar(numeroDePartida)) {
				System.out.println(numeroDePartida);
				contadorImparesDetectados++;
			}
			numeroDePartida--;
		}
		
	}
	
	public static boolean isImPar(int numero){
		if (numero%2==1) {
			return true;
		}else {
			return false;
		}
	}

}
