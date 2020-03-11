package s18_POO;

public class Persona {
	
	private String nombre;   // Default : null
	private String apellidos;
	private String DNI;
	private int edad;		// Default : 0
	private long telefono;   // 983123322
	private String profesion;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellidos, String dNI) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		
		long telefono = 22222;
		this.telefono = telefono;
		
	}
	
	public Persona(String nombre, String apellidos, String dNI, int edad, long telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.edad = edad;
		this.telefono = telefono;
	}

	public Persona(String nombre, String apellidos, String dNI, int edad, long telefono, String profesion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.edad = edad;
		this.telefono = telefono;
		this.profesion = profesion;
	}
	
	// Constructor copia
	public Persona(Persona person) {
		
		this.nombre = person.getNombre();
		this.apellidos = person.getApellidos();
		this.DNI = person.getDNI();
		
		//.. 
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}
	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		if (edad>=0) {
			this.edad = edad;
		}else {
			System.out.println("edades negativas no");
		}
	}
	/**
	 * @return the telefono
	 */
	public long getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the profesion
	 */
	public String getProfesion() {
		return profesion;
	}
	/**
	 * @param profesion the profesion to set
	 */
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
	public void imprimirDatos() {
		System.out.println("nombre: "+this.nombre);
		System.out.println("apellidos: "+this.apellidos);
	}
	
	public String miToSTring() {
		String out = "nombre: "+ nombre;
		return out;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", edad=" + edad
				+ ", telefono=" + telefono + ", profesion=" + profesion + "]";
	}
	
	

	public void dormir() {
		System.out.println(this.nombre + ": dormir");
	}
	
	public void despertar() {
		System.out.println(this.nombre + ":despertar");
	}
	
	public void comer() {
		System.out.println(this.nombre + ": comer");
	}
	
	public void beber() {
		System.out.println(this.nombre + ": beber");
	}
	
	public static void beber(int value) {
		// Acciones1
	}
	
	public void beber(double value) {
		
	}
	
	public void beber(long value) {
		// Acciones2
	}

	public void beber(boolean value) {
		
	}

	public void beber(String value) {
		
	}
	
}
