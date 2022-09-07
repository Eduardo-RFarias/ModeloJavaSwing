package controller;

import java.util.Optional;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import controller.repository.PersonRepository;
import model.Person;
import view.ListPersonPage;
import view.NewCarPage;
import view.RegisterPage;

public class ListPersonController extends Controller<ListPersonPage> {
	private final PersonRepository personRepository = new PersonRepository();

	public ListPersonController(ListPersonPage view) {
		super(view);
	}

	@Override
	public void sendAction(Object source) {
		if (source == view.getButtonRegister()) {
			new RegisterPage().setVisible(true);
			view.dispose();
		} else if (source == view.getButtonDelete()) {
			runActionDeletePerson();
		} else if (source == view.getButtonNewCar()) {
			new NewCarPage().setVisible(true);
			view.dispose();
		}
	}

	private void runActionDeletePerson() {
		Long personCpfSelected = view.getListPeople().getSelectedValue();

		if (personCpfSelected == null) {
			System.out.println("Nenhum CPF selecionado.");
			return;
		}

		Optional<Person> personSelected = personRepository.getByPrimaryField(personCpfSelected);

		if (personSelected.isEmpty()) {
			System.out.println("CPF selecionado não está cadastrado no banco.");
			return;
		}

		personRepository.delete(personSelected.get());

		view.getListPeople().setModel(generatePersonList());
	}

	public ListModel<Long> generatePersonList() {
		DefaultListModel<Long> model = new DefaultListModel<>();

		for (Person person : personRepository.getAll()) {
			model.addElement(person.getCpf());
		}

		return model;
	}
}
