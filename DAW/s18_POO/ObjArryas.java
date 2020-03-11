package s18_POO;

public class ObjArryas {

	public static void main(String[] args) {

		Persona[] clase1 = new Persona[3];
		clase1[0] = new Persona("manuel1", "appelidos", "333", 14, 3232323, "docente");
		clase1[1] = new Persona("manuel2", "appelidos", "333", 20, 3232323, "docente");
		clase1[2] = new Persona("manuel3", "appelidos", "333", 17, 3232323, "docente");
		
		
		Persona[] clase2 = new Persona[3];
		clase2[0] = new Persona("manuel1", "appelidos", "333", 14, 3232323, "docente");
		clase2[1] = new Persona("manuel2", "appelidos", "333", 20, 3232323, "docente");
		clase2[2] = new Persona("manuel3", "appelidos", "333", 17, 3232323, "docente");
		
		
		Persona[][] escuela = new Persona[2][3];
		escuela[0]=clase1;
		escuela[1]=clase2;
		
	}
	
	
	public static void detectarLosMayoresDeEdad(Persona[] arrPersonas) {
		
		for (int i = 0; i < arrPersonas.length; i++) {
			
			if (arrPersonas[i].getEdad()>=18) {
				System.out.println(arrPersonas[i].getNombre()+ "es mayor de edad");
			}else {
				System.out.println(arrPersonas[i].getNombre()+ "es menor de edad");
			}
			
		}
		
	}

}
