package s16_Introduccion_POO;

public class Perro {
	
	private String nombre_perro;
	private String raza_perro;
	private int edad;
	private boolean tieneChip;
	
	public Perro() {
	}
	
	public Perro(String nombre_perro, String raza_perro, int edad) {
		this.nombre_perro = nombre_perro;
		this.raza_perro = raza_perro;
		this.edad = edad;
	}
	
	public Perro(String nombre_perro, String raza_perro, int edad, boolean tieneChip) {
		this.nombre_perro = nombre_perro;
		this.raza_perro = raza_perro;
		this.edad = edad;
		this.tieneChip = tieneChip;
	}

	public String getNombre_perro() {
		return nombre_perro;
	}
	public void setNombre_perro(String nombre_perro) {
		if (nombre_perro.length()>5) {
			this.nombre_perro = nombre_perro;
		}else {
			System.out.println("Nombre incorrecto");
		}
	}
	public String getRaza_perro() {
		return raza_perro;
	}
	public void setRaza_perro(String raza_perro) {
		this.raza_perro = raza_perro;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isTieneChip() {
		return tieneChip;
	}
	public void setTieneChip(boolean tieneChip) {
		this.tieneChip = tieneChip;
	}
	public void dormir() {
		System.out.println(this.nombre_perro+": se va a dormir");
	}
	
	private double getAleatorio() {
		return Math.random();
	}
	
	public void despertar() {
		if (getAleatorio()>0.5) {
			System.out.println(this.nombre_perro+": se ha despertado");
		}
	}

}
