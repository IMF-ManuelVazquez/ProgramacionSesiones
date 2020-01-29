package sesion13;

import java.util.Arrays;

//Ej5 del boletin4_Array
public class EjBoletin4_Ej5 {
	public static void main(String[] args) {

		int[] v1 = {11,12,13,14,15,16,17,18,19,10};
		int[] v2 = {21,22,23,24,25,26,27,28,29,20};
		int[] v3 = new int[20];
		
		System.out.println("tamaño de v1: "+ v1.length);
		System.out.println("tamaño de v2: "+ v2.length);
		System.out.println("tamaño de v3: "+ v3.length); 
		
		
//		for (int i = 0; i < v1.length; i++) {
//			System.out.println(v1[i]);
//		}
		System.out.println("datos de v1");
		System.out.println(Arrays.toString(v1));
		
		System.out.println("datos de v2");
		System.out.println(Arrays.toString(v2));
		
		System.out.println("datos de v3");
		System.out.println(Arrays.toString(v3));
		
		for (int i = 0; i < v1.length; i++) {
			v3[i*2] = v1[i];
			v3[(i*2)+1] = v2[i];
		}
		
		System.out.println("RESULTADO MAGICO FINAL");
		System.out.println(Arrays.toString(v3));
		
//		v3[0]=v1[0];
//		v3[1]=v2[0];
//		
//		v3[2]=v1[1];
//		v3[3]=v1[1];
//		
//		v3[4]=v1[2];
//		v3[5]=v1[2];
//		
		// i = 0
		// v3[0*2] = v1[0]
		// v3[(0*2)+1] = v2[0]
		
		// i = 1
		// v3[1*2] = v1[1]
		// v3[(1*2)+1] = v2[1]
		
		// i = 2
		// v3[2*2] = v1[2]
		// v3[(2*2)+1] = v2[2]
		
		// i = 3
		// v3[3*2] = v1[3]
		// v3[(3*2)+1] = v2[3]
		
		//..
		
		// i = 9
		// v3[9*2] = v1[9]
		// v3[(9*2)+1] = v2[9]
		
	}
}
