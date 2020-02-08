package sesion08_02;

public class pruebasANDOR {

	public static void main(String[] args) {
		
		int value1 = 1;
		int value2 = 2;
		
		
		
//		System.out.println("value1==value2: "+(value1==value2));
//		System.out.println("value1>value2: "+(value1>value2));
//		System.out.println("value1<value2: "+(value1<value2));
//		System.out.println("value1==0: "+(value1==0));
//		System.out.println("value2==0: "+(value2==0));
//		
//		System.out.println((value1==0) || (value1<value2));
		
		// otra explciacion mejorada
		
		System.out.println(true);
		System.out.println(false);
		
		System.out.println("&&");
		
		// Para aprobar hay que aprobar el examen 1 y el examen 2
		System.out.println(true && true && true);
		System.out.println(true && false && true);
		System.out.println(false && false && true);
		
		System.out.println("||");
		// Para aprobar hay que aprobar el examen 1 o el examen 2
		System.out.println(true || true || true);
		System.out.println(true || false || true);
		System.out.println(false || false || true);
		System.out.println(false || false || false);
		

	}

}
