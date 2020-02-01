package dia25_01;

import java.util.Scanner;

public class Boletin3_Eje7 {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int anho = 0;
		
		System.out.println("Ingrese un día: ");
		dia = entrada_escaner.nextInt();
		
		System.out.println("Ingrese un mes: ");
		mes = entrada_escaner.nextInt();
		
		System.out.println("Ingrese un Año: ");
		anho = entrada_escaner.nextInt();
		
		System.out.println("dia: "+dia);
		System.out.println("mes: "+mes);
		System.out.println("anho: "+anho);

		System.out.println(validarDia(dia));
		System.out.println(validarMes(mes));
		System.out.println(validarAnho(anho));
		
		if(validarDia(dia) && validarMes(mes) && validarAnho(anho)) {
			System.out.println("todo correcto");
		}else {
			System.out.println("alguno incorrecto");
		}
	}
	
	/**
	 * Funcion validacion del día
	 * @param dia Dia introducido
	 * @return retorna true si es correcto
	 */
	public static boolean validarDia(int dia) {
		if (dia>=1 && dia <=31) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean validarMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean validarAnho(int anho) {
		boolean esValido = false;
		if (anho>=1 && anho<=2019) {
			esValido=true;
		}
		return esValido;
	}

}
