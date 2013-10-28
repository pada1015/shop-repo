package de.shop.kundenverwaltung.domain;

public class Main {

	public static void main(String[] args) {
		
		
		Kunde k1 = new Kunde("Alpha", "Beta", 1000, 36, true);
		
		String s = "";
		s = k1.getId() + "  " +  k1.getVorname() + " " + k1.getNachname() + " - " + k1.getAlter();
		
		System.out.println(s);


	}

}
