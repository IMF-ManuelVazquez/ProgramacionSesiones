package sesion9;

public class Seleccion {

	public static void main(String[] args) {
		
		int valor =4;
		
		// IF
		
		System.out.println("**************************************");
		System.out.println("IF");
		
		if (valor == 5) {
			
			System.out.println("APROBASTE");
			System.out.println("ok");
			
		}
		
		// IF - ELSE
		System.out.println("**************************************");
		System.out.println("IF-ELSE");
		
		if (valor == 5) {
			System.out.println("APROBASTES");
			System.out.println("ok");
			
		} else {
			System.out.println("NO APROBASTES");
			System.out.println("MAL");
		}
		
		// SWITCH
		System.out.println("**************************************");
		System.out.println("SWITCH");
		
		switch (valor) {
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("uno");
			break;

		default:
			break;
		}

	}

}
