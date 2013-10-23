package de.shop.kundenverwaltung.domain;

public class Kunde {
	
	public Kunde(String vorname, String nachname, int id, int alter,
			boolean newsletter) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.id = id;
		this.alter = alter;
		this.newsletter = newsletter;
	}
	private String vorname;
	private String nachname;
	private int id;
	private int alter;
	private boolean newsletter;
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public boolean isNewsletter() {
		return newsletter;
	}
	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}
	
}
