package sesion14;

import java.util.Arrays;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		final int DIAS_REGISTRADOS = 5;
		
		int[][] matriz = new int[3][5];
		
		matriz[1][2] = 66;
		matriz[2][4] = 77;
		
		///
		int[][] m2 = {{4,5,6,7,8},{2,1,0,-1,2},{6,7,8,9,10}};
		
		System.out.println(m2[1][3]);
		
		//int[][] temperaturas =  new int[2][5];
		int[][] temperatura = {{10,11,12,11,10},{21,22,25,24,20}};
		System.out.println("filas: "+temperatura.length);
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println(Arrays.toString(temperatura[i]));
		}
		
		for (int i = 0; i < DIAS_REGISTRADOS; i++) {
			System.out.println("DIA "+(i+1));
			double media = (double)(temperatura[0][i]+temperatura[1][i])/2;
			System.out.println(media);
		}
		
		// temperatura[0][0]+ temperatura[1][0]  / 2
		// temperatura[0][1]+ temperatura[1][1]  / 2
		// temperatura[0][2]+ temperatura[1][2]  / 2
		// temperatura[0][3]+ temperatura[1][3]  / 2
		// temperatura[0][4]+ temperatura[1][4]  / 2
		
		// 2 dimensiones
		int[][] m2d = new int[2][5];
		
		// 3 dimensiones
		int[][][] m3d = new int[2][5][7];
		
		//System.out.println(m3d[0][1][5]);
		
		
		// METER DATOS CON UN FOR.
		// Para un vector
		int[] v = new int[5];
		for (int i = 0; i < v.length; i++) {
			v[i]= -1;
		}
		
		// Para una matriz
		int[][] matrizFinal = new int[5][5];
		for (int i = 0; i < matrizFinal.length; i++) {
			for (int j = 0; j < matrizFinal[0].length; j++) {
				matriz[i][j]=-1;
			}
			
		}
		
		// En estes caso i = filas
		// j = columnas
		// matriz[0][0] = -1 
		// matriz[0][1]
		// matriz[0][2]
		// matriz[0][3]
		// matriz[0][4]
		
		// matriz[1][0]
		// matriz[1][1]
		// matriz[1][2]
		// matriz[1][3]
		// matriz[1][4]
		
		// matriz[2][0]
		// matriz[2][1]
		// matriz[2][2]
		// matriz[2][3]
		// matriz[2][4]

 	}

}
