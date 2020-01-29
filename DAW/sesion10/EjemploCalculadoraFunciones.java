package sesion10;

public class EjemploCalculadoraFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Dado dos valores de entrada. Proporciona la suma, la resta, la multi y la division
		
		int num1 = 10;
		int num2 = 30;
		
//		int suma = num1 + num2;
//		int resta = num1 - num2;
//		int multi = num1 * num2;
//		int div = num1 / num2;
		
//		System.out.println("RESULTADOS:");
//		System.out.println("suma: "+suma);
//		System.out.println("resta: "+resta);
//		System.out.println("multi: "+multi);
//		System.out.println("div: "+div);
		
		int sumar = mostrarSuma(num1, num2);
		int restar = mostrarResta(num1, num2);
		int multi = mostrarMulti(num1, num2);
		int div = mostrarDiv(num1, num2);
		
		System.out.println(esMayorQueDiez(20));
		System.out.println(esMayorQueDiez(1));
		System.out.println(esMayorQueDiez(9));
		System.out.println(esMayorQueDiez(-1));
		System.out.println(esMayorQueDiez(44));
		
	}
	
	public static boolean esMayorQueDiez(int variable) {
		if (variable > 10) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int mostrarSuma(int num1, int num2) {
		
		int sumaFuncion = num1 + num2;
		System.out.println("suma: "+sumaFuncion);
		
		return sumaFuncion;
	}
	
	public static int mostrarResta(int num1, int num2) {
		int restaFuncion = num1 - num2;
		System.out.println("resta: "+restaFuncion);
		return restaFuncion;
	}
	
	public static int mostrarMulti(int num1, int num2) {
		int multiFuncion = num1 * num2;
		System.out.println("multi: "+multiFuncion);
		return multiFuncion;
	}
	
	public static int mostrarDiv(int num1, int num2) {
		int divFuncion = num1 / num2;
		System.out.println("div: "+divFuncion);
		return divFuncion;
	}

}
