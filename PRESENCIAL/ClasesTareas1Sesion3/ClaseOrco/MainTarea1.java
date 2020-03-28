package poo_tutoriales;

public class MainTarea1 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		int grog = 3; //El grog debe ser llamado en el main para que no se reinicie cada vez que usamos un metodo.
		
		
		
		System.out.println("LAS HUESTES DEL CAOS");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Enhorabuena amo! Has sido ascendido por el señor oscuro, pero no bajes la guardia ahora,");
		System.out.println("nadie dijo que comandar un ejercito de esta magnitud fuese facil,ahora debes familiarizarte con estas alimañas.");
		System.out.println("Entre ellos hay heridos,en tu mano esta decidir a quien curar.");
		System.out.println("No contamos con medicos,confiamos en tu juicio para saber quien saldra de sus heridas y quien se convertira en comida");
		System.out.println("Como acabas de ascender muchos dudan de tu liderazgo, no permitas que la duda crezca entre ellos!");
		System.out.println("Demostrar tu poder torturando a alguno de esos gusanos cambiara su estado y ademas sera divertido para todos");
		System.out.println(" ");
		System.out.println("OBJETIVOS:");
		System.out.println("1 Comprobar el estado de salud de tus orcos.");
		System.out.println("2 El metodo beberGorg recuperara su salud, pero recuerda que no hay para todos.");
		System.out.println("3 Convierte al menos el estado de un orco a OBEDIENTE.");
		System.out.println("4 El metodo torturarOrco puede hacer que un estado negativo desaparezca, pero cuidado, su vida se reducira.");
		
		System.out.println(" ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
//		A continuacion declaramos los distintos objetos con sus atributos
		
	
		
		Orco  orco1 = new Orco("Garrosh", "General", 100, true, Orco.NERVIOSO);
		
		Orco  orco2 = new Orco("Sarognk", "Guerrero", 60, true, Orco.CONFIADO);
		
		Orco  orco3 = new Orco("Khornaj", "Chaman", 12, true, Orco.ENVENENADO);
		
		Orco  orco4 = new Orco("Thrall", "Cazador", 50, true, Orco.NERVIOSO);
		
		Orco  orco5 = new Orco("Varamithas", "Constructor", 70, true, Orco.TRAIDOR);
		
		Orco  orco6 = new Orco("Tuerto", "Aprendiz de Herrero", 100, true, Orco.HAMBRIENTO);
		
		Orco  orco7 = new Orco("Grima,lengua de serpiente", "Asesino", 6, true, Orco.PARANOICO);
		
		Orco  orco8 = new Orco("Ganon el borracho", "Constructor", 100, true, Orco.BORRACHO);
		
		Orco  orco9 = new Orco("Alimaña", "Esclavo", 26, true, Orco.OBEDIENTE);
		
		Orco  orco10 = new Orco("Saco de sangre", "Sacrificio", 15, true, Orco.OBEDIENTE);
		
		Orco orco11 = new Orco("Rugg", "Cocinero", 0, false, Orco.ENVENENADO);
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		System.out.println(orco1.toString()); //Un toString para comprobar todas las caracteristicas del Orco.
		
		//A continuacion comienza el juego de comprobar salud tambien llamando dentro al metodo privado de beberGrog, podemos elegir entre sacrificar al orco o curarle.
		grog = orco2.comprobarSalud(grog); //Le pasamos el (grog) para que cuente en ese momento la cantidad restante y se vaya actualizando.
		System.out.println(" ");
		System.out.println(" ");
		grog = orco7.comprobarSalud(grog);
		System.out.println(" ");
		System.out.println(" ");
		grog = orco9.comprobarSalud(grog);
		System.out.println(" ");
		System.out.println(" ");
		grog = orco3.comprobarSalud(grog);
		System.out.println(" ");
		System.out.println(" ");
		grog = orco1.comprobarSalud(grog);
		System.out.println(" ");
		System.out.println(" ");
		
		//Aqui comenzamos a usar el metodo torturarOrco-
	
		orco5.torturarOrco(); //Al torturarle su estado pasa de TRAIDOR a OBEDIENTE.
		
		System.out.println(" ");
		System.out.println(" ");
		
		//Si torturamos a un orco debil, la cosa cambia, lo matamos y boolean vida pasa a FALSE siempre aunque a veces un buen chiste puede salvar la vida de alguien ;)
		
		orco10.torturarOrco();
		
			
		
	}

}
