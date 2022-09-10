package model;

import java.util.Objects;

public abstract class Vehicle extends Model {
	private String plate;
	private String model;
	private String brand;

	public Vehicle(String plate, String model, String brand) {
		super();
		this.plate = plate;
		this.model = model;
		this.brand = brand;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj) || (getClass() != obj.getClass()))
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(model, other.model)
				&& Objects.equals(plate, other.plate);
	}
}
