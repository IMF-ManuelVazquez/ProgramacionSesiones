package s10_Func_Arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		
		// 1 // Crear un vector o array de una dimension.
		
	    // Opcion1: Crear vector e insertar los datos uno a uno.
		int[] notas_op1 = new int[5];
		notas_op1[0]=5;
		notas_op1[1]=7;
		notas_op1[2]=9;
		notas_op1[3]=3;
		notas_op1[4]=8;
		
		// Opcion2: Crear vector e inicializar con los valores.
		int[] nota_op2 = {5,7,9,3,8};
		
		// 2 // VER TAMAÑO DE LOS VECTORES: .length
		System.out.println("TAMAÑO DE NOTAS_OP1: "+notas_op1.length);
		System.out.println("TAMAÑO DE NOTAS_OP2: "+nota_op2.length);
		
		// 3 // COMO ACCEDER A UN ELEMENTO CONCRETO.
		// Ver la posicion 2 del vector.
		System.out.println(notas_op1[2]);
		
		// Sumar la posicion2 + la posicion3 * la posicion 4 y meterlo en una variable llamada resultado.
		int resultado =(notas_op1[2] + notas_op1[3]) * notas_op1[4];  // (9+3)*8
		System.out.println("resultado: "+ resultado);
		
		// 4 // MODIFICAR VALOR DE UNA POSICION
		notas_op1[4] = 7;
		
		// 5 // RECORRER ARRAY  -- >>>  FOR
		
		// Ejemplo de calcular la media
		int sumador = notas_op1[0]+notas_op1[1]+notas_op1[2]+notas_op1[3]+notas_op1[4];
		System.out.println("SUMADOR: " +sumador);
		double media = (double)sumador / (double)notas_op1.length;
		System.out.println("MEDIA: "+ media);
		
		
		int sumador_perfeccionado = 0;
		for (int i = 0; i < notas_op1.length; i++) {
			sumador_perfeccionado = sumador_perfeccionado + notas_op1[i];
		}
		double media_perfecciada = (double)sumador_perfeccionado / (double)notas_op1.length;
		System.out.println("MEDIA: "+ media_perfecciada);
		
		// i = 0  sumador_perfeccionado = 0 + 5
		// i = 1  sumador_perfeccionado = 0 + 5 + 7
		// i = 2  sumador_perfeccionado = 0 + 5 + 7 + 9
		// i = 3  sumador_perfeccionado = 0 + 5 + 7 + 9 + 3
		// i = 4  sumador_perfeccionado = 0 + 5 + 7 + 9 + 3 + 7
		
		
		// Rellenar el array por parte del usuario.
		
		int[] notas_todo_imf = new int[20];
 		
		
//		for (int i = 0; i < notas_todo_imf.length; i++) {
//			System.out.println("Introduzca el elemento de la posicion: "+i);
//			notas_todo_imf[i]=entrada_escaner.nextInt();
//		}
		
//		// i = 0
//		System.out.println("Introduzca el elemento de la posicion: 0");
//		notas_op1[0]=entrada_escaner.nextInt();
//		
//		// i = 1
//		System.out.println("Introduzca el elemento de la posicion: 1");
//		notas_op1[1]=entrada_escaner.nextInt();
//		
//		// i = 2
//		System.out.println("Introduzca el elemento de la posicion: 2");
//		notas_op1[2]=entrada_escaner.nextInt();
//		
//		// i = 3
//		System.out.println("Introduzca el elemento de la posicion: 3");
//		notas_op1[3]=entrada_escaner.nextInt();
//		
//		// i = 4
//		System.out.println("Introduzca el elemento de la posicion: 4");
//		notas_op1[4]=entrada_escaner.nextInt();

		// Ver los datos:
		System.out.println(java.util.Arrays.toString(notas_todo_imf));
		
		
		// 6 // EXCEPCIÓN.
		System.out.println("***************************");
		System.out.println("EXCEPCION");
		int[] valoraciones = new int[5];
		
		//valoraciones[10] = 4;
		//System.out.println(valoraciones[11]);
		
		/*
		 
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
	at s10_Func_Arrays.Arrays.main(Arrays.java:101)
	
		 */
		
		// EXTRA // Hasta ahora eran arrays de integer.
		// Op1
//		String[] nombres_1 = new String[5];
//		for (int i = 0; i < nombres_1.length; i++) {
//			System.out.println("Introduzca nombre del usuario en la posicion: "+i);
//			nombres_1[i]= entrada_escaner.nextLine();
//		}
				
		// Op2
		String[] nombres_2 = {"Manu","Pepe","Maria","Juan","Laura"};
		
		
		/*
		 * En una aula tenemos 5 alumnos: "Manu","Pepe","Maria","Juan","Laura"
		 * Cada alumno del aula tiene una nota del examen: 4, 5, 6, 3, 7  respectivamente.
		 * 
		 * Muestrame los nombres de los alumnos que han aprobado
		 * 
		 */
		
		String[] nombres_ej = {"Manu","Pepe","Maria","Juan","Laura"};
		int[] notas_ej = {4,5,6,3,7};
		
		for (int i = 0; i < notas_ej.length; i++) {
			
			if (notas_ej[i]>=5){
				System.out.println(nombres_ej[i]);
			}
			
		}
		// i = 0 >>> "Manu" con nota de 4 
		// i = 1 >>> "Pepe" con nota de 5 
		// i = 2 >>> "Maria" con nota de 6
		// i = 3 >>> "Juan" con nota de 3
		// i = 4 >>> "Laura" con nota de 7 
	}

}
