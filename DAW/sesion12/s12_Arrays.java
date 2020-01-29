package sesion12;

public class s12_Arrays {

	public static void main(String[] args) {
		
		// Varibles. Una única variable. 1 dato.
		// Enteros
		int value_int = 5;
		long value_long = 10;
		
		// Decimales
		double value_double = 5.5;
		float value_float = (float) 5.5;
		
		// Caracteres
		char inchar = 'a';
		String cadena_caracteres = "hola";   // 'h'  'o'  'l'  'a'
		
		// Boolean: true & false
		boolean value_boolean = true;
		
		// Clase con 3 alumnos.
//		int actitud_alumno1 = 8;
//		int actitud_alumno2 = 9;
//		int actitud_alumno3 = 7;
//		int actitud_alumno4 = 7;
		
		// agrupación de alummnos calse DAW1 : alumno1 & alumno2 & alumno3
		// Opcion1 : Declarar e inicilizar uno a unos los elementos del array.
		
		int[] claseDAW1 = new int[4];
		claseDAW1[0] = 2;
		claseDAW1[1] = -4;
		claseDAW1[2] = 9;
		claseDAW1[3] = -7;
		
		// Opcion2: Declarar e inicializar todos los elementos del array en una única línea.
		
		int[] claseDAW1_dire = 	{2,-4,9,-7};
		
		// ACCEDER A LOS DATOS.
		System.out.println("La nota del alumno de la posicion 2 es: "+claseDAW1_dire[2]);
		
		// NUMERO DE DE ELEMENTOS.
		int numero_de_elemenos = claseDAW1_dire.length;
		System.out.println("La longitud o tamaño del array de una dimensio (vector) es: "+numero_de_elemenos);
		
		claseDAW1_dire[2] = 4;
		claseDAW1_dire[2] = 8;
		
		// MOSTRAR TODOS EL VALOR DE TODOS LOS ELEMENTOS.
		// Op1: Opcion1
		System.out.println("op1");
		System.out.println("El elemento de la posicion 0 es: "+claseDAW1_dire[0]);
		System.out.println("El elemento de la posicion 1 es: "+claseDAW1_dire[1]);
		System.out.println("El elemento de la posicion 2 es: "+claseDAW1_dire[2]);
		System.out.println("El elemento de la posicion 3 es: "+claseDAW1_dire[3]);
	
		// Op2: Con estructura de repetición: FOR ( por su acotacion )
		System.out.println("*********************");
		System.out.println("op2");
		for (int i = 0; i < claseDAW1_dire.length; i++) {
			//System.out.println(i);
			System.out.println("El elemento de la posicion "+i+" es: "+claseDAW1_dire[i]);
		}
		System.out.println("*********************");
		
		// Op3: For mejorado // recoreo siempre TODA la estructura del array.
		for (int elemento : claseDAW1_dire) {
			System.out.println(elemento);
		}
		
		
		// BUSQUEDA DE UN ELEMENTO CONCRETO DENTRO DEL ARRAY.
		// Array es claseDAW1_dire tiene 4 elementos.
		// Queeremos saber la posición del elemento que valga: -4
		int valor_objetivo = -7;
		for (int i = 0; i < claseDAW1_dire.length; i++) {
			
			if (claseDAW1_dire[i] == valor_objetivo) {
				System.out.println("Detectado en la posicion: "+i);
			}
			
		}
		
		
		// EXPECION CUANDO NOS SALIMOS DE RANGO.
		System.out.println(claseDAW1_dire[1]);
		
	}

}
