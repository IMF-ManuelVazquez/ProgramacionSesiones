package sesion9;


public class FuncionProcedimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int numero1 = 5;
		int numero2 = 6;
		System.out.println("numero1: "+ numero1);
		System.out.println("numero2: "+ numero2);
	
		CalcularMaximo(numero1, numero2);
		
		numero1 = 7;
		numero2 = 3;
		
		CalcularMaximo(numero1, numero2);
		
		numero1 = 2;
		numero2 = 9;
		CalcularMaximo(numero1, numero2);
		
		numero1 = 3;
		numero2 = 6;
		CalcularMaximo(numero1, numero2);
		
		
		numero1 = 2;
		numero2 = 6;
		CalcularMaximo(numero1, numero2);
		
		numero1 = 2;
		numero2 = 9;
		CalcularMaximo(numero1, numero2);
		
		
		String cadenaDeTexto = "algoTextoSinImaginacion";
		System.out.println(cadenaDeTexto.charAt(4));
		
	}
	
	
	public static void CalcularSuma(int numero1, int numero2) {
		int suma = numero1 + numero2;
		System.out.println("SUMA ES: "+suma);
	}
	
	public static void CalcularResta(int numero1, int numero2) {
		int resta = numero1 - numero2;
		System.out.println("RESTA ES: "+resta);
	}
	
	public static void CalcularMulti(int numero1, int numero2) {
		int multi = numero1 * numero2;
		System.out.println("MULTI ES: "+multi);
	}
	
	public static long CalcularMaximo(int numero1, int numero2) {
		if (numero1>numero2) {
			System.out.println("numero1 es el mayor: "+numero1);
			return numero1;
		}else {
			System.out.println("numero2 es el mayor: "+numero2);
			return numero2;
		}
	}
	
	
}
