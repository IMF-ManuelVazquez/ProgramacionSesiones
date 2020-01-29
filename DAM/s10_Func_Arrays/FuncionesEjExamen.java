package s10_Func_Arrays;

import java.util.Scanner;

public class FuncionesEjExamen {

	static Scanner entrada_Escaner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
// 		Leer dos numeros por teclado y validar el rango. Deben estar comrpendido entre 0 10 ambos incluídos.
//		Scanner entrada_Escaner = new Scanner(System.in);
//		System.out.println("Introduzca value1");
//		int value1 = entrada_Escaner.nextInt();
//		System.out.println("Introduzca value1");
//		int value2 = entrada_Escaner.nextInt();
//		
//		if((value1>=0 && value1<=10)&&(value2>=0 && value2<=10)) {
//			System.out.println("ok");
//		}else {
//			System.out.println("mal");
//		}
//		entrada_Escaner.close();
		
		int num1 = recibirNumeroYValidar(0, 5);
		int num2 = recibirNumeroYValidar(0, 3);
		int num5 = recibirNumeroYValidar(0, 3);
		int num6 = recibirNumeroYValidar(0, 3);
		int num7 = recibirNumeroYValidar(0, 3);
		if ((num1!=-1)&&(num2!=-1)) {
			System.out.println("ok");
		}else {
			System.out.println("mal");
		}
	}
	
	public static int recibirNumeroYValidar(int rango_min, int rango_max) {
		System.out.println("Introduzca valor");
		int value1 = entrada_Escaner.nextInt();
		if ((value1>=rango_min && value1<=rango_max)) {
			return value1;
		}else {
			return -1;
		}
	}

}
