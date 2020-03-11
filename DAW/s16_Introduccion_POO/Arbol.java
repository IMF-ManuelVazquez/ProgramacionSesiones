package s16_Introduccion_POO;

public class Arbol {

	// ATRIBUTOS
	private String nombre_espacie;
	private int altura;
	private String tipo_de_fruta;
	private String tipo_de_madre;
	private int numero_en_inventario;
	
	// Constructores
	// Constructor1 defecto. Constructor sin argumentos de entrada.
	public Arbol() {
	}

	// Constuir2. Puede haber otros constructores donde aparte de vincular el objeto con la clase se transmite la información hacia los atributos.
	public Arbol(String nombre_espacie, int altura, String tipo_de_fruta, String tipo_de_madre, int numero_en_inventario) {
		this.nombre_espacie = nombre_espacie;
		this.altura = altura;
		this.tipo_de_fruta = tipo_de_fruta;
		this.tipo_de_madre = tipo_de_madre;
		this.numero_en_inventario= numero_en_inventario;
	}

	// Crear getters & setters
	public String getNombre_espacie() {
		return nombre_espacie;
	}

	public void setNombre_espacie(String nombre_espacie) {
		this.nombre_espacie = nombre_espacie;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getTipo_de_fruta() {
		return tipo_de_fruta;
	}

	public void setTipo_de_fruta(String tipo_de_fruta) {
		this.tipo_de_fruta = tipo_de_fruta;
	}

	public String getTipo_de_madre() {
		return tipo_de_madre;
	}

	public void setTipo_de_madre(String tipo_de_madre) {
		this.tipo_de_madre = tipo_de_madre;
	}

	public int getNumero_en_inventario() {
		return numero_en_inventario;
	}

	public void setNumero_en_inventario(int numero_en_inventario) {
		this.numero_en_inventario = numero_en_inventario;
	}
	
	public void venderArbol(int arbolesVendidos) {
		this.numero_en_inventario = this.numero_en_inventario - arbolesVendidos;
	}
	
	public void adquisicionArboles(int arbolesIngresados) {
		this.numero_en_inventario = this.numero_en_inventario + arbolesIngresados;
	}
	
	public void regarArbol() {
		
	}
	
}
