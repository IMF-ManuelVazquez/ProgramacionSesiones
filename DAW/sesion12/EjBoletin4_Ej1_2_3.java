package sesion12;
import java.util.Scanner;

public class EjBoletin4_Ej1_2_3 {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		int[] arr_entrada = new int[5];
		
		int sumador_positivos = 0;
		int sumador_negativos = 0;
		int contador_positivos = 0;
		int contador_negativos = 0;
		int contador_zeros = 0;
		
		// Op1
		
//		System.out.println("Intorduzca el elemento de la posicion 0");
//		arr_entrada[0] = entrada_escaner.nextInt();
//		
//		System.out.println("Intorduzca el elemento de la posicion 1");
//		arr_entrada[1] = entrada_escaner.nextInt();
//		
//		System.out.println("Intorduzca el elemento de la posicion 2");
//		arr_entrada[2] = entrada_escaner.nextInt();
//		
//		System.out.println("Intorduzca el elemento de la posicion 3");
//		arr_entrada[3] = entrada_escaner.nextInt();
//		
//		System.out.println("Intorduzca el elemento de la posicion 4");
//		arr_entrada[4] = entrada_escaner.nextInt();
//		
//		
//		// Op2 : Optima
		for (int i = 0; i < arr_entrada.length; i++) {
			System.out.println("Intorduzca el elemento de la posicion "+i);
			arr_entrada[i] = entrada_escaner.nextInt();
		}	
		
		System.out.println("MOSTRARSE EN EL MISMO ORDEN");
		for (int i = 0; i < arr_entrada.length; i++) {
			System.out.println("El elemento de la posicion "+i+" es: "+arr_entrada[i]);
		}

		System.out.println("MOSTRARSE EN EL ORDEN INVERSO");
		for (int i = arr_entrada.length-1; i >= 0; i--) {
			System.out.println("El elemento de la posicion "+i+" es: "+arr_entrada[i]);
		}
		
		// PARTE DEL EJERCICIO3
		for (int i = 0; i < arr_entrada.length; i++) {
			System.out.println("El elemento de la posicion "+i+" es: "+arr_entrada[i]);
			if (arr_entrada[i]>0) {
				sumador_positivos = sumador_positivos + arr_entrada[i];
				contador_positivos++;
			}else if (arr_entrada[i]<0) {
				sumador_negativos = sumador_negativos +  arr_entrada[i];
				contador_negativos++;
			}else if (arr_entrada[i]==0) {
				contador_zeros++;
			}
		}
		
		System.out.println("RESULTADOS");
		System.out.println("Numero de positivos detectados: "+contador_positivos);
		System.out.println("Suma total de todos los positivos detectados: "+sumador_positivos);
		System.out.println("Media total de todos los positivos detectados: "+(double)sumador_positivos/(double)contador_positivos);

		System.out.println("Numero de negativos detectados: "+contador_negativos);
		System.out.println("Suma total de todos los negativos detectados: "+sumador_negativos);
		System.out.println("Media de todos los negativos detectados: "+(double)sumador_negativos/(double)contador_negativos);
		
		System.out.println("Contador de ceros detectados: "+ contador_zeros);
		
	}

}
