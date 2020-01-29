package boletin1;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada_escanner= new Scanner (System.in);

		System.out.println("escribir numero de alumnos");
		int alumnos = entrada_escanner.nextInt();
		System.out.println("escribir numero de alumnas");
		int alumnas = entrada_escanner.nextInt();

		int total= (alumnos+alumnas);

		System.out.println("el porcentaje de alumnos en clase es");
		System.out.println((alumnos*100)/total);
		System.out.println("el porcentaje de alumnas en clase es");
		System.out.println((alumnas*100)/total);
		
	}

}
