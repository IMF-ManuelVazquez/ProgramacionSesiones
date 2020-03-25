package s21_POO;

public class Ej4Reloj {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Ej4Reloj() {
		super();
	}

	public Ej4Reloj(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String dameHora() {
		
		String out = this.hora+":"+this.minuto+":"+this.segundo;  // concatenar.
		return out;
		
	}
	
	public String dameHora(String tipo) {   // Tipo: "12hrs" && "24hrs"
		String out;
		if (tipo.equals("24hrs")) {
			
			out = this.hora+":"+this.minuto+":"+this.segundo;
			
		}else if (tipo.equals("12hrs")){
			
			if (this.hora>=12) {
				out = (this.hora-12)+":"+this.minuto+":"+this.segundo+ " PM";
			}else {
				out = this.hora+":"+this.minuto+":"+this.segundo+" AM";
			}
			
		}else {
			out = "formato solicitado incorrecto";
		}
		return out;
	}
	
	public void incrementarSegundo() {
		this.segundo++;
		if (this.segundo>59) {
			this.segundo=0;
			this.minuto++;
		}
		
		if (this.minuto>59) {
			this.minuto=0;
			this.hora++;
		}
		
		if (this.hora>23) {
			this.hora=0;
		}
		
	}
	
	
}
