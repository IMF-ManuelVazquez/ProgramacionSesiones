package sesion10;

import java.util.Scanner;

public class PruebasConOperadorTernario {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int mayor;
		int menor;
		
		if (num1 > num2 ) {
			mayor = num1;
		}else {
			mayor = num2;
		}
		
		// Estructura operador ternario
		// resultado = (condicion)?valor1:valor2;
		// (condicion)?  sentenciaTrue : sentenciaFalse
		
		mayor = (num1>num2) ? num1 : num2;
		menor = (num1<num2) ? num1 : num2;
		
		
		System.out.println("el mayor de num1 y num2: "+ mayor);
		System.out.println("el menor de num1 y num2: "+ menor);
		
		
		System.out.println("********************************");
		
		if (num1 > num2 ) {
			System.out.println("num1 es mayor que num2");
		}else {
			System.out.println("num2 es mayor que num1");
		}
		
		String salida = (num1>num2)?"num1 es mayor que num2":"num2 es mayor que num1";
		System.out.println(salida);
		
		System.out.println((num1>num2)?"num1 es mayor que num2":"num2 es mayor que num1");
		
		System.out.println("##########################################");
		

		
		System.out.println("##########################################");
		
		int x = 2;
		int y = 3;
		int z = 3;
		
		//boolean b=(x>y)?x++==y:y==z++;
		
		boolean b;
		if (x>y) {
			b = x++==y;
		} else {
			b = y==z++;
		}
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
		System.out.println("b: "+b);
		
		System.out.println("#######################################");
		
		// Usuario introduce un valor por pantalla entre 0 y 100. Validarlo.
		
		Scanner entrada_escaner = new Scanner(System.in);
		System.out.println("Ingrese un numero entre 0 y 100");
		int dato_entrada = entrada_escaner.nextInt();
		
		if ((dato_entrada>=0)&&(dato_entrada<=100)) {
			System.out.println("formato correcto");
		}else {
			System.out.println("formato incorrecto");
		}
		
		// && = y
		// || = o
		
		System.out.println(((dato_entrada>=0)&&(dato_entrada<=100))?"formato correcto":"formato incorrecto");
		System.out.println("######################################");
		
	}
	
	
	

}
