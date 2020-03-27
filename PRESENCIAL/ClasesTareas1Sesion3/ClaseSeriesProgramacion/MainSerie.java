package casa;

public class MainSerie {

	public static void main(String[] args) {

		
		Serie elite = new Serie();
		Serie juegoDeTronos = new Serie("Juego de Tronos", "George RR Martin", 45, "Fantasia", 8, "HBO");
		
		elite.setNombre("Elite");
		elite.setDirector("Daniel de la Orden");
		elite.setDuracion(45);
		elite.setGenero("Drama");
		elite.setNum_temporadas(3);
		elite.setPlat_emision("Netflix");
		
		System.out.println(juegoDeTronos.toString());
		System.out.println(elite.toString());
		elite.mismoDirector(juegoDeTronos.getDirector());
		elite.seriesMasUnaTemporada();
		juegoDeTronos.seriesMasUnaTemporada();
		
	}

}
