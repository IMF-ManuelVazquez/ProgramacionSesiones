package dia25_01;

import java.util.Scanner;

public class Ej9_Boletin3 {

	public static void main(String[] args) {
		
		System.out.println("inicio del main");
		int numero_entrada = 0;
		Scanner entrada_escaner = new Scanner(System.in);
		
		System.out.println("Dame un numero entre 0 y 99");
		numero_entrada = entrada_escaner.nextInt();
		
		convertirNumeroATexto(numero_entrada);
		System.out.println("Fin del main");
	}
	
	public static void convertirNumeroATexto(int numero_entrada) {
		
		System.out.println("inicio funcion");
		
		if (numero_entrada<16) {
			if (numero_entrada == 0) System.out.println("cero");
			else if (numero_entrada == 1) System.out.println("uno");
			else if (numero_entrada == 2) System.out.println("dos");
			else if (numero_entrada == 3) System.out.println("tres");
			else if (numero_entrada == 4) System.out.println("cuatro");
			else if (numero_entrada == 5) System.out.println("cinco");
			else if (numero_entrada == 6) System.out.println("seis");
			else if (numero_entrada == 7) System.out.println("siete");
			else if (numero_entrada == 8) System.out.println("ocho");
			else if (numero_entrada == 9) System.out.println("nuevo");
			else if (numero_entrada == 10) System.out.println("diez");
			else if (numero_entrada == 11) System.out.println("once");
			else if (numero_entrada == 12) System.out.println("doce");
			else if (numero_entrada == 13) System.out.println("trece");
			else if (numero_entrada == 14) System.out.println("catorce");
			else if (numero_entrada == 15) System.out.println("quince");
		}else {
			if (numero_entrada % 10 == 0) {
				if (numero_entrada == 20) System.out.println("veinte");
				else if (numero_entrada == 30) System.out.println("treinta");
				else if (numero_entrada == 40) System.out.println("cuarenta");
				else if (numero_entrada == 50) System.out.println("cincuenta");
				else if (numero_entrada == 60) System.out.println("sesenta");
				else if (numero_entrada == 70) System.out.println("setenta");
				else if (numero_entrada == 80) System.out.println("ochenta");
				else if (numero_entrada == 90) System.out.println("noventa");
			}else {
				int decimal = (numero_entrada/10);
				if (decimal==1) System.out.print("dieci");
				else if (decimal==2) System.out.print("veinti");
				else if (decimal==3) System.out.print("treinta y ");
				else if (decimal==4) System.out.print("cuarenta y ");
				else if (decimal==5) System.out.print("cincuenta y ");
				else if (decimal==6) System.out.print("sesenta y ");
				else if (decimal==7) System.out.print("setenta y ");
				else if (decimal==8) System.out.print("ochenta y ");
				else if (decimal==9) System.out.print("noventa y ");
				
				int unidades = numero_entrada - (decimal*10);
				if (unidades==1) System.out.println("uno");
				else if (unidades==2) System.out.println("dos");
				else if (unidades==3) System.out.println("tres");
				else if (unidades==4) System.out.println("cuatro");
				else if (unidades==5) System.out.println("cinco");
				else if (unidades==6) System.out.println("seis");
				else if (unidades==7) System.out.println("siete");
				else if (unidades==8) System.out.println("ocho");
				else if (unidades==9) System.out.println("nueve");
		
			}
		}
		
		System.out.println("fin de la funcion");
		
	}

}
