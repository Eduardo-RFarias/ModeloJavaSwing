package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person extends Model {
	private Long cpf;
	private String name;
	private final List<Vehicle> vehicles;

	public Person(Long cpf, String name) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.vehicles = new ArrayList<>();
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	@Override
	public String toString() {
		return "Person [cpf=" + cpf + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(name, other.name);
	}
}
