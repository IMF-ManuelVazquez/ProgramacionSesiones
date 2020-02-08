package sesion08_02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaCuentaBancaria2 {
	
	CuentaBancaria cuenta;
	CuentaBancaria cuenta2;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClasss");
	}
	
	@Before
	public void before() {
		System.out.println("before");
		cuenta = new CuentaBancaria();
		cuenta2 = new CuentaBancaria();
	}
	
	@After
	public void after() {
		System.out.println("Fin prueba unitaria");
	}
	
	@Test(timeout = 1000)
	public void testValidarTimeout() {
		System.out.println("prueba testIngresoEnCuenta1Vez");
		cuenta.realizarIngreso(1000);
	}
	
}
