package ejemploRelacionesAplicacionPago;

public class PlataformaAplicacion {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		TarjetaDeCredito tarjeta = new TarjetaDeCredito();
		cliente.setTarjetaDeCredito(tarjeta);
		
		cliente.getTarjetaDeCredito().toString();

	}

}
