package boletin5;

public class Ej8JuegoAdivinar {
	
	private int numeroObjetivo;
	private int numeroIntentos;
	
	
	public Ej8JuegoAdivinar() {
		this.numeroObjetivo = (int)(Math.random()*(100+1)); 
		System.out.println("Numero Objetivo determinado de forma aleatoria: "+numeroObjetivo);
	}

	public Ej8JuegoAdivinar(int numeroObjetivo) {
		this.numeroObjetivo = numeroObjetivo;
	}
	
	@Override
	public String toString() {
		return "Ej8JuegoAdivinar [numeroObjetivo=" + numeroObjetivo + ", numeroIntentos=" + numeroIntentos + "]";
	}

	public String nuevoIntento(int num) {
		if (num>numeroObjetivo) {
			numeroIntentos++;
			return "MAYOR";
		}else if (num<numeroObjetivo) {
			numeroIntentos++;
			return "MENOR";
		}else {
			return "ACERTASTES";
		}
	}
	
	public void nuevaPartida() {
		this.numeroObjetivo = (int)(Math.random()*(100+1)); 
		System.out.println("Numero Objetivo recalculado de forma aleatoria: "+numeroObjetivo);
		resetNumeroIntentos();
	}
	
	public void nuevaPartida(int numeroObjetivo) {
		this.numeroObjetivo = numeroObjetivo;
		resetNumeroIntentos();
	}
	
	public static void resetNumeroIntentos() {
		//this.numeroIntentos=0;
		System.out.println("Reset Numero de intentos");
	}

}
