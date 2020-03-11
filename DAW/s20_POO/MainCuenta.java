package s20_POO;

public class MainCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta("Manuel", 1000);
		System.out.println(cuenta);
		cuenta.setCantidad(1500);
		System.out.println(cuenta);
		
		cuenta.ingresar(33.33);
		System.out.println(cuenta);
		
		
		cuenta.retirar(11.11);
		System.out.println(cuenta);
	}

}
