package s16_Introduccion_POO;

public class Banco {

	public static void main(String[] args) {
		
		CuentaBancaria cuentaShisley = new CuentaBancaria("XAFED324234", "Shisley", "Castro FRanco", "98764590x", 100000);
		CuentaBancaria cuentaManuel = new CuentaBancaria("EADF234234", "Manuel", "Vazquez Enriquez", "12345678Z", 2000);
		
		System.out.println("inicio");
		System.out.println(cuentaManuel.toString());
		System.out.println(cuentaShisley.toString());
		
		cuentaManuel.ingresar(400);
		cuentaShisley.ingresar(1000);
		
		cuentaShisley.retirar(200);
		cuentaManuel.retirar(2000);
		
		System.out.println("fase1");
		System.out.println(cuentaManuel.toString());
		System.out.println(cuentaShisley.toString());
		
		cuentaShisley.transferenciaDinero(cuentaManuel, 1000);
		cuentaManuel.transferenciaDinero(cuentaShisley, 100);
		
		System.out.println("fase2");
		System.out.println(cuentaManuel.toString());
		System.out.println(cuentaShisley.toString());
		
		System.out.println("fase3");
		cuentaManuel.retirar(100000);
		System.out.println(cuentaManuel.toString());
		System.out.println(cuentaShisley.toString());

	}

}

