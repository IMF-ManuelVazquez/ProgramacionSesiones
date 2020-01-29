package sesion9;

public class Repeticion {

	public static void main(String[] args) {

		int contador = 11;
		// While
		System.out.println("*****************");
		System.out.println("while");
		while (contador <10) {
			System.out.println(contador);
			contador = contador + 1;
		}
		
		
		// Do..while
		System.out.println("*****************");
		System.out.println("do while");
		contador = 11;
		do {
			System.out.println(contador);
			contador = contador + 1;
		}while(contador<5);
		
		// while repetia las instruciones de 0 a N veces
		// do .. while repite de 1 a N veces
		
		//For
		/*
		 * 1. Inicializar el punto de partida int i = 0
		 * 2. Condicion para que se ejecute las secuencias del bucle for. i<10  i==10  i>10 i!=10
		 * 3. incrementar/decrementar el valor de la variable de partida i en un paso definido. 
		 * i++ ( i= i+1 )    i--  (i = i-1)    i=i+2
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println("indice: "+i);
		}
		
		System.out.println("pregunta tipo test con trampa");
		
		for (int i = 10; i == 10; i++) {
			System.out.println("indice: "+i);
		}
		
		System.out.println("Descendente");
		
		for (int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		// POSFIJOS Y PREFIJOS.
		System.out.println("*****************");
		System.out.println("PREFIJOS Y POSFIJOS");
		
		int valor = 10;
		System.out.println("valor de partida: "+valor);
		System.out.println("posfijo:"+ (valor++));
		System.out.println("resultado final:"+valor);
		
		valor = 10;
		System.out.println("valor de partida: "+valor);
		System.out.println("prefijo:"+ (++valor));
		System.out.println("resultado final:"+valor);
		
		System.out.println("******************************************");
		System.out.println("mostrar numeros pares");
		System.out.println("ALGORITMO LUCA");
		for (int i = 0; i <= 10; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("ALGORITMO MANUEL");
		System.out.println("PARES");
		for (int i = 0; i <= 10; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("IMPARES");
		for (int i = 1; i <= 10; i=i+2) {
			System.out.println(i);
		}
		
	}

}
