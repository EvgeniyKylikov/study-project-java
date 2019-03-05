package project.kylikov.taxi.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import project.kylikov.taxi.exceptions.EmptyParkException;

/**
 * @author Evgeniy
 * 
 * The Class AutoPark
 */
public class AutoPark implements Serializable {

	private static final long serialVersionUID = 8114074650555853306L;
	private int id;
	private String lokation;
	private int numberOfCars;
	private List<PassangerCar> passangerCars = new ArrayList<PassangerCar>();

	public AutoPark(int id, String lokation, int numberOfCars, List<PassangerCar> passangerCars) {
		super();
		this.id = id;
		this.lokation = lokation;
		this.numberOfCars = numberOfCars;
		this.passangerCars = passangerCars;
	}

	public AutoPark() {
		super();
	}

	@Override
	public String toString() {
		return "AutoPark [id=" + id + ", lokation=" + lokation + ", numberOfCars=" + numberOfCars + ", passangerCars="
				+ passangerCars + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((lokation == null) ? 0 : lokation.hashCode());
		result = prime * result + numberOfCars;
		result = prime * result + ((passangerCars == null) ? 0 : passangerCars.hashCode());
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
		AutoPark other = (AutoPark) obj;
		if (id != other.id)
			return false;
		if (lokation == null) {
			if (other.lokation != null)
				return false;
		} else if (!lokation.equals(other.lokation))
			return false;
		if (numberOfCars != other.numberOfCars)
			return false;
		if (passangerCars == null) {
			if (other.passangerCars != null)
				return false;
		} else if (!passangerCars.equals(other.passangerCars))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLokation() {
		return lokation;
	}

	public void setLokation(String lokation) {
		this.lokation = lokation;
	}

	public int getNumberOfCars() {
		return numberOfCars;
	}

	public void setNumberOfCars(int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}

	public List<PassangerCar> getPassangerCars() {
		return passangerCars;
	}

	public void setPassangerCars(List<PassangerCar> passangerCars) {
		this.passangerCars = passangerCars;
	}

	public void createPark(List<PassangerCar> passangerCars) throws EmptyParkException {
		if (passangerCars.isEmpty()) {
			throw new EmptyParkException();
		} else {

		}
	}
}