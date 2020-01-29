package sesion15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2) Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números aleatorios entre 0 y 10.
 * @author Manuel Vazquez
 *
 */
public class EjArrays2D_2 {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		int F; // Numero de FILAS.
		int N; // Numero de columnas.
		int[][] matriz;
		
		System.out.println("Ingrese el numero de filas de la matriz");
		F = entrada_escaner.nextInt();
		
		System.out.println("Ingrese el numero de columnas de la matriz");
		N = entrada_escaner.nextInt();
		matriz = new int[F][N];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int random =(int)(Math.random()*(10+1));
				matriz[i][j]= random;
			}
		}
		
		// i = 0    
			// J = 0
			// J = 1
		// i = 1
			// J = 0
			// J = 1
		// i = 2
			// J = 0
			// J = 1
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
	}

}
