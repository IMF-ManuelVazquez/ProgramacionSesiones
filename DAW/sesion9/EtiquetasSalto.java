package sesion9;

import java.util.Scanner;

public class EtiquetasSalto {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);

		for (int i = 0; i <10; i++) {
			System.out.println(i);
			if (i>3)
				continue;
			
			System.out.println("Pues seguimos para adelante");
			//break;
		}
		
//		int contador = 0;
//		while (true) {
//			int entrada = entrada_escaner.nextInt();
//			System.out.println("Usuario introdujo: "+entrada);
//			if (entrada==-1)
//				break;
//		}
		
//		System.out.println("***************************************");
//		System.out.println("ejemplos de bloque de contenido");
//		
//		
		for (int minus = 0; minus <60; minus++) {
			
			for (int sec = 0; sec < 60; sec++) {
				
				
				System.out.println(minus+" : "+sec);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
//		
		
		System.out.println("********************************");
		luca: for (int i = 0; i < 3; i++) {
			
			System.out.println("a: "+i);
			angel: for (int j = 0; j < 3; j++) {
				System.out.println("b: "+j);
				
				break luca;
			}
		}
		

	}

}
