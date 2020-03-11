package s20_POO;

public class Cuenta {
	private String nombre;
	private double cantidad;
	
	public Cuenta(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Cuenta(String nombre, double cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "El estado actual es [nombre=" + this.nombre + ", cantidad=" + this.cantidad + "]";
	}
	
	public void ingresar(double cantidad) {
		if (cantidad>0) {
			this.cantidad = this.cantidad + cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		this.cantidad = this.cantidad-cantidad;
		if (this.cantidad<0) {
			this.cantidad=0;
		}
	}
	
}
