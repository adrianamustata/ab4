package ab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class Destinatie {

	private String nume;
	private String oras;
	private float pretMediu;
	private Date perioadaInceput;
	private Date perioadaSfarsit;
	private static ArrayList<Activitate> listaActivitati;
	
	public Destinatie(String nume, String oras, float pretMediu, ArrayList<Activitate> listaActivitati , 
						Date perioadaInceput, Date perioadaSfarsit){
		
		this.nume = nume;
		this.oras = oras;
		this.pretMediu = pretMediu;
		this.listaActivitati = listaActivitati;
		this.perioadaInceput = perioadaInceput;
		this.perioadaSfarsit = perioadaSfarsit;
		
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public void setOras(String oras) {
		this.oras = oras;
	}
	
	public String getOras() {
		return this.oras;
	}
	
	public void setpretMediu(float pretMediu) {
		this.pretMediu = pretMediu;
	}
	
	public float getPretMediu() {
		return this.pretMediu;
	}
	
	public void setListaActivitati( ArrayList<Activitate> listaActivitati) {
		this.listaActivitati = listaActivitati;
	}
	
	public ArrayList<Activitate> getListaActivitati() {
		return this.listaActivitati;
	}
	
	public void setPerioadaInceput(Date perioadaInceput) {
		this.perioadaInceput = perioadaInceput;
	}
	
	public Date getPerioadaInceput() {
		return this.perioadaInceput;
	}
	
	public void setPerioadaSfarsit(Date perioadaSfarsit) {
		this.perioadaSfarsit = perioadaSfarsit;
	}
	
	public Date getPerioadaSfarsit() {
		return this.perioadaSfarsit;
	}
	
	
	public void afiseazaDestinatie() {
		System.out.println( "Destinatie [nume=" + nume + ", oras=" + oras + ", pretMediu=" + pretMediu + ", perioadaInceput="
				+ perioadaInceput + ", perioadaSfarsit=" + perioadaSfarsit + ", listaActivitati=");
		
		for(Activitate a : listaActivitati) {
			System.out.print(a.getNumeActivitate() +" ");
		}
		System.out.println("]");
	}
	
	public static void afiseazaActivitate10zile(ArrayList<Destinatie> destinatii) {
		for(Destinatie d : destinatii) {
			ArrayList<Activitate> listaAct = d.getListaActivitati();
			
			ArrayList<Float> listaPreturi = new ArrayList<>();
			for(Activitate a : listaActivitati) {
				listaPreturi.add(a.getPret());
			}
			
			Float pretMin = Collections.min(listaPreturi);
		Activitate a =  (Activitate) Activitate.findActivitateByPretMin(listaAct, pretMin);
		System.out.println(a.getNumeActivitate() + "sadsadsa");
		}		
	}
}

