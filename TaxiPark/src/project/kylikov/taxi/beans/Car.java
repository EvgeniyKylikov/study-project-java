package project.kylikov.taxi.beans;

import java.util.List;

import project.kylikov.taxi.enums.TypeAuto;
import project.kylikov.taxi.interfaces.Exploitable;
import project.kylikov.taxi.interfaces.Moveable;
import project.kylikov.taxi.interfaces.Transportable;

/**
 * @author Evgeniy
 * 
 * The Class Car
 */
public abstract class Car implements Moveable, Exploitable, Transportable {
	protected long id;
	protected String model;
	protected double fuelConsumption;
	protected int price;
	protected int maxSpeed;
	protected TypeAuto typeAuto;
	protected List<PassangerCar> passangerCars;

	public abstract void exploite();

	public abstract void move();

	public abstract void transport();

	public Car() {
		super();
	}

	public Car(long id, String model, double fuelConsumption, int price, int maxSpeed, TypeAuto typeAuto,
			List<PassangerCar> passangerCars) {
		super();
		this.id = id;
		this.model = model;
		this.fuelConsumption = fuelConsumption;
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.typeAuto = typeAuto;
		this.passangerCars = passangerCars;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public TypeAuto getTypeAuto() {
		return typeAuto;
	}

	public void setTypeAuto(TypeAuto typeAuto) {
		this.typeAuto = typeAuto;
	}

	public List<PassangerCar> getPassangerCars() {
		return passangerCars;
	}

	public void setPassangerCars(List<PassangerCar> passangerCars) {
		this.passangerCars = passangerCars;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(fuelConsumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + maxSpeed;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((passangerCars == null) ? 0 : passangerCars.hashCode());
		result = prime * result + price;
		result = prime * result + ((typeAuto == null) ? 0 : typeAuto.hashCode());
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
		Car other = (Car) obj;
		if (Double.doubleToLongBits(fuelConsumption) != Double.doubleToLongBits(other.fuelConsumption))
			return false;
		if (id != other.id)
			return false;
		if (maxSpeed != other.maxSpeed)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (passangerCars == null) {
			if (other.passangerCars != null)
				return false;
		} else if (!passangerCars.equals(other.passangerCars))
			return false;
		if (price != other.price)
			return false;
		if (typeAuto != other.typeAuto)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", fuelConsumption=" + fuelConsumption + ", price=" + price
				+ ", maxSpeed=" + maxSpeed + ", typeAuto=" + typeAuto + ", passangerCars=" + passangerCars + "]";
	}

}