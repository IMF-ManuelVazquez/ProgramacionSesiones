package s21_POO;

// Excepcion.

public class MainPruebas {

	public static void main(String[] args) {
		
		Ej4Reloj reloj = new Ej4Reloj(18, 8, 10);
	
		System.out.println(reloj.dameHora());
		System.out.println(reloj.dameHora("12hrs"));
		System.out.println(reloj.dameHora("24hrs"));
		System.out.println(reloj.dameHora("24horas"));
		
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			reloj.incrementarSegundo();
			System.out.println(reloj.dameHora());
		}
		

	}

}
