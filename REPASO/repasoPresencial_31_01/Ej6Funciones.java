package repasoPresencial31_01;

import java.util.Scanner;

/**
 * Ej6 Examen Recuperación Examen presencial.
 * @author Manuel Vazquez
 *
 */
public class Ej6Funciones {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Dame un num1");
		num1 = entradaEscaner.nextInt();
		System.out.println("Num1 validacion: "+validar(num1));
		
		System.out.println("Dame un num2");
		num2= entradaEscaner.nextInt();
		System.out.println("Num2 validacion: "+validar(num2));
		
		imprimir(num1,num2);
		
		System.out.println("Maximo: "+obtenerMax(num1, num2));
		System.out.println("Minimo: "+obtenerMin(num2, num1));

	}
	
	public static int obtenerMax(int value1, int value2) {
		if (value1>value2) {
			return value1;
		}else {
			return value2;
		}
	}
	
	public static int obtenerMin(int value1, int value2) {
		if (value1<value2) {
			return value1;
		}else {
			return value2;
		}
	}
	
	public static void imprimir (int value1, int value2) {
		System.out.println("Datos entrada: "+ value1 + " && "+value2);
	}
	
	public static boolean validar(int value) {
		if (value>=0 && value <=100) {
			return true;
		}else {
			return false;
		}
		
	}

}
