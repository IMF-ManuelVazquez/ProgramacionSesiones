package peluqueria;


public class MainRegistroPeluqueria {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Manuel Vazquez Enriquez", Descuentos.PREMIUM);
		Cliente cliente2 = new Cliente("Juan Lopez Seco");
		
		RegistroVisitas registroVisitas = new RegistroVisitas(100);
		registroVisitas.registrarNuevaVisita(cliente1,Servicios.CORTE);
		registroVisitas.registrarNuevaVisita(cliente1, Servicios.AFEITADO);
		registroVisitas.registrarNuevaVisita(cliente2, Servicios.TINTE);
		
		registroVisitas.mostrarInformacionVisitas(registroVisitas.getRegistroVisitasAll());
		registroVisitas.mostrarInformacionVisitas(registroVisitas.getRegistroVisitasFiltroCliente(cliente1));
		
	}
}
