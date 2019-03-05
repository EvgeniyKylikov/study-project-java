package project.kylikov.taxi.beans;

import java.util.List;

/**
 * @author Evgeniy
 * 
 * The Class TaxiPark
 */
public class TaxiPark {
	protected long id;
	protected String lokation;
	protected List<AutoPark> autoParks;

	public TaxiPark() {
	}

	public TaxiPark(long id, String lokation, List<AutoPark> autoParks) {
		super();
		this.id = id;
		this.lokation = lokation;
		this.autoParks = autoParks;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLokation() {
		return lokation;
	}

	public void setLokation(String lokation) {
		this.lokation = lokation;
	}

	public List<AutoPark> getAutoParks() {
		return autoParks;
	}

	public void setAutoParks(List<AutoPark> autoParks) {
		this.autoParks = autoParks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autoParks == null) ? 0 : autoParks.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lokation == null) ? 0 : lokation.hashCode());
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
		TaxiPark other = (TaxiPark) obj;
		if (autoParks == null) {
			if (other.autoParks != null)
				return false;
		} else if (!autoParks.equals(other.autoParks))
			return false;
		if (id != other.id)
			return false;
		if (lokation == null) {
			if (other.lokation != null)
				return false;
		} else if (!lokation.equals(other.lokation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TaxiPark [id=" + id + ", lokation=" + lokation + ", autoParks=" + autoParks + "]";
	}

}
