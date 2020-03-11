package s17_POO;

public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}
	
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	public void ingresar(int cantidad) {
		if (cantidad>=0) {
			this.cantidad = this.cantidad + cantidad;
		}
	}
	
	public void retirar(int cantidad) {
		this.cantidad = this.cantidad - cantidad;
		if (this.cantidad<0) {
			this.cantidad=0;
		}
	}
	

}
