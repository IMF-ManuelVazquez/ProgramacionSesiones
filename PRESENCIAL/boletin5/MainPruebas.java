package boletin5;

public class MainPruebas {

	public static void main(String[] args) {
		
		Ej6MetodoDeAcceso acceso = new Ej6MetodoDeAcceso("pepe", "1234");
		System.out.println(acceso);
		System.out.println("estadoConectado:" +acceso.estadoConectado());
		System.out.println("estadoBloqueado:" +acceso.estaBloqueado());
		System.out.println("intentos:" +acceso.obtenerNumeroIntentos());
		
		System.out.println(acceso.conectado("ddd", "222"));
		System.out.println("estadoConectado:" +acceso.estadoConectado());
		System.out.println("estadoBloqueado:" +acceso.estaBloqueado());
		System.out.println("intentos:" +acceso.obtenerNumeroIntentos());
		
		System.out.println(acceso.conectado("pepe", "1234"));
		System.out.println("estadoConectado:" +acceso.estadoConectado());
		System.out.println("estadoBloqueado:" +acceso.estaBloqueado());
		System.out.println("intentos:" +acceso.obtenerNumeroIntentos());
		
		System.out.println(acceso.desconectar());
		System.out.println("estadoConectado:" +acceso.estadoConectado());
		System.out.println("estadoBloqueado:" +acceso.estaBloqueado());
		System.out.println("intentos:" +acceso.obtenerNumeroIntentos());
		

	}

}
