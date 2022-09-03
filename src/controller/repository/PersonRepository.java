package controller.repository;

import java.util.List;
import java.util.Optional;

import model.Person;
import model.database.DatabaseProvider;

public class PersonRepository implements Repository<Person, Long> {

	@Override
	public List<Person> getAll() {
		return DatabaseProvider.getPersons();
	}

	@Override
	public Optional<Person> getByPrimaryField(Long cpf) {
		for (Person person : DatabaseProvider.getPersons()) {
			if (person.getCpf().equals(cpf)) {
				return Optional.of(person);
			}
		}

		return Optional.empty();
	}

	@Override
	public void delete(Person itemToDelete) {
		DatabaseProvider.getPersons().remove(itemToDelete);
	}

	@Override
	public void save(Person itemToSave) {
		DatabaseProvider.getPersons().add(itemToSave);
	}
}
