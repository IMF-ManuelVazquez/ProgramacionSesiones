package s18_POO;

import java.util.Arrays;
import java.util.Scanner;

public class Main_Persona {

	public static void main(String[] args) {
		
		// Declarar e instanciar objeto de la clase Persona en 2 pasos
		Persona alumno;  // Null
		//System.out.println(alumno.getNombre());
		alumno = new Persona();
		System.out.println(alumno.getNombre());
		alumno = new Persona("manuel", "appelidos", "333", 22, 3232323, "docente");
		System.out.println(alumno.getNombre());
		
		// Declarar e instanciar objeto de la clase Persona en 1 paso
		Persona alumno2 = new Persona("alumno2", "appelidosAlumnos2", "234234", 12, 123123, "alumno");
		
		// Jugar con los modificares de acceso de los atributos.
		//alumno2.nombre = "sadfsdfsdf";

		//Matematicas mat = new Matematicas();
		//System.out.println(mat.Sumar(22, 22));
		
		System.out.println(Matematicas.Sumar(22, 22));
		
		// Scanner entrada_escaner = new Scanner(System.in);
		// entrada_escaner.nextInt();
		// entrada_escaner.close();
		
		// opcion1 : No aconsejable
		System.out.println("nombre: "+alumno2.getNombre());
		System.out.println("apellidos: "+alumno2.getApellidos());
		
		System.out.println("nombre: "+alumno.getNombre());
		System.out.println("apellidos: "+alumno.getApellidos());
		
		// opcion2: Mas aconsejable pero no lo mejor.
		alumno2.imprimirDatos();
		alumno.imprimirDatos();
		
		// Opcion3: Correcta.
		System.out.println(alumno.toString());
		
		alumno.setEdad(alumno.getEdad()+1);
		
		System.out.println(alumno.toString());
		
		
		System.out.println(alumno);
		
		
		
		
		// Clases envoltorio.
		
		int value = 3;
		double value2 = 4.4;
		String str = "3";
		
		int valueStrToInt = Integer.parseInt(str);
		
		
		Persona.beber(valueStrToInt);
		
		System.out.println("*********************");
		
		int valor = 5;
		metodoPrueba(valor);
		System.out.println(valor);
		
		System.out.println("*********************");
		
		int[] arr = {1,4};
		metodoPrueba2(arr);
		
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void metodoPrueba(int valor) {
		valor = 11;
		System.out.println(valor);
	}
	
	public static void metodoPrueba2(int[] array) {
		//int[] arr = Arrays.copyOf(array, array.length);
		array[0] = 5;
		System.out.println(Arrays.toString(array));
	}

}
