package s21_POO;

public class Ej3Fecha {
	
	private int dia;
	private int mes;
	private int anno;
	
	public Ej3Fecha(int dia, int mes, int anno) {
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

	@Override
	public String toString() {
		
		String mesActual;
		switch (this.mes) {
		case 1:
			mesActual="Enero";
			break;
		case 2:
			mesActual="Febrero";
			break;
		case 3:
			mesActual="Marzo";
			break;
		case 4:
			mesActual="Abril";
			break;
		case 5:
			mesActual="Mayo";
			break;
		case 6:
			mesActual="Junio";
			break;
		case 7:
			mesActual="Julio";
			break;

		default:
			mesActual="";
			break;
		}
		
		return "Ej3Fecha [dia=" + this.dia + ", mes=" + mesActual + ", anno=" + this.anno + "]";
	}
	
	// Máximo de dias 31 y el máximo de meses 12.
	public void incrementarFecha() {
		this.dia ++;
		
		if (this.dia>31) {
			this.dia=1;
			this.mes++;
		}
		
		if (this.mes>12) {
			this.mes = 1;
			this.anno++;
		}
		
	}
	
	
	

}
