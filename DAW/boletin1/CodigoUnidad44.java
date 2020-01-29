package boletin1;

import java.util.Scanner;

public class CodigoUnidad44 {

	public static void main(String[] args) {
		
		int variable_integer = 5;
		long variable_long = 5;
		
		double variable_double = 6.5;
		
		char caracter = 'i';
		String cadena_caracteres = "hola";
		
		boolean variable_booleana = true;
	
		System.out.println("variable_integer: "+ variable_integer);
		System.out.println("variable_long: "+ variable_long);
		System.out.println("variable_double: "+ variable_double);
		System.out.println("caracter: "+ caracter);
		System.out.println("Cadena de caracteres o String: "+ cadena_caracteres);
		System.out.println("Variable_booleana: "+ variable_booleana);
	
		System.out.println("***********************************************************");
		
		variable_integer = variable_integer + 10;
		System.out.println("variable_integer: "+ variable_integer);
		
		variable_integer = 125;
		variable_integer = variable_integer + 100;
		variable_integer = variable_integer * 5;
		
		System.out.println("variable_integer: "+ variable_integer);
		
		System.out.println("***********************************************************");
		
		long variable_convertida_long = variable_integer;
		variable_convertida_long = variable_convertida_long+111;
		int variable_convertida_integer = (int) variable_long;
		
		variable_convertida_integer = (int) variable_double;
		System.out.println("variable_double: "+variable_double);
		System.out.println("variable_convertida_integer: "+variable_convertida_integer);
		
		
		System.out.println("***********************************************************");

		// CONSTANTE
		final int VUELTAS_AL_MUNDO = 120;
		final double PI = 3.1416;
		final int grados= 360;

		System.out.println(PI);

		System.out.println("***********************************************************");

		int dividendo = 17;
		int divisor = 5;

		int cociente = dividendo/divisor;
		int resto = dividendo%divisor;

		System.out.println("PARTES DE UNA DIVISION");
		System.out.println("dividendo: "+dividendo);
		System.out.println("divisor: "+divisor);
		System.out.println("cociente: "+cociente);
		System.out.println("resto: "+resto);
		
		System.out.println("***********************************************************");
		
		dividendo = 6;
		dividendo = dividendo + 10;
		dividendo = dividendo * 10;
		
		System.out.println("***********************************************************");
		System.out.println("LA ULTIMA EXPLICACION CON OPERACIONES DE RELACION");
		System.out.println("***********************************************************");
		
		int value1 = 10;
		int value2 = 5;
		
		System.out.println("VALUE1 MAYOR QUE VALUE2: "+ (value1 > value2));
		System.out.println("VALUE1 MENOR QUE VALUE2: "+ (value1 < value2));
		System.out.println("VALUE1 IGUAL QUE VALUE2: "+ (value1 == value2));
		System.out.println("VALUE1 DISTINTO QUE VALUE2: "+(value1 != value2));
		System.out.println("VALUE1 MAYOR O IGUAL QUE VALUE2: "+(value1 >= value2));
		
		System.out.println("***********************************************************");
		System.out.println("postfijos y prefijos");
		System.out.println("***********************************************************");
		
		int value3 = 10;
		value3++;
		
		value3=value3+1;
		value3=+1;
		value3++;
		System.out.println(value3);
		
		System.out.println("***********************************************************");
		variable_booleana = false;
		System.out.println("Variable_booleana: "+ variable_booleana);
		System.out.println("LA INVERSA DE Variable_booleana: "+ !variable_booleana);
		
		System.out.println("***********************************************************");
		System.out.print("variable");
		System.out.println("variable");
		
		/*
		 Explicacion de porque es util usar el "+" en la instrucción de System.out.println
		 Explicacion al detalle.
		 Explicacion concreta.
		*/
		
		// Explicacion de porque es util usar el "+" en la instrucción de System.out.println
		
		/**
		 * 
		 */
		
		int edad = 30;
		int fecha = 111;
		String nombre = "Angel";
		String apellido ="Hernandez";
		
		System.out.println(nombre+" "+apellido+" con la edad de "+edad+" en fecha de "+fecha);
		
		System.out.print(nombre);
		System.out.print(" ");
		System.out.print(apellido);
		System.out.print(" con la edad de ");
		System.out.print(edad);
		System.out.print(" en fecha de ");
		System.out.println(fecha);
		
		/*************************/
		System.out.println("***********************************************************");
		
		// LEER FLUJO
		
		Scanner entrada_escaner = new Scanner(System.in);
		System.out.println("Usario por favor introduzca un numero entero");
		int entrada = entrada_escaner.nextInt();  // BLOQUEANTE
		double entrada_double = entrada_escaner.nextDouble(); // BLOQUEANTE
		int entrada_int = (int) entrada_escaner.nextDouble(); // BLOQUEANTE
		
		entrada = entrada + 1000;
		
		System.out.println("La variable entrada modificada es: "+entrada);
		
	}
}
