package coronavirus;

import java.util.Scanner;

public class MainPaciente {

	public static void main(String[] args) {
		String nombre;
		String sintomas;
		double temperatura;
		char dolores;
		String zona;
		int propagacion;

		Scanner sc=new Scanner(System.in);




		System.out.println("Nombre del Paciente");
		nombre = sc.nextLine();
		System.out.println("Que sintomas presenta");
		sintomas=sc.nextLine();
		System.out.println("Que temperatura presenta");
		temperatura=sc.nextDouble();
		System.out.println("tiene dolores musculares?Y/N");
		dolores=sc.next().charAt(0);
		System.out.println("zona que se encuentra el paciente");
		zona = sc.next();
		System.out.println("con cuantas personas a estado cerca?");
		propagacion=sc.nextInt();

		sc.close();
		
		// ya ves a que pantalla tengo acceso sibaja la flecha y estan las app
		abajo
		e
		
		Paciente paciente1=new Paciente(nombre, sintomas, temperatura, dolores, zona, propagacion);
		
		System.out.println(paciente1);




		System.out.println("resultado de los pacientes son:");




	}

}
