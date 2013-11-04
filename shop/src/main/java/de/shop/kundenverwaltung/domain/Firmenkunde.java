package de.shop.kundenverwaltung.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Firmenkunde extends AbstractKunde {
	private static final long serialVersionUID = 6258156986876418100L;
	private String firmenname;
	
	public String getFirmenname() {
		return firmenname;
	}
	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}
	
	//TODO geerbte ToString erweitern.
}