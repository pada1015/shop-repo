package de.shop.artikelverwaltung.domain;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement; // kp

@XmlRootElement
public class Artikel implements Serializable {
	
		private static final long serialVersionUID = -1102858566086745226L;
		
		private Long id;
		private String bezeichnung;
		private double preis;
		private Date erstellungsdatum;
		private boolean ausgesondert;
		
		public Artikel(Long id, String bezeichnung, double preis, Date erstellungsdatum) {
			super();
			this.id = id;
			this.bezeichnung = bezeichnung;
			this.preis = preis;
			this.erstellungsdatum = erstellungsdatum;
			this.ausgesondert = false;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBezeichnung() {
			return bezeichnung;
		}

		public void setBezeichnung(String bezeichnung) {
			this.bezeichnung = bezeichnung;
		}

		public double getPreis() {
			return preis;
		}

		public void setPreis(double preis) {
			this.preis = preis;
		}

		public Date getErstellungsdatum() {
			return erstellungsdatum;
		}

		public void setErstellungsdatum(Date erstellungsdatum) {
			this.erstellungsdatum = erstellungsdatum;
		}

		public boolean isAusgesondert() {
			return ausgesondert;
		}

		public void setAusgesondert(boolean ausgesondert) {
			this.ausgesondert = ausgesondert;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (ausgesondert ? 1231 : 1237);
			result = prime * result
					+ ((bezeichnung == null) ? 0 : bezeichnung.hashCode());
			result = prime
					* result
					+ ((erstellungsdatum == null) ? 0 : erstellungsdatum
							.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			long temp;
			temp = Double.doubleToLongBits(preis);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			if (ausgesondert != other.ausgesondert)
				return false;
			if (bezeichnung == null) {
				if (other.bezeichnung != null)
					return false;
			} else if (!bezeichnung.equals(other.bezeichnung))
				return false;
			if (erstellungsdatum == null) {
				if (other.erstellungsdatum != null)
					return false;
			} else if (!erstellungsdatum.equals(other.erstellungsdatum))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (Double.doubleToLongBits(preis) != Double
					.doubleToLongBits(other.preis))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Artikel [id=" + id + ", bezeichnung=" + bezeichnung
					+ ", preis=" + preis + ", erstellungsdatum="
					+ erstellungsdatum + ", ausgesondert=" + ausgesondert + "]";
		}
		
		
	
	

}
