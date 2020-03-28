package tarea1sesion3;

import botella.Botella;
import orco.Orco;

public class DarBotellasAlOrco {
	final int MAXIMO_BOTELLAS = 10;
	
	private Orco orc;
	private Botella[] neveraBotellas = new Botella[MAXIMO_BOTELLAS]; // Guardar hasta 10 botellas.
	private int numeroBotellasAlmacenadas = 0;
	
	public DarBotellasAlOrco(String nombreOrco, String rangoOrco, int saludOrco, boolean vivoOrco, int estadoOrco) {
		
		this.orc = new Orco(nombreOrco, rangoOrco, saludOrco, vivoOrco, estadoOrco);

	}
	
	public void darBebida() {
		if (this.numeroBotellasAlmacenadas>0) {
			System.out.println("Voy a darle la ultima bebida registrada en la nevera");
			System.out.println(this.neveraBotellas[this.numeroBotellasAlmacenadas-1].toString());
			
			this.numeroBotellasAlmacenadas=this.orc.comprobarSalud(this.numeroBotellasAlmacenadas);
			System.out.println("Numero bebidas restantes: "+numeroBotellasAlmacenadas);
			this.neveraBotellas[numeroBotellasAlmacenadas-1]=null;
			this.numeroBotellasAlmacenadas--;
			
		}else {
			System.out.println("Disculpe se ha quedado sin botellas.");
		}
	}
	
	public void addBotellaEnNevera(Botella botella) {
		
		if (this.numeroBotellasAlmacenadas<(this.MAXIMO_BOTELLAS-2)) {
			this.neveraBotellas[this.numeroBotellasAlmacenadas] = botella;
			System.out.println("Añadida una nueva botella en la nevera: "+ (this.numeroBotellasAlmacenadas+1)+ "/"+this.MAXIMO_BOTELLAS);
			this.numeroBotellasAlmacenadas++;
		}else {
			System.out.println("No entran mas botellas en la nevera dele alguna al orco");
		}
		
	}
	
	public void mostrarNeveraBotellas() {
		for (int i = 0; i < this.numeroBotellasAlmacenadas; i++) {
			System.out.println(this.neveraBotellas[i].toString());
		}
	}

	public Orco getOrc() {
		return orc;
	}

	public void setOrc(Orco orc) {
		this.orc = orc;
	}

	public int getNumeroBotellasAlmacenadas() {
		return numeroBotellasAlmacenadas;
	}
	
}
