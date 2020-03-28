package tarea1sesion3;
import botella.Botella;
import botella.Botella.Contenido;
import botella.Botella.Material;
import orco.Orco;

public class MainApp {

	public static void main(String[] args) {
		
		// Creo dos casos de uso.
		DarBotellasAlOrco caso1 = new DarBotellasAlOrco("PepeOrco", "general", 100, true, Orco.NERVIOSO);
		DarBotellasAlOrco caso2 = new DarBotellasAlOrco("ManolitoOrco", "sargento", 100, true, Orco.CONFIADO);
		
		// Estado inicial
		mostrarInfoCasos("caso1",caso1);
		mostrarInfoCasos("caso2",caso2);
		
		// Voy a meter botellas en las diferentes neveras para cada caso.
		// Creo diferentes botellas.
		Botella botellatipo1 = new Botella(55, Material.PLASTICO, Contenido.AGUA, 1);
		Botella botellatipo2 = new Botella(55, Material.METAL, Contenido.CERVEZA, 1);
		Botella botellatipo3 = new Botella(55, Material.PLASTICO, Contenido.ZUMO, 1);
		Botella botellatipo4 = new Botella(55, Material.METAL, Contenido.REFRESCO, 1);
		
		// Añado en la nevera del caso1 2 botellas del tipo1, 1 del tipo 2 y 2 del tipos 3.
		caso1.addBotellaEnNevera(botellatipo1);
		caso1.addBotellaEnNevera(botellatipo1);
		caso1.addBotellaEnNevera(botellatipo2);
		caso1.addBotellaEnNevera(botellatipo3);
		caso1.addBotellaEnNevera(botellatipo3);
		
		// Añado en la nevera del caso2 2 botellas del tipo4, 1 del tipo 3 y 2 del tipos 2.
		caso2.addBotellaEnNevera(botellatipo4);
		caso2.addBotellaEnNevera(botellatipo4);
		caso2.addBotellaEnNevera(botellatipo3);
		caso2.addBotellaEnNevera(botellatipo2);
		caso2.addBotellaEnNevera(botellatipo2);
		
		// Estado tras llenar las neveras.
		mostrarInfoCasos("caso1",caso1);
		mostrarInfoCasos("caso2",caso2);
		
		//Le doy de beber al orco del caso1 1 vez.
		caso1.darBebida();
		
		//Le doy de beber al orco del caso2 2 veces.
		for (int i = 0; i < 2; i++) {
			caso2.darBebida();
		}
		
		// Estado tras darles de beber.
		mostrarInfoCasos("caso1",caso1);
		mostrarInfoCasos("caso2",caso2);
		
		// Se observa que la clase Orco tiene un fallo que cuando le das de beber aunquele indiques uno se bebe 2 :D
	}
	
	public static void mostrarInfoCasos(String label, DarBotellasAlOrco caso) {
		System.out.println("******************************");
		System.out.println("INFO LABEL: "+label);
		System.out.println("ORCO:");
		System.out.println(caso.getOrc());
		System.out.println("NEVERA:");
		System.out.println("NUMERO_BEBIDAS: "+caso.getNumeroBotellasAlmacenadas());
		caso.mostrarNeveraBotellas();
		System.out.println("******************************");
	}
	
}
