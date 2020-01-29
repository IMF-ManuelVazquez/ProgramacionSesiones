package dia25_01;

public class JugarConNumerosAleatoriosEnJava {

	public static void main(String[] args) {
		
		// Randoms entre 0 y 10
		final int NUM_MAX = 10;
		
		//int numero_aleatorio = (int) (Math.random()*(NUM_MAX+1));
		for (int i = 0; i < 1000; i++) {
			int numero_aleatorio = (int) (Math.random()*(NUM_MAX+1));
			System.out.println(numero_aleatorio);
		}
		
		
		// Randoms entre 5 y 10
		final int RANGO_MIN = 5;
		final int RANGO_MAX = 10;
		
		int rango = RANGO_MAX - RANGO_MIN; // 5
		for (int i = 0; i < 1000; i++) {
			int numero_aleatorio = (int) (Math.random()*(rango+1)+RANGO_MIN);
			System.out.println(numero_aleatorio);
		}

	}

}
