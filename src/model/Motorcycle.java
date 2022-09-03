package model;

import java.util.Objects;

public class Motorcycle extends Vehicle {
	private String color;

	public Motorcycle(String plate, String model, String brand, String color) {
		super(plate, model, brand);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + "=> Motorcycle [color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return Objects.equals(color, other.color);
	}
}
