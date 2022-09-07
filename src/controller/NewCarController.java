package controller;

import java.util.List;
import java.util.Optional;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import controller.repository.PersonRepository;
import model.Car;
import model.Person;
import view.ListPersonPage;
import view.NewCarPage;

public class NewCarController extends Controller<NewCarPage> {
	private final PersonRepository personRepository;

	public NewCarController(NewCarPage view) {
		super(view);
		this.personRepository = new PersonRepository();
	}

	@Override
	public void sendAction(Object source) {
		if (source == view.getButtonCadastrar()) {
			runActionCadastrarCarro();

			new ListPersonPage().setVisible(true);
			view.dispose();
		} else if (source == view.getButtonVoltar()) {
			new ListPersonPage().setVisible(true);
			view.dispose();
		}
	}

	private void runActionCadastrarCarro() {
		String plate = view.getTextFieldPlate().getText();
		String brand = view.getTextFieldBrand().getText();
		String model = view.getTextFieldModel().getText();
		String hp = view.getTextFieldHP().getText();

		int hpInt;
		Long personCpf = (Long) view.getComboBoxPerson().getSelectedItem();

		if (plate.isBlank()) {
			System.out.println("A placa não pode estar vazia");
			return;
		}

		if (brand.isBlank()) {
			System.out.println("A marca não pode estar vazia");
			return;
		}

		if (model.isBlank()) {
			System.out.println("O modelo não pode estar vazia");
			return;
		}

		try {
			hpInt = Integer.parseInt(hp);
		} catch (NumberFormatException e) {
			System.out.println("HP não é um número");
			return;
		}

		Optional<Person> person = personRepository.getByPrimaryField(personCpf);

		if (person.isEmpty()) {
			System.out.println("Pessoa não encontrada");
			return;
		}

		Person selectedPerson = person.get();

		selectedPerson.getVehicles().add(new Car(plate, model, brand, hpInt));
	}

	public ComboBoxModel<Long> generatePersonComboBox() {
		final DefaultComboBoxModel<Long> model = new DefaultComboBoxModel<>();
		final List<Person> personList = personRepository.getAll();

		for (Person person : personList) {
			model.addElement(person.getCpf());
		}

		return model;
	}
}
