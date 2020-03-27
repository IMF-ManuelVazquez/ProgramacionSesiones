package dalwin;

public class ColorCalculadoMain {

	public static void main(String[] args) {
		System.out.println("ejemplos de como hacer 2 tipos de calculadoras");
		System.out.println("");
		System.out.println("Primera, la calculadora simple");
		System.out.println("ColorCalculadora ejemplo = new ColorCalculadora(num1, num2);");
		System.out.println("");
		System.out.println("Segunda, la calculadora multiColor");
		System.out.println("ColorCalculadora ejemplo2 = new ColorCalculadora(atras, estado, num1, num2);");
		System.out.println("");
		System.out.println("en el primer ejemplo indicamos 2 numeros num1 y num2");
		ColorCalculadora calc = new ColorCalculadora(12, 12); //no tiene estilo
		System.out.println("indicamos que queremos sumarlo y saldra por pantalla");
		System.out.println(calc.sumando());  //sumamos
		
		ColorCalculadora calc2 = new ColorCalculadora(12, 12); //no tiene estilo
		System.out.println("indicamos que queremos restarlo y saldra por pantalla");
		System.out.println(calc2.restando()); //restamos
		
		System.out.println("en el tercer ejemplo indicamos el color del fondo, color de letra, num1 y num2");
		
		ColorCalculadora estilos = new ColorCalculadora(ColorCalculadora.ANSI_GREEN_BACKGROUND ,ColorCalculadora.ANSI_RED, 12, 12); //calculadora con estilos
		System.out.println(estilos.sumando()); //sumamos
		
		ColorCalculadora estilos2 = new ColorCalculadora(ColorCalculadora.ANSI_BLACK_BACKGROUND ,ColorCalculadora.ANSI_RED, 12, 12); //calculadora con estilos
		System.out.println(estilos2.restando());//restamos
		
		ColorCalculadora estilos3 = new ColorCalculadora(ColorCalculadora.ANSI_RED_BACKGROUND ,ColorCalculadora.ANSI_GREEN, 12, 12); //calculadora con estilos
		System.out.println(estilos3.div());//dividimos
		
		ColorCalculadora estilos4 = new ColorCalculadora(ColorCalculadora.ANSI_WHITE_BACKGROUND ,ColorCalculadora.ANSI_BLUE, 12, 12); //calculadora con estilos
		System.out.println(estilos4.multi());//multiplicamos

	}

}
