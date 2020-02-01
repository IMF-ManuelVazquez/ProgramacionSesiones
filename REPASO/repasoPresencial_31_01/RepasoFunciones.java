package repasoPresencial31_01;

public class RepasoFunciones {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		System.out.println("inicio main");
		
		FuncSumar((num1+num2+5),(5*2),num1*num2);
		//System.out.println(retornoSumar);
		System.out.println("fin main");
	}
	

	// int value1 = ;
	// int value2 = ;
	public static void FuncSumar(int value1) {
		
	}
	
	public static int FuncSumar(int value1, int value2, int value3) {
		System.out.println("inicio funcSumar");
		int sumar=0;
		
		if (value1 > 5) {
			sumar = value2 + value1;
		}else {
			sumar = 0;
		}
		
		System.out.println(sumar);
		System.out.println("fin funcSumar");
		return 33333;
	}

}
