package s19_POO;

import java.util.Formatter;

public class GetRandom {
	public static void main(String[] args) {
		
		String dni;
		
		int dni_i = (int)(Math.random()*100000000);
		String cadena = String.format("%08d" , dni_i);
		
		System.out.println(cadena);
		
		
	}

}
