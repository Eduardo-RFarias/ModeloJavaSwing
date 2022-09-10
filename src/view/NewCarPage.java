package view;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.NewCarController;

public class NewCarPage extends Page {
	private final JTextField textFieldPlate;
	private final JTextField textFieldModel;
	private final JTextField textFieldBrand;
	private final JTextField textFieldHP;
	private final JLabel labelPlate;
	private final JLabel labelModel;
	private final JLabel labelBrand;
	private final JLabel labelHorsepower;
	private final JButton buttonRegister;
	private final JButton buttonReturn;
	private final JLabel labelOwner;
	private final JComboBox<Long> comboBoxPerson;

	private final NewCarController controller;

	public NewCarPage() {
		super("New Car");

		this.controller = new NewCarController(this);

		getContentPane().setLayout(null);

		labelPlate = new JLabel("placa");
		labelPlate.setBounds(126, 65, 45, 13);
		getContentPane().add(labelPlate);

		labelModel = new JLabel("modelo");
		labelModel.setBounds(126, 96, 45, 13);
		getContentPane().add(labelModel);

		labelBrand = new JLabel("brand");
		labelBrand.setBounds(126, 141, 45, 13);
		getContentPane().add(labelBrand);

		labelHorsepower = new JLabel("cavalos");
		labelHorsepower.setBounds(126, 174, 45, 13);
		getContentPane().add(labelHorsepower);

		buttonRegister = new JButton("cadastrar");
		buttonRegister.setBounds(511, 274, 85, 21);
		buttonRegister.addActionListener(this);
		getContentPane().add(buttonRegister);

		buttonReturn = new JButton("voltar");
		buttonReturn.setBounds(10, 274, 85, 21);
		buttonReturn.addActionListener(this);
		getContentPane().add(buttonReturn);

		textFieldPlate = new JTextField();
		textFieldPlate.setBounds(293, 62, 137, 19);
		getContentPane().add(textFieldPlate);
		textFieldPlate.setColumns(10);

		textFieldModel = new JTextField();
		textFieldModel.setBounds(293, 93, 137, 19);
		getContentPane().add(textFieldModel);
		textFieldModel.setColumns(10);

		textFieldBrand = new JTextField();
		textFieldBrand.setBounds(293, 138, 137, 19);
		getContentPane().add(textFieldBrand);
		textFieldBrand.setColumns(10);

		textFieldHP = new JTextField();
		textFieldHP.setBounds(293, 171, 137, 19);
		getContentPane().add(textFieldHP);
		textFieldHP.setColumns(10);

		labelOwner = new JLabel("Dono do carro");
		labelOwner.setBounds(126, 208, 85, 13);
		getContentPane().add(labelOwner);

		comboBoxPerson = new JComboBox<>();
		comboBoxPerson.setBounds(293, 204, 137, 21);
		comboBoxPerson.setModel(controller.generatePersonComboBox());
		getContentPane().add(comboBoxPerson);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}

	public JTextField getTextFieldPlate() {
		return textFieldPlate;
	}

	public JTextField getTextFieldModel() {
		return textFieldModel;
	}

	public JTextField getTextFieldBrand() {
		return textFieldBrand;
	}

	public JTextField getTextFieldHP() {
		return textFieldHP;
	}

	public JLabel getLabelPlate() {
		return labelPlate;
	}

	public JLabel getLabelModel() {
		return labelModel;
	}

	public JLabel getLabelBrand() {
		return labelBrand;
	}

	public JLabel getLabelHorsepower() {
		return labelHorsepower;
	}

	public JButton getButtonRegister() {
		return buttonRegister;
	}

	public JButton getButtonReturn() {
		return buttonReturn;
	}

	public JLabel getLabelOwner() {
		return labelOwner;
	}

	public JComboBox<Long> getComboBoxPerson() {
		return comboBoxPerson;
	}
}
