package model;

public class Car extends Vehicle {
	private int horsePower;

	public Car(String plate, String model, String brand, int horsePower) {
		super(plate, model, brand);
		this.horsePower = horsePower;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return super.toString() + "=> Car [horsePower=" + horsePower + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj) || (getClass() != obj.getClass()))
			return false;
		Car other = (Car) obj;
		return horsePower == other.horsePower;
	}
}
