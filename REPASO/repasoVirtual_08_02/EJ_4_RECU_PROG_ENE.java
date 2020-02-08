package sesion08_02;

import java.util.Scanner;

/**
 * Pedir números enteros al usuario una cantidad aleatoria de veces (pediremos
números hasta que el usuario introduzca un 0, cuando el usuario introduzca 0 acaba la fase de registro de
datos y mostramos los datos que solicita el ejercicio). El ejercicio pide indicar la cantidad de números
positivos y negativos introducidos.

 * @author Manuel Vazquez
 *
 */

// Salir del while cuando el usuario introduce un 0 
// Salir del while cuando los contadores alcancen 5
public class EJ_4_RECU_PROG_ENE {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		int numero_entrada = 0;
		int contador_positivos = 0;
		int contador_negativos = 0;
		
		do {
			
			System.out.println("Ingrese un numero. Exit(0)");
			numero_entrada = entrada_escaner.nextInt();
			// IF-ELSE
			if (numero_entrada>0) {
				contador_positivos++;
			}else {
				contador_negativos++;
			}
			
		} while (numero_entrada!=0 && contador_negativos<=5 && contador_positivos<=5);
		
		// Caso de que numero entrada distinto de 0 ok
		// contador negativos es menor que 5 ok
		// contador positivos es supuerior a 5    no ok
		// Queremos que salga. que sa un false!!!!
		// true ||  true ||  false  >>>  true
		// true &&  true  && false  >>>  false
		
		System.out.println("Numero de positivos: "+contador_positivos);
		System.out.println("Numero de negativos: "+contador_negativos);
		
		
	}

}
