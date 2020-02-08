package sesion08_02;

public class CuentaBancaria {
	
	private int cuantia;
	private String nombre_cliente;
	final int IVA = 5;  // Iva 5% para las transferencias. 
	
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public int getCuantia() {
		return cuantia;
	}
	public void setCuantia(int ingresos) {
		this.cuantia = ingresos;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public int getIVA() {
		return IVA;
	}
	
	public void realizarIngreso (int cuantiaIngresar) {
		try {
			Thread.sleep(11);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.cuantia = this.cuantia+cuantiaIngresar;
	}
	
	public void realizarTransferencia (int ingreso, CuentaBancaria cuentadestino) {
		this.cuantia = this.cuantia-ingreso;
		cuentadestino.realizarIngreso(ingreso);
	}
	
}
