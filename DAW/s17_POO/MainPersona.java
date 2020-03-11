package s17_POO;

import java.util.Scanner;

import s18_POO.Persona;

public class MainPersona {

	public static void main(String[] args) {
		
		// En dos pasos creamos un objeto yluego le indicamos sus valores.
		Persona jose = new Persona();
		jose.setNombre("Jose");
		jose.setApellidos("Perez Perez");
		jose.setDNI("77332211F");
		jose.setEdad(22);
		jose.setTelefono(988112233);
		
		System.out.println("DATOS DE JOSE");
		System.out.println("nombre: "+jose.getNombre());
		System.out.println("apellidos: "+jose.getApellidos());
		System.out.println("DNI: "+jose.getDNI());
		System.out.println("edad: "+jose.getEdad());
		System.out.println("telefono: "+jose.getTelefono());
		
		
		// Op2: Crear un objeto con atributos.
		Persona maria = new Persona("Maria", "Lopez Lopez", "88888888D", 22, 987772211, "Estudiante");
		
		System.out.println("DATOS DE MARIA");
		System.out.println("nombre: "+maria.getNombre());
		System.out.println("apellidos: "+maria.getApellidos());
		System.out.println("DNI: "+maria.getDNI());
		System.out.println("edad: "+maria.getEdad());
		System.out.println("telefono: "+maria.getTelefono());
		
//		// peDIR LOS DATOS POR SCANNER
//		Scanner entrada_escaner = new Scanner(System.in);
//		System.out.println("Dame nombre");
//		String nombre = entrada_escaner.nextLine();
//		System.out.println("Dame apellidos");
//		String apellidos = entrada_escaner.nextLine();
//		System.out.println("Dame DNI");
//		String DNI = entrada_escaner.nextLine();
//		System.out.println("Dame edad");
//		int edad = entrada_escaner.nextInt();
//		System.out.println("Dame telefono");
//		long telefono = entrada_escaner.nextLong();
//		System.out.println("Dame profesion");
//		String profesion = entrada_escaner.next();
//		
//		Persona personaCustom = new Persona(nombre, apellidos, DNI, edad, telefono, profesion);	
		
		
		jose.despertar();
		
		jose.comer();
		
		jose.setEdad(-70);
		System.out.println("Edad de jose: "+jose.getEdad());

		
		String nombre = "Juan";
		nombre = nombre.toLowerCase();

		Persona alumno2 = new Persona("alumno2", "appelidosAlumnos2", "234234", 12, 123123, "alumno");
		
		// Jugar con los modificares de acceso de los atributos.
		//alumno2.nombre = "sadfsdfsdf";
	}

}
