package s20_POO;

public class MainContador {

	public static void main(String[] args) {
		
		// Estado >> Los valores de los atributos de un objeto en un momento determinado.
		Contador objContador = new Contador();
		System.out.println(objContador.getContador());
		
		Contador objContador2 = new Contador(100);
		// Estado inicla del objeto objContador2 es >>> 
		System.out.println(objContador2.getContador());
		
		for (int i = 0; i < 1000; i++) {
			objContador2.incrementar();
		}
		
		System.out.println(objContador2.getContador());
		System.out.println(objContador.getContador());
		

	}

}
