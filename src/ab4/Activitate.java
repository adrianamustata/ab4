package ab4;

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

}
