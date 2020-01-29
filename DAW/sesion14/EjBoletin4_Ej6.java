package sesion14;

import java.util.Arrays;

// Ej6 del boletin4_Array
public class EjBoletin4_Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] v1 = {11,12,13,14,15,16,17,18,19,10,11,12};
		int[] v2 = {21,22,23,24,25,26,27,28,29,20,21,22};
		int[] v3 = new int[v1.length*2];
		
		System.out.println("tamaño de v1: "+ v1.length);
		System.out.println("tamaño de v2: "+ v2.length);
		System.out.println("tamaño de v3: "+ v3.length);

		int numeroGruposDeTres = v3.length/6;
		System.out.println("numeroGruposDeTres: "+numeroGruposDeTres);
		
		for (int i = 0; i < numeroGruposDeTres; i++) {
			v3[(i*6)+0] = v1[(0*3)+0];
			v3[(i*6)+1] = v1[(0*3)+1];
			v3[(i*6)+2] = v1[(0*3)+2];
			v3[(i*6)+3] = v2[(0*3)+0];
			v3[(i*6)+4] = v2[(0*3)+1];
			v3[(i*6)+5] = v2[(0*3)+2];
		}
		System.out.println("V3: "+Arrays.toString(v3));
		
		for (int i = 0; i < numeroGruposDeTres; i++) {
			for (int j = 0; j < 3; j++) {
				v3[(i*6)+j] = v1[(0*3)+j];
			}
			for (int j = 0; j < 3; j++) {
				v3[(i*6)+3+j] = v2[(0*3)+j];
			}
		}
		System.out.println("V3: "+Arrays.toString(v3));
		
	}

}
