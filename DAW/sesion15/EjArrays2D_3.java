package sesion15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3) Crear una matriz 2x5 con valores introducidos por el usuario. 
 * Crear un vector que recoja la suma de los elementos de cada columna de la matriz.
 * 
 * @author Manuel Vazquez
 *
 */
public class EjArrays2D_3 {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		int[][] matriz = new int[2][5];
		int[] vector = new int[5];
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Ingrese el numero de la posicion: ["+i+"]["+j+"]");
				matriz[i][j] = entrada_escaner.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		
		for (int i = 0; i < vector.length; i++) {   //vector.length=5
			vector[i] = matriz[0][i]+matriz[1][i];
		}
		
		System.out.println("VEctor resultante: "+Arrays.toString(vector));
		
	}
}
