package ab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Activitate> listaActivitatiBucuresti = new ArrayList<>();
		Activitate a1 = new Activitate("Club", 100);
		listaActivitatiBucuresti.add(a1);
		
		ArrayList<Activitate> listaActivitatiSibiu = new ArrayList<>();
		Activitate a2 = new Activitate("Vizite", 15);
		Activitate a3 = new Activitate("Plimbare atv", 60);
		listaActivitatiSibiu.add(a2);
		listaActivitatiSibiu.add(a3);
		
		ArrayList<Activitate> listaActivitatiConstanta = new ArrayList<>();
		Activitate a4 = new Activitate("Plimbare cu barca", 30);
		Activitate a5 = new Activitate("Parc distractii", 80);
		listaActivitatiConstanta.add(a4);
		listaActivitatiConstanta.add(a5);
		
		ArrayList<Activitate> listaActivitatiBrasov = new ArrayList<>();
		Activitate a6 = new Activitate("Ski", 100);
		Activitate a7 = new Activitate("Snowmobil", 150);
		listaActivitatiConstanta.add(a6);
		listaActivitatiConstanta.add(a7);
		
		ArrayList<Activitate> listaActivitatiTulcea = new ArrayList<>();
		Activitate a8 = new Activitate("Plimbare cu barca", 10);
		listaActivitatiConstanta.add(a8);
	
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
		
		Destinatie d1 = new Destinatie("Centrul vechi", "Bucuresti", 80, listaActivitatiBucuresti, dateformat.parse(strdate1), dateformat.parse(strdate2));
		Destinatie d2 = new Destinatie("Castelul de lut", "Sibiu", 50, listaActivitatiSibiu, dateformat.parse(strdate3), dateformat.parse(strdate4) );
		Destinatie d3 = new Destinatie("Mamaia", "Constanta", 150, listaActivitatiConstanta, dateformat.parse(strdate5), dateformat.parse(strdate6));
		Destinatie d4 = new Destinatie("Poiana Brasov", "Brasov", 100, listaActivitatiBrasov, dateformat.parse(strdate7), dateformat.parse(strdate8));
		Destinatie d5 = new Destinatie("Delta Dunarii", "Tulcea", 80, listaActivitatiTulcea, dateformat.parse(strdate9), dateformat.parse(strdate10));
		
		ArrayList<Destinatie> destinatii = new ArrayList<>();
		destinatii.add(d1);
		destinatii.add(d2);
		destinatii.add(d3);
		destinatii.add(d4);
		destinatii.add(d4);
		
		TreeNode root = new TreeNode("root");
        TreeNode tara = root.addChild("Romania");
        TreeNode judet1 = tara.addChild("Bucuresti"); // lui romania ii adaugam judetul bucuresti
        	judet1.addChild("Bucuresti");	// la jud bucuresti ii adaugam un copil si anume orasul bucuresti
    	TreeNode judet2 = tara.addChild("Sibiu"); // tarii romania ii adaugam judetul sibiu
    		judet2.addChild("Sibiu");	//caruia ii adaugam si lui copiul orasul sibiu
		TreeNode judet3 = tara.addChild("Constanta");	
			judet3.addChild("Mamaia");
		TreeNode judet4 = tara.addChild("Brasov");	
			judet4.addChild("Poiana Brasov");
		TreeNode judet5 = tara.addChild("Tulcea");	
			judet5.addChild("Delta Dunarii");
		//daca vreau sa mai adaug de ex. comuna la oras mai declar un TreeNode care practic o sa fie orasul
		//si apoi la acest nod ii adaug copii, care vor fi comunele
		//la fel si in cazul satelor

        root.printTree(root); //afisez tot arborele
        
        d1.afiseazaDestinatie();
        //Destinatie.afiseazaActivitate10zile(destinatii); //teoretic merge, practic crapa
	}

}
