package s16_Introduccion_POO;

public class AplicacionVivero {

	public static void main(String[] args) {
		
		Arbol olmo = new Arbol("olmo", 200, "fruta", "madera", 10);
		Arbol abedul = new Arbol ("Abedul", 150, "fruta", "madera", 5);
		Arbol abeto = new Arbol ("Abeto", 150, "fruta", "madera", 5);
		
		// Revisar cuandos abedules tenemos.
		System.out.println(abedul.getNumero_en_inventario());
		
		// Llega un cliente y compra 5
		abedul.venderArbol(5);
		abedul.adquisicionArboles(15);
		olmo.adquisicionArboles(20);
		
		System.out.println("Abudule en inventario: "+abedul.getNumero_en_inventario());
		System.out.println("Olmo en inventario: "+olmo.getNumero_en_inventario());
	}

}
