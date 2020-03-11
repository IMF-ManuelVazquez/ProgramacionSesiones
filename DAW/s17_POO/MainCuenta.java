package s17_POO;

public class MainCuenta {

	public static void main(String[] args) {
		
		Cuenta cuentaPepe = new Cuenta("Pepe");
		Cuenta cuentaJulia = new Cuenta("Julia", 300);
		Cuenta cuentaJuli2 = new Cuenta("Juli2");
		
		System.out.println(cuentaJulia.toString());
		cuentaJulia.ingresar(200);
		cuentaJulia.retirar(50);
		System.out.println(cuentaJulia.toString());

	}

}
