package repasoDAM;

import java.util.Scanner;

public class CODE_1_PROG_S07 {

	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		int alumnos;
		int alumnas;
		int total;
		double porcentajeAlumnos;
		double porcentajeAlumnas;
		
		// Leer datos de alumnos y alumnas
		
		System.out.println("Dame cuantos alumnos hay?");
		alumnos = entrada_escaner.nextInt(); //Instrucccion bloqueante.
		
		System.out.println("Dame cuantas alumnas hay?");
		alumnas = entrada_escaner.nextInt(); //Instrucccion bloqueante.
		
		
		// Calcular el total de alumnos y alumnas de la clase para realizar la regla de 3.
		total = alumnos + alumnas;
		
		System.out.println("total "+total);
		
		porcentajeAlumnos = (alumnos * 100)/total;
		porcentajeAlumnas = (alumnas * 100)/total;
		
		System.out.println("PorcentajeAlumnos: "+porcentajeAlumnos + " %");
		System.out.println("PorcentajeAlumnas: "+porcentajeAlumnas + " %");
		
	}

}
