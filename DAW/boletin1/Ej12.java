package boletin1;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Scanner entrada_escanner= new Scanner (System.in);
		
		//Leemos dos variables num1 y num2
		System.out.println("numero1");
		int num1 = entrada_escanner.nextInt();
		System.out.println("numero2");
		int num2 = entrada_escanner.nextInt();
		
		// El ejercicio nos pide que pongamos el valor de num1 en num2 y de num2 en num1
		/* 
		 * num1 = num2;
		 * num2 = num1;
		 * 
		 * Estaría mal, pues al poner el valor de num2 en num1 pierdes el valor de num1 pues tendría el valor nuevo de num2. ¿Que hacer? Usar una variable intermedia "num3"
		 */
		System.out.println("ANTES DEL CAMBIO DE VARIABLES");
		System.out.println("NUM1: "+ num1);
		System.out.println("NUM2: "+ num2);
		
		// Cambio de variables el valor de num1 en num2 y num2 en num1.. mediante una variable intermedia.
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("DESPUES DEL CAMBIO DE VARIABLES");
		System.out.println("NUM1: "+ num1);
		System.out.println("NUM2: "+ num2);

	}

}
