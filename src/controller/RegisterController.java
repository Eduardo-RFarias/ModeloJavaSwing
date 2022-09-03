package controller;

import controller.repository.PersonRepository;
import model.Person;
import view.ListPersonPage;
import view.RegisterPage;

public class RegisterController extends Controller<RegisterPage> {
	private final PersonRepository personRepository = new PersonRepository();

	public RegisterController(RegisterPage view) {
		super(view);
	}

	@Override
	public void sendAction(Object source) {
		if (source == view.getButtonRegister()) {
			runActionRegisterPerson();

			new ListPersonPage().setVisible(true);
			view.dispose();
		} else if (source == view.getButtonReturn()) {
			new ListPersonPage().setVisible(true);
			view.dispose();
		}
	}

	private void runActionRegisterPerson() {
		String cpf = view.getTextFieldCpf().getText();
		String name = view.getTextFieldName().getText();

		if (name.isEmpty()) {
			System.out.println("Nome não pode ser vazio");
			return;
		}

		Long cpfNum;

		if (cpf.length() != 11) {
			System.out.println("O cpf deve ter 11 dígitos");
			return;
		}

		try {
			cpfNum = Long.parseLong(cpf);
		} catch (NumberFormatException error) {
			System.out.println("O cpf não é um número");
			return;
		}

		personRepository.save(new Person(cpfNum, name));
	}

	public RegisterPage getView() {
		return view;
	}
}
