package shop.kundenverwaltung.kunde;

import javax.persistence.Entity;

@Entity
public class Adresse {
	private String stadt;
	private String plz;
	private String strasse;
	private int hausnummer;
}