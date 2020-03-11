package s16_Introduccion_POO;

import java.util.Scanner;

public class AplicacionVeterinario {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Bobby", "Pastor Aleman", 4, true);
		Perro perro2 = new Perro("Lasie", "Galgo", 5, false);
		Perro perro3 = new Perro("Pluto", "Doberman", 3);
		
		System.out.println("PERRO 1 INFORMACIÓN");
//		System.out.println("nombre: "+ perro1.getNombre_perro());
//		System.out.println("raza: "+ perro1.getRaza_perro());
//		System.out.println("edad: "+ perro1.getEdad());
//		System.out.println("Chip?: "+ perro1.isTieneChip());
		mostrarInformacionPerro(perro1);
		mostrarInformacionPerro(perro2);
		mostrarInformacionPerro(perro3);
		
		// Un ejercicio dime los nombre de los perros menores de 5 años
		System.out.println("Un ejercicio dime los nombre de los perros menores de 5 años");
		if (perro1.getEdad()<5) {
			System.out.println(perro1.getNombre_perro());
		}
		if (perro2.getEdad()<5) {
			System.out.println(perro2.getNombre_perro());
		}
		if (perro3.getEdad()<5) {
			System.out.println(perro3.getNombre_perro());
		}
		
		
		// Poner el chip a los perros haga falta.
		System.out.println("Jugando con el chip");
		System.out.println(perro2.isTieneChip());
		System.out.println(perro3.isTieneChip());
		
		perro2.setTieneChip(true);
		
		System.out.println("Jugando con el chip");
		System.out.println(perro2.isTieneChip());
		System.out.println(perro3.isTieneChip());
		
		System.out.println("************************");
		perro1.dormir();
		perro2.dormir();
		perro1.despertar();
		
		/***************************************************/
		System.out.println("******************");
		System.out.println("Centrareme en perro1");
		System.out.println(perro1.getNombre_perro());
		perro1.setNombre_perro("MMMMMMMMMMM");
		System.out.println(perro1.getNombre_perro());
		
		
		/******************************/
		System.out.println("*********************************");
		Scanner entrada_escaner = new Scanner(System.in);
		
		int value = entrada_escaner.nextInt();
	}
	
	
	public static void mostrarInformacionPerro(Perro perro) {
		System.out.println("***************");
		System.out.println("raza: "+ perro.getRaza_perro());
		System.out.println("edad: "+ perro.getEdad());
		System.out.println("Chip?: "+ perro.isTieneChip());
		System.out.println("***************");
	}

}
