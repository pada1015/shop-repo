package de.shop.kundenverwaltung.domain;

import javax.persistence.Entity;

@Entity
public class Adresse {
	
	private String stadt;
	private String plz;
	private String strasse;
	private int hausnummer;
	
	public Adresse(String stadt, String plz, String strasse, int hausnummer) {
		super();
		this.stadt = stadt;
		this.plz = plz;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
	}
	

	//Default Konstruktor
	public Adresse() {	}



	public String getStadt() {
		return stadt;
	}
	
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
}

