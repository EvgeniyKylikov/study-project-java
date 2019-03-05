package project.kylikov.taxi.beans;

import java.io.Serializable;

import project.kylikov.taxi.enums.TypeAuto;

/**
 * @author Evgeniy
 * 
 * The Class PassangerCar
 */
public class PassangerCar extends Car implements Serializable {

	private static final long serialVersionUID = -3867216418853956638L;
	protected long id;
	protected String model;
	protected double fuelConsumption;
	protected int price;
	protected int maxSpeed;
	protected TypeAuto typeAuto;

	public PassangerCar() {
		super();
	}

	public PassangerCar(long id, String model, TypeAuto typeAuto, double fuelConsumption, int price, int maxSpeed) {
		super();
		this.id = id;
		this.model = model;
		this.fuelConsumption = fuelConsumption;
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.typeAuto = typeAuto;
	}

	@Override
	public String toString() {
		return "PassangerCar [id=" + id + ", model=" + model + ", fuelConsumption=" + fuelConsumption + ", price="
				+ price + ", maxSpeed=" + maxSpeed + ", typeAuto=" + typeAuto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(fuelConsumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + maxSpeed;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + ((typeAuto == null) ? 0 : typeAuto.hashCode());
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
		PassangerCar other = (PassangerCar) obj;
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
		if (price != other.price)
			return false;
		if (typeAuto != other.typeAuto)
			return false;
		return true;
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

	@Override
	public void move() {

	}

	@Override
	public void exploite() {

	}

	@Override
	public void transport() {

	}
}
