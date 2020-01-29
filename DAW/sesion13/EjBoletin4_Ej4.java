package sesion13;

import java.util.Scanner;

//Ej4 del boletin4_Array
public class EjBoletin4_Ej4 {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		int[] arr_ints = new int[10];
		
		System.out.println("LLENAMOS EL ARRAY");
		for (int i = 0; i < arr_ints.length; i++) {
			System.out.println("Porfavor introduzca un numero para la posicion : "+ i);
			arr_ints[i]=entrada_escaner.nextInt();	
		}
		
		System.out.println("MOSTRAMOS EL ARRAY QUE HEMOS LLENADO");
		for (int i = 0; i < arr_ints.length; i++) {
			System.out.println(arr_ints[i]);	
		} 
		
		System.out.println("EJERCIO MOSTRAR DE FORMA INTERCALADA");
		for (int i = 0; i < (arr_ints.length/2); i++) {  
			System.out.println("accedemos a las posicion: "+ i);
			System.out.println(arr_ints[i]);
			
			System.out.println("accedemos a las posicion: "+ (arr_ints.length-1-i));
			System.out.println(arr_ints[arr_ints.length-1-i]);
		}

		// i=0
//		System.out.println(arr_ints[0]);   0
//		System.out.println(arr_ints[9]);   arr_ints.length-1-0
//		
		// i=1
//		System.out.println(arr_ints[1]);   1
//		System.out.println(arr_ints[8]);   arr_ints.length-2 = arr_ints.length-1-1
//		
		// i=2
//		System.out.println(arr_ints[2]);   2
//		System.out.println(arr_ints[7]);   arr_ints.length-3 = arr_ints.length-1-2
//		
		// i=3
//		System.out.println(arr_ints[3]);   3
//		System.out.println(arr_ints[6]);   arr_ints.length-4 = arr_ints.length-1-3
//		
		// i=4
//		System.out.println(arr_ints[4]);   4
//		System.out.println(arr_ints[5]);   arr_ints.length-5 = arr_ints.length-1-4
		
		// PARAMOS SINO....

// 		i=5
//		System.out.println(arr_ints[5]);   5
//		System.out.println(arr_ints[4]);   arr_ints.length-6 = arr_ints.length-1-5
		
		
// 		i =6
//		System.out.println(arr_ints[6]);   
//		System.out.println(arr_ints[3]);   
		
// 		i =7
//		System.out.println(arr_ints[7]);   
//		System.out.println(arr_ints[2]);
		
// 		i =8
//		System.out.println(arr_ints[8]);   
//		System.out.println(arr_ints[1]);
		
// 		i =9
//		System.out.println(arr_ints[9]);   
//		System.out.println(arr_ints[0]);

	}

}
