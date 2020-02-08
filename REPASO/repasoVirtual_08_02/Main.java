package sesion08_02;

public class Main {

	public static void main(String[] args) {
		
		// Crear una cuenta
		CuentaBancaria cuenta_persona1 = new CuentaBancaria();
		
		// Realizar un ingreso
		cuenta_persona1.realizarIngreso(1000);
		
		// Obtener la cantidad de dinero en cuenta
		int dineroCuenta = cuenta_persona1.getCuantia();
		System.out.println(dineroCuenta);
		
//		CuentaBancaria cuenta_persona2 = new CuentaBancaria();
//		cuenta_persona2.realizarIngreso(1000);
//		
//		
//		System.out.println("cuenta persona1: "+cuenta_persona1.getCuantia());
//		System.out.println("cuenta persona2: "+cuenta_persona2.getCuantia());
//		
//		cuenta_persona1.realizarTransferencia(500, cuenta_persona2);
//		
//		System.out.println("cuenta persona1: "+cuenta_persona1.getCuantia());
//		System.out.println("cuenta persona2: "+cuenta_persona2.getCuantia());
//		
//		cuenta_persona1.realizarTransferencia(200, cuenta_persona2);
//		
//		System.out.println("cuenta persona1: "+cuenta_persona1.getCuantia());
//		System.out.println("cuenta persona2: "+cuenta_persona2.getCuantia());
//		
//		cuenta_persona1.realizarTransferencia(500, cuenta_persona2);
//		
//		System.out.println("cuenta persona1: "+cuenta_persona1.getCuantia());
//		System.out.println("cuenta persona2: "+cuenta_persona2.getCuantia());
		
	}

}
