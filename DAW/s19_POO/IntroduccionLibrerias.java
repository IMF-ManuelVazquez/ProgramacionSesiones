package s19_POO;

import org.joda.time.DateTime;

public class IntroduccionLibrerias {

	public static void main(String[] args) {
		
		  DateTime dt = new DateTime();
		  System.out.println("dia de la semana: "+ dt.getDayOfWeek());
		  System.out.println("dia del a�o: "+dt.getDayOfMonth());
		  System.out.println("mes del a�o: "+ dt.getMonthOfYear());
		  System.out.println("a�o: "+dt.getYear());

	}

}
