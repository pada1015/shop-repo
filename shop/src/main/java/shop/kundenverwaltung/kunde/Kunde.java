
package shop.kundenverwaltung.kunde;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Kunde {
	/**
	 * @param id
	 * @param vorname
	 * @param nachname
	 * @param email
	 * @param adresse
	 * @param seit
	 * @param rabatt
	 * @param newsletter
	 * @param familienstand
	 * @param geschlecht
	 * @param hobbies
	 * @param bemerkungen
	 */
	
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
	public Kunde(Integer id, String vorname, String nachname, String email,
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





	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}





	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}





	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return vorname;
	}





	/**
	 * @param vorname the vorname to set
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}





	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return nachname;
	}





	/**
	 * @param nachname the nachname to set
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}





	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}





	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}





	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}





	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}





	/**
	 * @return the seit
	 */
	public Date getSeit() {
		return seit;
	}





	/**
	 * @param seit the seit to set
	 */
	public void setSeit(Date seit) {
		this.seit = seit;
	}





	/**
	 * @return the rabatt
	 */
	public int getRabatt() {
		return rabatt;
	}





	/**
	 * @param rabatt the rabatt to set
	 */
	public void setRabatt(int rabatt) {
		this.rabatt = rabatt;
	}





	/**
	 * @return the newsletter
	 */
	public boolean isNewsletter() {
		return newsletter;
	}





	/**
	 * @param newsletter the newsletter to set
	 */
	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}





	/**
	 * @return the familienstand
	 */
	public Familienstand getFamilienstand() {
		return familienstand;
	}





	/**
	 * @param familienstand the familienstand to set
	 */
	public void setFamilienstand(Familienstand familienstand) {
		this.familienstand = familienstand;
	}





	/**
	 * @return the geschlecht
	 */
	public Geschlecht getGeschlecht() {
		return geschlecht;
	}





	/**
	 * @param geschlecht the geschlecht to set
	 */
	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}





	/**
	 * @return the hobbies
	 */
	public List<String> getHobbies() {
		return hobbies;
	}





	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}





	/**
	 * @return the bemerkungen
	 */
	public String getBemerkungen() {
		return bemerkungen;
	}





	/**
	 * @param bemerkungen the bemerkungen to set
	 */
	public void setBemerkungen(String bemerkungen) {
		this.bemerkungen = bemerkungen;
	}
	
	
}