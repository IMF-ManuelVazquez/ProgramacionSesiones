package ejemploRelacionesAplicacionPago;

public class Cliente {
	
	private int codCliente;
	private String nombre; // null
	private TarjetaDeCredito tarjetaDeCredito;  // null
	private Vendedor vendedor; // null
	
	public Cliente() {
		vendedor  = new Vendedor();
	}
	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nombre=" + nombre + ", tarjetaDeCredito=" + tarjetaDeCredito
				+ ", vendedor=" + vendedor + "]";
	}
	
	public TarjetaDeCredito getTarjetaDeCredito() {
		return tarjetaDeCredito;
	}
	public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
		this.tarjetaDeCredito = tarjetaDeCredito;
	}
	
	

}
