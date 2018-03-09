package ab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Activitate> listaActivitati = new ArrayList<>();
		Activitate a1 = new Activitate("Plimbare cu bicicleta", 15);
		Activitate a2 = new Activitate("Inot", 50);
		Activitate a3 = new Activitate("Ski", 100);
		Activitate a4 = new Activitate("Plimbare cu barca", 30);
		listaActivitati.add(a1);
		listaActivitati.add(a2);
		listaActivitati.add(a3);
		listaActivitati.add(a4);
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy");
		String strdate1 = "01-01-2018";
		String strdate2 = "31-12-2018";
		String strdate3 = "01-03-2018";
		String strdate4 = "31-05-2018";
		String strdate5 = "01-05-2018";
		String strdate6 = "01-09-2018";
		String strdate7 = "01-12-2018";
		String strdate8 = "01-03-2019";
		String strdate9 = "01-08-2018";
		String strdate10 = "15-10-2018";
		
		Destinatie d1 = new Destinatie("Centrul vechi", "Bucuresti", 80, listaActivitati, dateformat.parse(strdate1), dateformat.parse(strdate2));
		Destinatie d2 = new Destinatie("Castelul de lut", "Sibiu", 50, listaActivitati, dateformat.parse(strdate3), dateformat.parse(strdate4) );
		Destinatie d3 = new Destinatie("Mamaia", "Constanta", 150, listaActivitati, dateformat.parse(strdate5), dateformat.parse(strdate6));
		Destinatie d4 = new Destinatie("Poiana Brasov", "Brasov", 100, listaActivitati, dateformat.parse(strdate7), dateformat.parse(strdate8));
		Destinatie d5 = new Destinatie("Delta Dunarii", "Tulcea", 80, listaActivitati, dateformat.parse(strdate9), dateformat.parse(strdate10));
	}

}
