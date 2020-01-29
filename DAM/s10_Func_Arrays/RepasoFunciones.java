package s10_Func_Arrays;

public class RepasoFunciones {

	public static void main(String[] args) {
		
		System.out.println("Inicio Calculadora");
		int operador1 = 5;
		int operador2 = 10;
		
		int suma_rececpion = Sumar(operador1, operador2);
		System.out.println("El resultado de sumar es: "+suma_rececpion);
		
		suma_rececpion = Sumar(6, 8);
		suma_rececpion = Sumar(11, -8);
		
		System.out.println("Fin del main");
	}
	
	// int op1 = operador1;
	// int op2 = operador2
	
	// void : vacio >> int: retornamos un valor entero (retun()
	
	/**
	 * Sumar: Encargado de hacer la operacione de sumar dado dos valores
	 * @param op1 operador1 de la suma
	 * @param op2 operador2 de la suma
	 * @return Retorna resultante de la suma
	 */
	public static int Sumar(int op1, int op2) {
		System.out.println("inicio funcion Sumar");
		//System.out.println(op1);
		int suma = op1+op2;
		System.out.println("suma: "+suma);
		System.out.println("fin funcion Sumar");
		
		return suma;
		
	}
	
	
	

}
