
package shop.kundenverwaltung.kunde;

import java.util.Date;
import java.util.List;

public class Kunde {
	private Integer id;
	private String vorname;
	private String nachname;
	private String email;
	private Adresse adresse;
	private Date seit;
	private int rabatt;
	private boolean newsletter;
	private Familienstand familienstand;
	private Geschlecht geschlecht;
	private List<String> hobbies;
	
}