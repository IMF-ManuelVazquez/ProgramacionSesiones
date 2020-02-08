package sesion08_02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaCuentaBancaria {
	
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

	@Test
	public void testIngresoEnCuenta1Vez() {
		System.out.println("prueba testIngresoEnCuenta1Vez");
		cuenta.realizarIngreso(1000);
		int expected_value = 1000;
		assertEquals(expected_value, cuenta.getCuantia());
	}
	
	@Test
	public void testIngresoEnCuenta100Vez() {
		System.out.println("prueba testIngresoEnCuenta100Vez");
		for (int i = 0; i < 100; i++) {
			cuenta.realizarIngreso(1000);
		}
		int expected_value = 1000*100;
		assertEquals(expected_value, cuenta.getCuantia());
	}
	
	@Test
	public void testTransferencia() {
		System.out.println("prueba testTransferencia");
		cuenta.realizarIngreso(1000);
		cuenta2.realizarIngreso(1000);
		
		cuenta.realizarTransferencia(500, cuenta2);
		
		assertEquals(500, cuenta.getCuantia());
		assertEquals(1500, cuenta2.getCuantia());
	}
}
