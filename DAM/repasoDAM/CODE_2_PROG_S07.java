package repasoDAM;

import java.util.Scanner;

public class CODE_2_PROG_S07 {
	
	public static void main(String[] args) {
		
		System.out.println("hola mundo");
		
		// Constante
		final double PI = 3.1416;
		final int RADIO_TIERRA = 444444;
		
		// Enteros
		byte variableByte;
		short variableShort;
		int variableInt = 1000;
		long variableLong;
		
		
		// Decimales
		float variableFloat;
		double variableDouble = 3.1416;
		
		// Boolean 
		boolean variableBoolean = false;  // true || false
		
		// Texto
		char caracter = 'y';
		String cadena_caracteres = "hola";
		
		
		// CONVERSIONES.
		// Conversion implicita:  int -> long
		variableLong = variableInt;
		
		// Conversion explicita: long -> int
		variableInt = (int) variableLong;
		
		
		// VARIABLE VS CONTANTE
		variableLong = 100;
		// PI = 333;
		long value2 = (long) (PI + 11);
		
		
		/// OPERADOR ARIMETICOS
		
		int resto = 5 % 2;
		System.out.println(resto);
		
		// OPERADOR DE ASIGNACION
		variableInt = 1010;
		variableInt = variableInt * 100;
		variableInt *=  100;
		System.out.println(variableInt);
		
		// OPERADORES DE TOMA DE DECISION
		int variableInt1 = 10;
		int variableInt2 = 20;
		
		System.out.println("¿Es menor? " + (variableInt1 < variableInt2));
		System.out.println("¿Es mayor? " + (variableInt1 > variableInt2));
		System.out.println("¿Es menor o igual? " + (variableInt1 <= variableInt2));
		System.out.println("¿Es mayor o igual? " + (variableInt1 >= variableInt2));
		
		System.out.println("¿Son iguales? " + (variableInt1 == variableInt2));
		System.out.println("¿Son distinos? " + (variableInt1 != variableInt2));
		
		// And &&   >>>  Si estudias y trabajas apruebas.
		// Or  ||    >>>  Si estudias o trabajas apruebas.
		
		System.out.println("¿Es menor o mayor? " + ((variableInt1 < variableInt2)||(variableInt1 > variableInt2)));
		
		// Posfijos y prefijos.
		
		int variablePrueba = 10;
		variablePrueba = variablePrueba + 1;
		++variablePrueba;
		System.out.println(variablePrueba);
		
		// FLUJOS DE ENTRADA Y SALIDA.
		
		// Flujo de salida.
		
		System.out.println("hola mundo1");
		System.out.print("hola mundo2");
		System.out.print("hola mundo3");
		System.out.println("hola mundo4");
		
		String nombre = "manuel";
		String apellido = "vazquez";
		double altura = 1.95;
		int year = 18;
		
		System.out.print("Nombre: ");
		System.out.print(nombre);
		System.out.print(" apellido: ");
		System.out.print(apellido);
		System.out.print(" altura: ");
		System.out.print(altura);
		System.out.print(" year: ");
		System.out.println(year);
		
		System.out.println("Nombre: " + nombre + " apellido: " + apellido +" altura: " + altura + " year: " + year);
		
		// Flujo entrada: Scanner.
//		Scanner entradaEscaner = new Scanner(System.in);
//
//		variableInt = entradaEscaner.nextInt();
//		variableDouble = entradaEscaner.nextDouble();
//		variableBoolean = entradaEscaner.nextBoolean();  // true || false
//		cadena_caracteres = entradaEscaner.next();
//		
//		entradaEscaner.close();
		
		char inChar = 'c';
		String str = "hola";
		char c1 = 'h';
		char c2 = 'o';
		char c3 = 'l';
		char c4 = 'a';
		
		char inchar1 = 'a';
		char inchar2 = 'A';
		
		System.out.println(inchar1+" tiene de codigo ASCII: "+(int)inchar1);
		System.out.println(inchar2+" tiene de codigo ASCII: "+(int)inchar2);
		
	}
}
