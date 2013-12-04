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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((firmenname == null) ? 0 : firmenname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Firmenkunde other = (Firmenkunde) obj;
		if (firmenname == null) {
			if (other.firmenname != null)
				return false;
		} else if (!firmenname.equals(other.firmenname))
			return false;
		return true;
	}
	@Override
	//TODO geerbte ToString erweitern.
	
	public String toString() {
		return "Firmenkunde [" + super.toString() + " firmenname=" + firmenname + "]";
	}
}