package dia25_01;

public class Funciones {

	public static void main(String[] args) {
		
		System.out.println("hola mundo");
		
		int variable1 = 5;    // 4 bytes la variable1 tipo entero.
		int variable2 = 10;	  // 4 bytes la variable2 tipo entero.
		int variable3 = 15;   // 4 bytes la variable3 tipo entero.
		
		System.out.println("variable1: "+variable1);
		System.out.println("variable2: "+variable2);
		System.out.println("variable3: "+variable3);
		
		
		// Estructuras:
		// Seleccion: IF, if..else, switch
		if (variable1 > 0) {
			System.out.println("variable1 mayor que 0");
		}
		// Repeticion:
		// For   while   do..while
		for (int i = 0; i < 10; i++) {
			System.out.println(variable1);
		}

		int sumatorioRetorno = Sumatorio(variable1, variable2);
		int operacion = sumatorioRetorno + 4;
		
		System.out.println(operacion);
		
	}
	
	// void = vacio >>> int
	public static int Sumatorio(int varFunc1, int varFunc2) {
		
		System.out.println("entraste en la función Sumatorio");
		int sumar = varFunc1 + varFunc2;
		System.out.println("sumar: "+sumar);
		
		return sumar;
	}
	
}
