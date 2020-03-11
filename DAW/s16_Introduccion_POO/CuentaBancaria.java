package s16_Introduccion_POO;


/**
 * fsdfsdf la calse del avida xplcia lo que hacesdfsdfadsfas
 * @author Manuel Vazquez
 * @version 1.0
 *
 */
public class CuentaBancaria {

	private String IBAN;
	private String nombre;
	private String apellidos;
	private String DNI;
	private int cuantia;
	private final double COMISION_BANCARIA = 0.02;
	
	
	/**
	 * jhglkhlkuhlkuhlkuhlkhluhuh 
	 * @param iBAN
	 * @param nombre
	 * @param apellidos
	 */
	public CuentaBancaria(String iBAN, String nombre, String apellidos) {
		super();
		IBAN = iBAN;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	
	

	public CuentaBancaria(String iBAN, String nombre, String apellidos, String dNI, int cuantia) {
		super();
		IBAN = iBAN;
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.cuantia = cuantia;
	}




	/**
	 * 
	 * @return
	 */
	public String getIBAN() {
		return IBAN;
	}

	

	/**
	 * set iban sive para setear el iban
	 * @param iBAN este el iban donde indcamos el iban del cliente
	 */
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	
	/**
	 * gdfgdfg
	 * @return gdsrgdrg
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * 
	 * @return
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * 
	 * @param dNI
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getCuantia() {
		return cuantia;
	}

	/**
	 * 
	 * @param cuantia
	 */
	public void setCuantia(int cuantia) {
		this.cuantia = cuantia;
	}
	
	/**
	 * 
	 * @param cantidad
	 */
	public void ingresar(int cantidad) {
		this.cuantia = this.cuantia + cantidad;
	}
	
	public void retirar(int cantidad) {
		this.cuantia = this.cuantia - cantidad;
	}
	
	/**
	 * 
	 * @param destino
	 * @param cantidad
	 */
	public void transferenciaDinero (CuentaBancaria destino, int cantidad) {
		retirar(cantidad);
		destino.ingresar(cantidad);
	}

	@Override
	public String toString() {
		return "CuentaBancaria [IBAN=" + IBAN + ", nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI
				+ ", cuantia=" + cuantia + "]";
	}
	
}
