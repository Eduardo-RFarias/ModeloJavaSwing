package view;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.RegisterController;

public class RegisterPage extends Page {
	private final JTextField textFieldCpf;
	private final JLabel labelCpf;
	private final JButton buttonRegister;
	private final RegisterController controller;
	private final JLabel labelName;
	private final JTextField textFieldName;
	private final JButton buttonReturn;

	public RegisterPage() {
		super("Login page");

		getContentPane().setLayout(null);

		labelCpf = new JLabel("cpf");
		labelCpf.setBounds(166, 69, 64, 13);
		getContentPane().add(labelCpf);

		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(322, 66, 124, 19);
		getContentPane().add(textFieldCpf);
		textFieldCpf.setColumns(10);

		buttonRegister = new JButton("register");
		buttonRegister.addActionListener(this);
		buttonRegister.setBounds(337, 176, 85, 21);
		getContentPane().add(buttonRegister);

		labelName = new JLabel("name");
		labelName.setBounds(166, 98, 45, 13);
		getContentPane().add(labelName);

		textFieldName = new JTextField();
		textFieldName.setBounds(322, 95, 124, 19);
		getContentPane().add(textFieldName);
		textFieldName.setColumns(10);

		buttonReturn = new JButton("Return");
		buttonReturn.setBounds(189, 176, 85, 21);
		buttonReturn.addActionListener(this);
		getContentPane().add(buttonReturn);

		controller = new RegisterController(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}

	public JLabel getLabelName() {
		return labelName;
	}

	public JTextField getTextFieldName() {
		return textFieldName;
	}

	public JTextField getTextFieldCpf() {
		return textFieldCpf;
	}

	public JLabel getLabelCpf() {
		return labelCpf;
	}

	public JButton getButtonRegister() {
		return buttonRegister;
	}

	public RegisterController getController() {
		return controller;
	}

	public JButton getButtonReturn() {
		return buttonReturn;
	}
}
