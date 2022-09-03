package integration_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import model.Person;
import model.database.DatabaseProvider;
import view.RegisterPage;

public class PersonIntegrationTests {

	@Test
	public void registerPerson_withValidInfo_expectPersonToBeRegistered() {
		// ------- Arrange -------
		RegisterPage loginPage = new RegisterPage();

		loginPage.getTextFieldCpf().setText("11111111111");
		loginPage.getTextFieldName().setText("Eduardo");

		// making sure the database is empty before acting
		assertTrue(DatabaseProvider.getPersons().isEmpty());

		// ------- Act -------
		loginPage.getButtonRegister().doClick();

		// ------- Assert -------
		assertEquals(1, DatabaseProvider.getPersons().size());

		Person savedPerson = DatabaseProvider.getPersons().get(0);

		assertEquals(Long.valueOf(11111111111L), savedPerson.getCpf());
		assertEquals("Eduardo", savedPerson.getName());
	}
}
