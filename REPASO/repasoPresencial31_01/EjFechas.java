package repasoPresencial31_01;

import java.util.Scanner;

/**
 * Ej2 Examen Recuperación Examen presencial.
 * @author Manuel Vazquez
 *
 */
public class EjFechas {

	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		int diaSemana=0;
		int dia=0;
		int mes=0;
		int anio = 0;
		String diaSemanaStr ="";
		String mesStr = "";
		
		System.out.println("Ingrese dia de la semana");
		diaSemana = entradaEscaner.nextInt();
		
		System.out.println("Ingrese dia del mes");
		dia = entradaEscaner.nextInt();
		
		System.out.println("Ingrese el mes");
		mes = entradaEscaner.nextInt();
		
		System.out.println("Ingrese año");
		anio = entradaEscaner.nextInt();
		
		if ((diaSemana>=1 && diaSemana<=7) && (dia>=1 && dia<=31) && (mes>=1 && mes<=12) &&(anio>=1900 && anio<=2100)) {
			System.out.println(diaSemana+", "+dia+" de "+mes+" de "+anio);
			switch (diaSemana) {
			case 1:
				diaSemanaStr ="Lunes";
				break;
			case 2:
				diaSemanaStr ="Martes";
				break;
			case 3:
				diaSemanaStr ="Miercoles";
				break;
			case 4:
				diaSemanaStr ="Jueves";
				break;
			case 5:
				diaSemanaStr ="Viernes";
				break;
			case 6:
				diaSemanaStr ="Sabado";
				break;
			case 7:
				diaSemanaStr ="Domingo";
				break;
			}
			
			switch (mes) {
			case 1:
				mesStr ="Enero";
				break;
			case 2:
				mesStr ="Febrero";
				break;
			case 3:
				mesStr ="Marzo";
				break;
			case 4:
				mesStr ="Abril";
				break;
			case 5:
				mesStr ="Mayo";
				break;
			}
			
			System.out.println(diaSemanaStr+", "+dia+" de "+mesStr+" de "+anio);
	
			
		} else {
			System.out.println("Formato incorrecto");
		}

	}

}
