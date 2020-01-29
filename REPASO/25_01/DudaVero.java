package dia25_01;

import java.util.Scanner;

public class DudaVero {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		System.out.println("por favor, num1: ");
		int num1 = entrada_escaner.nextInt();
		
		System.out.println("por favor, num2: ");
		int num2 = entrada_escaner.nextInt();
		
		String str_mayor = esMayor(num2,num1);
		System.out.println("Mayor desde el main es: "+str_mayor);
		
	}
	
	// int var1 = num2;
	// int var2 = num1;
	public static String esMayor(int var1, int var2) {
		int mayor;
		String nombre = "Manuel";
		if (var1>var2) {
			mayor = var1;
		}else {
			mayor = var2;
		}
		return nombre;
	}

}
