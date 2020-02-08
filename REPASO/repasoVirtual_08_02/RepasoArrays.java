package sesion08_02;

import java.util.Arrays;
import java.util.Scanner;

public class RepasoArrays {

	public static void main(String[] args) {
		
		final int NUMERO_ELEMENTOS_VECTOR = 4;
		
		String[] vector_nombres = new String[NUMERO_ELEMENTOS_VECTOR];
		//mostrarVector(vector_nombres);
		System.out.println(Arrays.toString(vector_nombres));
		
		vector_nombres[0]="manu";
		vector_nombres[1]="pepe";
		vector_nombres[2]="luis";
		vector_nombres[3]="juan";
		//mostrarVector(vector_nombres);
		System.out.println(Arrays.toString(vector_nombres));
		
		
		String[] vector_nombres2 = {"manu","pepe","luis","juan"};
		System.out.println(Arrays.toString(vector_nombres2));
		
		System.out.println("***************************************");
		System.out.println("JUGANDO CON MATRICES..........");
		
		int[][] matriz = new int[3][4];
		matriz[1][2] = 4;
		
		for (int i = 0; i < matriz.length; i++) {
			//System.out.println("i: "+i);
			for (int j = 0; j < matriz[i].length; j++) {
				//System.out.println("["+i+","+j+"]");
				matriz[i][j] = 5;
			}
		}
		
		mostrarMatriz(matriz);
		matriz[2][1]=33;
		mostrarMatriz(matriz);
		
//		matriz[0][0] = 5;
//		matriz[0][1] = 5;
//		matriz[0][2] = 5;
//		matriz[0][3] = 5;
//		
//		matriz[1][0] = 5;
//		matriz[1][1] = 5;
//		matriz[1][2] = 5;
//		matriz[1][3] = 5;
//		
//		matriz[2][0] = 5;
//		matriz[2][1] = 5;
//		matriz[2][2] = 5;
//		matriz[2][3] = 5;
		
		Scanner entrada_escaner = new Scanner(System.in);
		
		int[][]tablero= new int[5][5];
		tablero[3][1]=-1;
		tablero[2][2]=-1;
		tablero[1][3]=-1;
		tablero[2][3]=-1;
		tablero[1][1]=-1;
		tablero[2][3]=+1;
		
		//mostrarMatriz(tablero);
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
		
		int jugada = 0;
		
		do {
			System.out.println("ingrese la fila");
			int fila =entrada_escaner.nextInt();
			System.out.println("ingrese la columna");
			int columna =entrada_escaner.nextInt();
			jugada = tablero[fila][columna];
			System.out.println("Jugada es: "+jugada);
		}while (jugada!=-1 && jugada!=1);
		
		if (jugada==1) {
			System.out.println("has encontrado el tesoro");
		}else {
			System.out.println("caiste en una bomba");
		}
		
		
		
	}
	
	public static void mostrarMatriz(int[][] matriz) {
		System.out.println("-----------------");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		System.out.println("-----------------");
	}
	
	
	public static void mostrarVector(String[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(i);
			System.out.println(vector[i]);
		}
	}

}
