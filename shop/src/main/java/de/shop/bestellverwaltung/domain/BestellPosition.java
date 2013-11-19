package de.shop.bestellverwaltung.domain;

import java.io.Serializable;
import java.net.URI;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import de.shop.artikelverwaltung.domain.Artikel;

@XmlRootElement
public class BestellPosition implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private long menge;
	
	@XmlTransient
	private Artikel artikel;

	private URI artikelUri;

	public long getMenge() {
		return menge;
	}

	public void setMenge(long menge) {
		this.menge = menge;
	}
	
	public Artikel getArtikel() {
		return artikel;
	}
	
	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}

	public URI getArtikelUri() {
		return artikelUri;
	}

	public void setArtikelUri(URI artikelUri) {
		this.artikelUri = artikelUri;
	}
	
	
	
	

}
