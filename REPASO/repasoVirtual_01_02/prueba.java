package repaso01_02;

public class prueba {

	public static void main(String[] args) {
		
		int segundos = 5000;
		
		int minutos= segundos/60;		
		int horas= minutos/60;		
		segundos=segundos%60;		
		minutos= minutos%60;
		
		System.out.println("segundos: "+segundos);
		System.out.println("minutos "+minutos);
		System.out.println("horas "+horas);

	}

}
