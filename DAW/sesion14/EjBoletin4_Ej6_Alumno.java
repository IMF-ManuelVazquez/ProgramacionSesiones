package sesion14;

import java.util.Scanner;

public class EjBoletin4_Ej6_Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada_escanner= new Scanner (System.in);
		
		int[] arr1 = {11,12,13,14,15,16,17,18,19,10,11,12};
		int[] arr2 = {21,22,23,24,25,26,27,28,29,20,21,22};
		int[] arr3 = new int[arr1.length*2];
		

//		System.out.println("llenamos el array1");
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println("por favor introduzca un numero en la posicion: "+i);
//			arr1[i]=entrada_escanner.nextInt(); }
//
//		System.out.println("llenamos el array2");
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println("por favor introduzca un numero en la posicion: "+i);
//			arr2[i]=entrada_escanner.nextInt(); }

		System.out.println("llenamos el array3 con estos numeros");

		for (int i = 0; i < arr3.length/6; i++) {

			System.out.println(+arr1[i*3]+" "+arr1[(i*3)+1]+" "+arr1[(i*3)+2]);
			System.out.println(+arr2[i*3]+" "+arr2[(i*3)+1]+" "+arr2[(i*3)+2]);

		}
	}

}
