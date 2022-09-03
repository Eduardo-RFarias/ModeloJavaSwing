package model.database;

import java.util.ArrayList;

import model.Person;

public abstract class DatabaseProvider {
	private static final ArrayList<Person> PERSONS = new ArrayList<>();

	private DatabaseProvider() {
		super();
	}

	public static ArrayList<Person> getPersons() {
		return PERSONS;
	}
}
