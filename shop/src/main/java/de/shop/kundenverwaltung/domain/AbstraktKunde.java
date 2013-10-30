
package de.shop.kundenverwaltung.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement 
@Entity
public abstract class AbstraktKunde {
		//FIXME
	//Attribute der Klasse Kunde
	@Id
	@GeneratedValue
	private Integer id;
	private String vorname;
	private String nachname;
	private String email;
	@ManyToOne
	private Adresse adresse;
	private Date seit;
	private int rabatt;
	private boolean newsletter;
	@Enumerated
	private Familienstand familienstand;
	@Enumerated
	private Geschlecht geschlecht;
	private List<String> hobbies;
	private String bemerkungen;	
	
	// Der Konstruktor der Klasse Kunde
	public AbstraktKunde(Integer id, String vorname, String nachname, String email,
			Adresse adresse, Date seit, int rabatt, boolean newsletter,
			Familienstand familienstand, Geschlecht geschlecht,
			List<String> hobbies, String bemerkungen) {
		super();
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.adresse = adresse;
		this.seit = seit;
		this.rabatt = rabatt;
		this.newsletter = newsletter;
		this.familienstand = familienstand;
		this.geschlecht = geschlecht;
		this.hobbies = hobbies;
		this.bemerkungen = bemerkungen;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Date getSeit() {
		return seit;
	}

	public void setSeit(Date seit) {
		this.seit = seit;
	}

	public int getRabatt() {
		return rabatt;
	}

	public void setRabatt(int rabatt) {
		this.rabatt = rabatt;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}

	public Familienstand getFamilienstand() {
		return familienstand;
	}

	public void setFamilienstand(Familienstand familienstand) {
		this.familienstand = familienstand;
	}

	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getBemerkungen() {
		return bemerkungen;
	}

	public void setBemerkungen(String bemerkungen) {
		this.bemerkungen = bemerkungen;
	}
	
	public boolean sucheNachKunden(List<AbstraktKunde> kundenListe, AbstraktKunde kunde) {
		
		boolean tmp = false;
		
		for(AbstraktKunde k : kundenListe) {
			if(kundenListe != null && kunde != null && k.equals(kunde) == true) {
				tmp = true;
				break;
			}
		}
		return tmp;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstraktKunde other = (AbstraktKunde) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (bemerkungen == null) {
			if (other.bemerkungen != null)
				return false;
		} else if (!bemerkungen.equals(other.bemerkungen))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (familienstand != other.familienstand)
			return false;
		if (geschlecht != other.geschlecht)
			return false;
		if (hobbies == null) {
			if (other.hobbies != null)
				return false;
		} else if (!hobbies.equals(other.hobbies))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (newsletter != other.newsletter)
			return false;
		if (rabatt != other.rabatt)
			return false;
		if (seit == null) {
			if (other.seit != null)
				return false;
		} else if (!seit.equals(other.seit))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result
				+ ((bemerkungen == null) ? 0 : bemerkungen.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((familienstand == null) ? 0 : familienstand.hashCode());
		result = prime * result
				+ ((geschlecht == null) ? 0 : geschlecht.hashCode());
		result = prime * result + ((hobbies == null) ? 0 : hobbies.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + (newsletter ? 1231 : 1237);
		result = prime * result + rabatt;
		result = prime * result + ((seit == null) ? 0 : seit.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		String s = null;
		//TODO Zum Vollenden
		s = id + " " + vorname + " " + nachname + " Geschlecht: " + geschlecht + "\n" + email +
		"\nAdresse:\n" + adresse.getStrasse() + " " + adresse.getHausnummer() + "\n" +
		adresse.getPlz() + " " + adresse.getStadt() + "\n" + 		"Kunde seit: " + seit + "\nRabatt: " + rabatt + "Von Newsletter abonniert: " + newsletter + 
		" Familienstand: " + familienstand + "\nHobbies: " + "\nBemerkungen: " + bemerkungen;
		
		return s;
	}
	
	
} 