package sesion14;

import java.util.Scanner;

public class EjBoletinVacacionesArray_Ej9 {

	public static void main(String[] args) {
		
		final int DIAS_REGISTRADOS = 5;  // Numero de dias registrados en el ejercicio.
		int temp_minima = 100;
		int temp_max_corte = 0;
		Scanner entrada_escaner = new Scanner(System.in);
		
		// int[] temp_max = new int[DIAS_REGISTRADOS];
		// int[] temp_min = new int[DIAS_REGISTRADOS];
		
		int[] temp_min = {10,11,12,11,10};
		int[] temp_max = {21,22,25,24,20};
		
		for (int i = 0; i < DIAS_REGISTRADOS; i++) {
			System.out.println("DIA "+(i+1));
			double media = (double)(temp_max[i]+temp_min[i])/2;
			System.out.println(media);
		}
		
		
		for (int i = 0; i < DIAS_REGISTRADOS; i++) {
			if (temp_min[i]<temp_minima) {
				temp_minima = temp_min[i];
			}
		}	
		System.out.println("La temperatura minima ha sido: "+ temp_minima);
		System.out.println("Correspondiente a los días:");
		
		for (int i = 0; i < DIAS_REGISTRADOS; i++) {
			if (temp_min[i]==temp_minima) {
				System.out.println("DIA "+(i+1));
			}
		}
		
		System.out.println("Usuario introduzca una temperatuar maxima para indicarte los días en los que se encuentra");
		temp_max_corte = entrada_escaner.nextInt();
		boolean coincidencia = false;
		
		for (int i = 0; i < DIAS_REGISTRADOS; i++) {
			if (temp_max[i]==temp_max_corte) {
				System.out.println("DIA "+(i+1));
				coincidencia = true;
			}
		}
		
		if (!coincidencia) {
			System.out.println("Ningun dia ha coincidido con esta temperatura maxima");
		}
		
 
	}

}
