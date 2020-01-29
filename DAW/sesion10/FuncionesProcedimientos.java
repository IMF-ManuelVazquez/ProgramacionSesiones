package sesion10;

import java.util.Scanner;

public class FuncionesProcedimientos {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		int dato_entrada;
		int dato_entrada2;
		
//		System.out.println("Ingrese un numero entre 0 y 100");
//		dato_entrada = entrada_escaner.nextInt();
//		validarEntrada(dato_entrada);
////		if ((dato_entrada>=0)&&(dato_entrada<=100)) {
////			System.out.println("formato correcto");
////		}else {
////			System.out.println("formato incorrecto");
////		}
//		
//		
//		System.out.println("Ingrese un numero2 entre 0 y 100");
//		dato_entrada2 = entrada_escaner.nextInt();
//		validarEntrada(dato_entrada);
		
//		if ((dato_entrada2>=0)&&(dato_entrada2<=100)) {
//			System.out.println("formato correcto");
//		}else {
//			System.out.println("formato incorrecto");
//		}
		
		int num1 = 10;
		int num2 = 20;
		mostrarMayor(num1, num2);
		mostrarMenor(num1, num2);
		
		mostrarMayor(33, 55);
		mostrarMayor(44, 11);
		mostrarMayor(22, 88);
		mostrarMayor(11, 5);
		
		mostrarMenor(22, 333);
		mostrarMenor(2111, 12);
		
		// Saber el mayor de num1 y num2 para sumarle 10 y restarle 20
		
		int mayorRetornado = getMayor(num1, num2);
		System.out.println("mayor retornado: "+ mayorRetornado);
		
		int total_operacion = (mayorRetornado + 10)-20;
		System.out.println(total_operacion);
		

		if (total_operacion > 10) {
			System.out.println("ffff");
		} else {
			System.out.println("ggg");
		}

		System.out.println();


	}
	
	/*
	 * 
	 * main(){
	 * 
	 * 
	 * }
	 * 
	 * Sino retorna nadad:
	 * public static "void" nombreFuncion(args){
	 * }
	 * 
	 * Si queremos que retorne una variable
	 * public static (tipoVariable) nombreFuncion(args){
	 * 
	 *   return variable de tipo "tipoVariable"
	 * }
	 * 
	 */
	
	
	public static int getMayor(int var1, int var2) {
		int mayor;
		if (var1 > var2 ) {
			mayor = var1;
		}else {
			mayor = var2;
		}
		return mayor;
	}
	
	public static void mostrarMayor(int var1, int var2) {
		int mayor;
		if (var1 > var2 ) {
			mayor = var1;
		}else {
			mayor = var2;
		}
		System.out.println("Mayor es : "+mayor);	
	}
	
	public static void mostrarMenor(int var1, int var2) {
		int menor;
		if (var1 < var2 ) {
			menor = var1;
		}else {
			menor = var2;
		}
		System.out.println("Menor es : "+menor);
	}

	
	
	// Procedimento para validar datos de entrada.
//	public static void validarEntrada(int dato_a_validar) {
//		
//		if ((dato_a_validar>=0)&&(dato_a_validar<=100)) {
//			System.out.println("formato correcto");
//		}else {
//			System.out.println("formato incorrecto");
//		}
//		
//	}
	
//	public static void validarEntrada(int variable1, int variable2, int variable3) {
//		
//		System.out.println("mostrar variable: "+variable1);
//		System.out.println("mostrar variable: "+variable2);
//		System.out.println("mostrar variable: "+variable3);
//		System.out.println("validar Entrada y sin variable de entrada");
//		
//	}
	
	

}
