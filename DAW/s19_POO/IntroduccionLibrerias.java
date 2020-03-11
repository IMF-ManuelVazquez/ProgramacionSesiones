package s19_POO;

import org.joda.time.DateTime;

public class IntroduccionLibrerias {

	public static void main(String[] args) {
		
		  DateTime dt = new DateTime();
		  System.out.println("dia de la semana: "+ dt.getDayOfWeek());
		  System.out.println("dia del año: "+dt.getDayOfMonth());
		  System.out.println("mes del año: "+ dt.getMonthOfYear());
		  System.out.println("año: "+dt.getYear());

	}

}
