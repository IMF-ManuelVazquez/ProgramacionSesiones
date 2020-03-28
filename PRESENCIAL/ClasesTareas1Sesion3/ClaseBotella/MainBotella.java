package sesion1;

import sesion1.Botella.*;


public class MainBotella {

	public static void main(String[] args) {



		//Creamos el objeto bezoya a partir de las caracteristicas de una botella de bezoya que contiene en su interior 500ml
		//Creamos el objeto heineken a partir de las caracteristicas de una heineken de vidrio que contiene en su interior 0ml

		Botella bezoya= new Botella("Bezoya", 1000, "Azul", Material.PLASTICO, Contenido.AGUA, false, 500, true);
		Botella heineken = new Botella("Heineken", 330, "verde", Material.VIDRIO, Contenido.CERVEZA, false, 0, false);



		System.out.println(bezoya.toString());
		System.out.println(heineken.toString());

		//Digamos que queremos si la botella es reutilizable, para ello aplicaremos la funcion reutilizable(), para reutilizarla debera estar vacia, pero esto se implementa dentro de la función reutilizable,

		System.out.println("Funcion reutilizable");
		System.out.println("");
		
		bezoya.reutilizable();
		
		System.out.println("");
		
		heineken.reutilizable();
		
		System.out.println("");

		//Ya que la botella bezoya no es reutilizable, veremos si las podemos desechar con la funcion desechable(), donde nos confirmara de nuevo si se puede reutilizar
		System.out.println("");
		
		System.out.println("Funcion desechable");
		
		System.out.println("");

		bezoya.desechable();
		
		System.out.println("");
		
		heineken.desechable();

		System.out.println("");
		System.out.println("Funcion reutilizable con la nueva botella Bezoya");
		//En el caso de que la botella de bezoya fuese de vidrio y la quisieramos desechar, habria que vaciarla primero.
		bezoya.setMaterial(Material.VIDRIO);
		//volvemos a asignarle una cantidad ya que al aplicar la funcion desechable() y reutilizable() la botella se vacia;
		bezoya.setCantidad(700);

		bezoya.reutilizable();
		
		System.out.println("");
		System.out.println("Ahora la botella nueva de bezoya tiene el material " + bezoya.getMaterial() + " y " + "la cantidad de " + bezoya.getCantidad());
		System.out.println("");
		
		System.out.println(bezoya.toString());
		
		System.out.println("");
		
		System.out.println(heineken.toString());

	}

}
