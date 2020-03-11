package s19_POO;

import s18_POO.Persona;

public class ClaseEnvoltorio {

	public static void main(String[] args) {
		
		int value1 = 5;
		int value2 = 10;
		
		int valueTotal = value1 + value2;
		System.out.println(valueTotal);
		
		Integer.max(value1, value2);
		
		
		String entrada = "22";
		
		// Convertir String >> int
		int entrada_int = Integer.parseInt(entrada);
		
		// Incrementar en uno el int.
		entrada_int++;
		
		// Convertir int >>> String
		entrada = Integer.toString(entrada_int);
		entrada = String.valueOf(entrada_int);
		
		System.out.println("Entrada: "+entrada);
		System.out.println("Entrada + 1 : "+entrada);
		
		// Convertir String >> double
		double entrada_double = Double.parseDouble(entrada);
		
		
		Persona persana = new Persona();

	}

}
