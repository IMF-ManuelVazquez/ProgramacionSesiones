package s9_EStructurasDeControl;

public class FuncionesYProcedimientos {

	public static void main(String[] args) {
		
		int value1 = 55;
		int value2 = 66;
		
		System.out.println("codigo de main "+value1);
		funcion1(value1,value2);
		System.out.println("instruccion1_main "+value1);
		funcion2(value1);
		System.out.println("instruccion2_main "+value1);
		
		//funcion3();
		// Quiero sacar por pantalla el valor de valorSalida de la funcion3
		int value_captura = funcion3();
		System.out.println("valor captura en el main desde la funcion3 es: "+ value_captura);
		
		
		System.out.println("instruccion3_main "+value1);
		funcion2(value1);
		System.out.println("instruccion4_main "+value1);
		funcion1(value1,value2);
		
		// que funciones tenemos
		funcion1(55, 66);
		funcion2(22);
		System.out.println(funcion3());

	}
	
	// Funcion1 : de prueba saca por pantalla 4 lineas.
	// EN la función unicamente se pueden usar las variables definicas dentro de dicha función o las variables que se le pasen como argumente de entrada.
	public static void funcion1(int id, int id2) {
		
		int variable_func = 666;
		System.out.println("instruccion1_funcion1 "+id);
		System.out.println("instruccion2_funcion1 "+id2);
		System.out.println("instruccion3_funcion1 "+id);
		System.out.println("instruccion4_funcion1 "+variable_func);
		
		funcion2(22);
	}
	
	
	// Funcion2 : de prueba saca por pantalla 4 lineas.
	public static void funcion2(int value) {
		
		System.out.println("instruccion1_funcion2"+ value);
		System.out.println("instruccion2_funcion2"+ value);
		System.out.println("instruccion3_funcion2"+ value);
		System.out.println("instruccion4_funcion2"+ value);
		
		funcion3();
		
	}
	
	// Funcion3 : de prueba saca por pantalla 4 lineas.
	public static int funcion3() {
		
		int valorSalida = 1988;
		
		System.out.println("instruccion1_funcion3");
		System.out.println("instruccion2_funcion3");
		System.out.println("instruccion3_funcion3");
		System.out.println("instruccion4_funcion3");
		
		System.out.println("valor de salida hacia el main es: "+valorSalida);
		
		return valorSalida;

	}

}
