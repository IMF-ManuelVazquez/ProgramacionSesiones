package tarea1sesion3Sencillo;

import botella.Botella;
import botella.Botella.Contenido;
import botella.Botella.Material;
import orco.Orco;

public class MainSimple {

	public static void main(String[] args) {
		
		Orco orco = new Orco("PepeOrco", "general", 100, true, Orco.NERVIOSO);
		Botella botellatipo1 = new Botella(55, Material.PLASTICO, Contenido.AGUA, 1);
		
		System.out.println("Tengo una botella con estos datos");
		System.out.println(botellatipo1);
		
		System.out.println("Se la daré al orco");
		orco.comprobarSalud(1);
		
		System.out.println("Debo reciclar??");
		System.out.println(botellatipo1.isReutilizable());
		
		System.out.println(botellatipo1.desechable());
	}
	
}
