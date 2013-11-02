//package de.shop.artikelverwaltung.domain;
//
//import java.io.Serializable;
//import java.util.List;
//
//
//import  de.shop.artikelverwaltung.domain.Artikel;
//
//public class Artikel implements Serializable{
//
//	private static final long serialVersionUID = 8617524985708151267L;
//
//	// Kein plan wo oder wie die artikel gespeichert werden -.-??
//	// untere methoden nicht fertig
//	
//	public Artikel findArtikelbyID(Long Id) {		
//		
//				
//		return null;
//				
//		
//		
//	}
//	
//	public List<Artikel> findArtikelbyIDs(List<Long> Id) {		
//		
//		
//		return null;
//				
//		
//		
//	}
//	
//	
//	public  List<Artikel> findArtikelbyBezeichung( String bezeichnung){
//		
//		
//		return null;	
//		
//		
//		
//	}
//	
//	public  List<Artikel> findArtikelbyPreis(double preis){
//		
//		
//		return null;	
//		
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}


package de.shop.artikelverwaltung.domain;

import java.io.Serializable;
import java.net.URI;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Artikel implements Serializable {
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public Artikel(Long id, String name, Long einzelPrice) {
		super();
		this.id = id;
		this.name = name;
		this.einzelPrice = einzelPrice;
	}
		
	public Artikel() { 	};
	
	
	private static final long serialVersionUID = 1618359234119003714L;
	
	private Long id;
	private String name;
	private Long einzelPrice;
	private URI artikelUri;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEinzelPrice() {
		return einzelPrice;
	}

	public void setEinzelPrice(Long einzelPrice) {
		this.einzelPrice = einzelPrice;
	}

	public URI getArtikelUri() {
		return artikelUri;
	}

	public void setArtikelUri(URI artikelUri) {
		this.artikelUri = artikelUri;
	}

	@Override
	public String toString() {
		return "Artikel [id=" + id + ", name=" + name + ", einzelPrice="
				+ einzelPrice + "]";
	}
		
}
