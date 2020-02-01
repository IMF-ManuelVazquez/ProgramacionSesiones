package repaso01_02;

import java.util.Scanner;

/**
 * Ej 2.9.1 Boletin 2. Perro dormilón.
 * @author Manuel Vazquez
 *
 */
public class ej2_9_Boletin1 {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		
		int dato_entrada=0;
		int contador_aciertos = 0;
		do {
			System.out.println("Introduzca un dato entre 0 o 1. -1 para salir.");
			dato_entrada = entrada_escaner.nextInt();
			if (dato_entrada>=-1 && dato_entrada<=1) {
				int estado_perro = (int)(Math.random()*2);
				//int estado_perro = (int) Math.round(Math.random());
				if (dato_entrada==estado_perro) {
					System.out.println("Acertastes");
					contador_aciertos++;
					System.out.println("Contador aciertos: "+contador_aciertos);
				}else {
					System.out.println("Fallastes");
					System.out.println("Fallastes tu racha ha sido: "+contador_aciertos);
					contador_aciertos=0;
				}
			}else {
				System.out.println("formato erroneo");
			}
		}while(dato_entrada!=-1);
		System.out.println("Fin del algoritmo");
		
		entrada_escaner.close();

	}
	
	// Math.random() >>> 0 y 1   0.3   0.6  0.7   
	// Math.round()  >>> >=0.5  1       < 0.5  0
	
	//  para 0.3      redondeo = 0    truncar = 0
	//  para 0.7      redondeo = 1    truncar = 0

}
