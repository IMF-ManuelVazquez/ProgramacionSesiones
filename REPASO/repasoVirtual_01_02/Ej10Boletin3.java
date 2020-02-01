package repaso01_02;

import java.util.Scanner;

/**
 * Ej10 Boletin3 
 * Escribir dos funciones que permitan calcular:
• 		La cantidad de segundos en un tiempo dado en horas, minutos y segundos.
• 		La cantidad de horas, minutos y segundos de un tiempo dado en segundos.
  Escribe un programa principal con un menú donde se pueda elegir la opción de convertir a segundos,
   convertir a horas,minutos y segundos o salir del programa
 * 
 * @author Manuel Vazquez
 *
 */
public class Ej10Boletin3 {
	
	static Scanner entrada_escaner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int seleccion=0;
		do {
			VentanaPrincipal();
			seleccion = entrada_escaner.nextInt();
			switch (seleccion) {
			case 1:
				VentanaConversionAsegundos();
				break;
			case 2:
				VentanaConversionAHorasMinutosSegundos();
				break;
			case 0:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Seleccion no conocida");
				break;
			}
		}while(VentanaPrincipal()!=0);
		
	}
	
	/**
	 * Ventana principal del ejercicio
	 */
	public static int VentanaPrincipal() {
		
		System.out.println("menu conversiones");
		System.out.println("1. Convertir a segundos");
		System.out.println("2. Convertir a horas, minutos y segundos");
		System.out.println("0. Salir.");
		
		int seleccion = entrada_escaner.nextInt();
		switch (seleccion) {
		case 1:
			VentanaConversionAsegundos();
			break;
		case 2:
			VentanaConversionAHorasMinutosSegundos();
			break;
		case 0:
			System.out.println("Salir");
			break;
		default:
			System.out.println("Seleccion no conocida");
			break;
		}
		
		return seleccion;
		
	}
	
	/**
	 * Ventana secundaria para converitr a segundos
	 */
	public static void VentanaConversionAsegundos() {
		
		System.out.println("Ingrese horas, minutos y segundos");
		int horas = entrada_escaner.nextInt();
		int minutos = entrada_escaner.nextInt();
		int segundos = entrada_escaner.nextInt();
		System.out.println("Segundos transcurridos: "+convertirASegundos(horas,minutos,segundos));
		
	}
	
	/**
	 * Ventana secundaria para convertir a horas, minutos y segundos
	 */
	public static void VentanaConversionAHorasMinutosSegundos() {
		
		System.out.println("Ingrese los segundos:");
		int segundos = entrada_escaner.nextInt();
		
		int[] valoresRetornadas = convertirSegundosAHorasMinutosSegundos(segundos);
		System.out.println("Segundos: "+valoresRetornadas[2]);
		System.out.println("Minutos: "+valoresRetornadas[1]);
		System.out.println("Horas: "+valoresRetornadas[0]);
		
	}
	
	
	/**
	 * La cantidad de segundos en un tiempo dado en horas, minutos y segundos.
	 */
	public static int convertirASegundos(int horas, int minutos, int segundos) {
		int segundos_conversion = 0;
		segundos_conversion = (horas*60*60) + (minutos*60) + segundos;
		return segundos_conversion;
	}
	
	/**
	 * Convertir de segundos a horas, minutos y segundos
	 * @param segundos  La cantidad de segundos a convertir
	 * @return Retorna un vector con los valores de horas, minutos, segundos transcurridos dado los segundos ingresados.
	 */
	public static int[] convertirSegundosAHorasMinutosSegundos (int segundos) {
		int minutos= segundos/60;		
		int horas= minutos/60;		
		segundos=segundos%60;		
		minutos= minutos%60;
		
//		int[] fecha = new int[3];
//		fecha[0]=horas;
//		fecha[1]=minutos;
//		fecha[2]=segundos;
//		
		int[] fecha = {horas,minutos,segundos};
		return fecha;
	}

}
