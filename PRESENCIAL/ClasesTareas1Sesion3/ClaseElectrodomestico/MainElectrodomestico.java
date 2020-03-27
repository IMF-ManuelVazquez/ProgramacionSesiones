package Tareas_Sesion1;
import java.util.*;
/**
 * 
 * @author Adrián V1.0
 *Clase ejecutable para comprobar los métodos de la clase electrodoméstico
 */
public class MainElectrodomestico {

	public static void main(String[] args) {
		//Se instancia un nuevo objeto electrodomestico
		Electrodomestico maquina = new Electrodomestico();
		Scanner teclado = new Scanner(System.in);
		
		//Se comienza a introducir los datos del electrodomestico en cuestion
		System.out.println("Introduzca las características del modelo que desea adquirir");
		System.out.println("Nombre: ");
		maquina.setNombre(teclado.nextLine());
		System.out.println("Modelo: ");
		maquina.setModelo(teclado.nextLine());
		System.out.println("Consumo: ");
		maquina.setConsumo(teclado.next().charAt(0));
		System.out.println("Peso: ");
		maquina.setPeso(teclado.nextDouble());
		System.out.println("Precio: ");
		maquina.setPrecio(teclado.nextDouble());
		System.out.println("Color: ");
		maquina.setColor(teclado.next());
		
		//Una vez finalizada la introduccion de datos, se procede con las llamadas a los métodos
		//Esta primera "funcion" es para retrasar la impresion por pantalla 1 segundo y dar así mas sensacion de proceso de datos
		System.out.println("Ha finalizado la elección, a continuación comprobaremos su disponibilidad");
		try {
			Thread.sleep (1000);
			}catch (Exception e){
			
			}
		//Se comprueba la disponibilidad del electrodomestico. En caso de no estarlo, se muestra un mensaje indicándolo.
		boolean si = maquina.disponible(maquina.getColor());
		if(si) {
			/*Si se encuentra disponible, se efectuan las llamadas a las funciones de precioFinal y toString, para obtener una especie de "factura" 
			de la elección del electrodomestico.*/
			System.out.println("A continuación, se muestra el precio del electrodoméstico que ha elegido (impuestos incluidos), así como las caracteristicas detalladas: ");
			System.out.println(maquina.toString());
			System.out.println(maquina.precioFinal());
		}else {
			System.out.println("Lo sentimos, las especificaciones que ha indicado no se encuentran disponibles en este momento");
		}
		//Finalmente se cierra la variable teclado
		teclado.close();	
	}
}
