package sesion14;

import java.util.Arrays;
import java.util.Scanner;

public class EjBoletin4_Ej6_Clase {

	public static void main(String[] args) {
		
		int[] v1 = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] v2 = {21,22,23,24,25,26,27,28,29,30,31,32};
		
		//int[] v1 = new int [12];
		//int[] v2 = new int [12];
		
		// int[] v3 = new int[24];
		int[] v3 = new int[v1.length+v2.length];
		
		Scanner entrada_escanner = new Scanner(System.in);
		
//		System.out.println("llenamos el array1");
//		for (int i = 0; i < v1.length; i++) {
//			System.out.println("por favor, introduzca un numero en la posicion: "+i);
//			v1[i]=entrada_escanner.nextInt(); 
//		}
//		
//		System.out.println("llenamos el array2");
//		for (int i = 0; i < v2.length; i++) {
//			System.out.println("por favor, introduzca un numero en la posicion: "+i);
//			v2[i]=entrada_escanner.nextInt(); 
//		}

		int repeticionesPatron = v3.length/6;
		System.out.println("repeticionPatron: "+repeticionesPatron);
		
		for (int i = 0; i < repeticionesPatron; i++) {
			v3[(i*6)+0] = v1[(i*3)+0];   // v3[12+0] =  v1[6+0]
			v3[(i*6)+1] = v1[(i*3)+1];   // v3[12+1] =  v1[6+1]
			v3[(i*6)+2] = v1[(i*3)+2];   // v3[12+2] =  v1[6+2]
			v3[(i*6)+3] = v2[(i*3)+0];   // v3[12+3] =  v2[6+0]
			v3[(i*6)+4] = v2[(i*3)+1];   // v3[12+4] =  v2[6+1]
			v3[(i*6)+5] = v2[(i*3)+2];   // v3[12+5] =  v2[6+2]
		}
		
//		for (int i = 0; i < repeticionesPatron; i++) {
//			for (int j = 0; j < 3; j++) {
//				v3[(i*6)+j] = v1[(i*3)+j];
//			}
//			for (int j = 0; j < 3; j++) {
//				v3[(i*6)+3+j] = v2[(i*3)+j];
//			}
//		}
		
		for (int i = 0; i < repeticionesPatron; i++) {
			for (int j = 0; j < 3; j++) {
				v3[(i*6)+j] = v1[(i*3)+j];
				v3[(i*6)+3+j] = v2[(i*3)+j];
			}
		}
		

		System.out.println(Arrays.toString(v3));
	}

}
