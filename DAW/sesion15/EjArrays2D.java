package sesion15;

import java.util.Arrays;

/**
 * 1) Crear una matriz de 3×3 (2D) con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz.
 * @author Manuel Vazquez
 *
 */
public class EjArrays2D {

	public static void main(String[] args) {
	
		//int[][] matriz = new int[3][3];
		// OPCION 1 : CREAR MATRIZ CON LOS VALORES CORRESPONDIENTES.
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("opcion1");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		
		// OPCION 1 : CREAR LA MATRIZ Y METER LOS DATOS A UNO A UNO.
		int[][] matriz2 = new int[3][3];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				matriz2[i][j] = (i*3)+(j+1);
			}
		}
		System.out.println("opcion2");
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println(Arrays.toString(matriz2[i]));
		}
		
		// i = 0
		// i = 1
		

	}

}
