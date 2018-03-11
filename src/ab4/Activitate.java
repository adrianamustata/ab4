package ab4;

import java.util.List;

public class Activitate {
	
	private String numeActivitate;
	private float pret;
	
	public Activitate(String numeActivitate, float pret) {
		this.numeActivitate = numeActivitate;
		this.pret = pret;
	}
	
	public void setNumeActivitate(String numeActivitate) {
		this.numeActivitate = numeActivitate;
	}
	
	public String getNumeActivitate() {
		return this.numeActivitate;
	}
	
	public void setPret(float pret) {
		this.pret = pret;
	}
	
	public float getPret() {
		return this.pret;
	}

	//Cauta numele activitatii care are pretul minim egal cu pretMin si in cazul in care sunt mai multe cu acelasi pret le adauga intr-o lista 
	//pe care o returneaza
	public static List<Activitate> findActivitateByPretMin(List<Activitate> lista, float pretMin){
		for(Activitate a : lista) {
			if(a.getPret() == pretMin) {
				lista.add(a);
			}
		}
		return lista;
		
	}
}
