package s20_POO;

import java.util.Scanner;

class SobrecargaClase {
	
	private int dato;
	private int dato2;
	
	public static void main(String[] args) {
		SobrecargaClase sc = new SobrecargaClase();
		sc.metodo1(3);
		
		SobrecargaClase.metodo1();
		
		
		String num = "3";	
		int value_int = Integer.parseInt(num);
		value_int = value_int + 1;
		System.out.println(value_int);

		
		// Metodo estaticos >>> Metodo de clase
		Math.random();
		
		// Metodo no estaticos >> Metodos de objeto
		Scanner entra = new Scanner(System.in);
		entra.nextInt();
		
		
		SobrecargaClase.metodoEstatico();
		SobrecargaClase sc2 = new SobrecargaClase();
		sc.metodoNoestatico();
		
	}
	
	public SobrecargaClase() {
		super();
	}
	public SobrecargaClase(int dato) {
		super();
		this.dato = dato;
	}
	public SobrecargaClase(int dato, int dato2) {
		super();
		this.dato = dato;
		this.dato2 = dato2;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public int getDato2() {
		return dato2;
	}

	public void setDato2(int dato2) {
		this.dato2 = dato2;
	}

	public static int metodo1() {
		return 0;
	}
	
	public void metodo1(int value) {
		
	}
	
	public void metodo1(double value) {
		
	}
	
	public void metodo1(double value, int value2) {
		
	}
	
	
	public static void metodoEstatico() {
		
	}
	
	public void metodoNoestatico() {
		
	}
	
}

