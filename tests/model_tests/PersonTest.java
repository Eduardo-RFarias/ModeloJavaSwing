package model_tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import model.Person;

public class PersonTest {

	@Test
	public void createPerson() {
		// ------- Arrange -> Act -------
		Person person = new Person(Long.valueOf(222222222), "Adriano");

		// ------- Assert -------
		assertEquals("Adriano", person.getName());
	}

}
