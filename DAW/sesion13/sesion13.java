package sesion13;

public class sesion13 {

	public static void main(String[] args) {
		
		int var1 = 4;
		int var2 = 7;
		int var3 = 6;
		int suma = var1 + var2;
		
		System.out.println("suma: "+suma);
		
		// Op1: Crear un arreglo o array de 3 elementos y meter manualmente los datos.
		int[] arr = new int [3];
		arr[0] = var1;
		arr[1] = var2; 
		arr[2] = var3;
		
		suma = arr[0]+arr[1];
		
		System.out.println("var1 "+ var1);
		System.out.println("var1 "+ arr[0]);
		
		// Op2: Crear un array ya con datos incluidos.
		int [] arr_lleno = {3,7,9,12,14};
		arr_lleno[2]=arr_lleno[2]+11;
		System.out.println(arr_lleno[2]);
		
		System.out.println(arr_lleno[0]*arr_lleno[arr_lleno.length-1]);
		System.out.println(arr_lleno[1]*arr_lleno[arr_lleno.length-2]);
		
		// MOSTAR TODOS LOS ELEMENTOS DEL ARRAY.
		System.out.println("datos del arr_lleno");
//		System.out.println(arr_lleno[0]);
//		System.out.println(arr_lleno[1]);
//		System.out.println(arr_lleno[2]);
//		System.out.println(arr_lleno[3]);
//		System.out.println(arr_lleno[4]);
		System.out.println("De forma ascente");
		for (int i = 1; i < arr_lleno.length; i++) {
			System.out.println(arr_lleno[i]);
		}
		
		System.out.println("De forma descente");
		for (int i = arr_lleno.length-1; i >= 0; i--) {
			System.out.println(arr_lleno[i]);
		}
	}
}
