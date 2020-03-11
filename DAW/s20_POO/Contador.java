package s20_POO;

public class Contador {
	
	//Atributos
	private int contador = 0;  // int 0

	//Constructores
	public Contador() {
		//this.contador = -1;
	}
	
	public Contador(int contador) {
		this.contador = contador;
	}
	
	// Getters & Setters
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	// Otros metodos
	public void incrementar() {
		this.contador ++;
	}
	
	public void decrementar() {
		this.contador--;
	}
	
}
