package bean;

import java.sql.Timestamp;

public class Tunti {

	private int id;
	private double tuntimaara;
	private String toimenpide, kuvaus;
	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	private Timestamp pvm;

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTuntimaara() {
		return tuntimaara;
	}

	public void setTuntimaara(double tuntimaara) {
		this.tuntimaara = tuntimaara;
	}

	public String getToimenpide() {
		return toimenpide;
	}

	public void setToimenpide(String toimenpide) {
		this.toimenpide = toimenpide;
	}

	public Timestamp getPvm() {
		return pvm;
	}

	public void setPvm(Timestamp pvm) {
		this.pvm = pvm;
	}

}
