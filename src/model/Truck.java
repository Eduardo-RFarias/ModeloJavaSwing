package model;

public class Truck extends Vehicle {
	private int numberOfTrailers;

	public Truck(String plate, String model, String brand, int numberOfTrailers) {
		super(plate, model, brand);
		this.numberOfTrailers = numberOfTrailers;
	}

	public int getNumberOfTrailers() {
		return numberOfTrailers;
	}

	public void setNumberOfTrailers(int numberOfTrailers) {
		this.numberOfTrailers = numberOfTrailers;
	}

	@Override
	public String toString() {
		return super.toString() + "=> Truck [numberOfTrailers=" + numberOfTrailers + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj) || (getClass() != obj.getClass()))
			return false;
		Truck other = (Truck) obj;
		return numberOfTrailers == other.numberOfTrailers;
	}
}
