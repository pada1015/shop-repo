package de.shop.artikelverwaltung.domain;

import java.io.Serializable;
import java.net.URI;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Artikel implements Serializable {
	
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((artikelUri == null) ? 0 : artikelUri.hashCode());
		result = prime * result
				+ ((einzelPrice == null) ? 0 : einzelPrice.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikel other = (Artikel) obj;
		if (artikelUri == null) {
			if (other.artikelUri != null)
				return false;
		} else if (!artikelUri.equals(other.artikelUri))
			return false;
		if (einzelPrice == null) {
			if (other.einzelPrice != null)
				return false;
		} else if (!einzelPrice.equals(other.einzelPrice))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Artikel [id=" + id + ", name=" + name + ", einzelPrice="
				+ einzelPrice + ", artikelUri=" + artikelUri + "]";
	}
	

}
