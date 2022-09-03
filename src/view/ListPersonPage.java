package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.LineBorder;

import controller.ListPersonController;

public class ListPersonPage extends Page {

	private final JList<Long> listPeople;
	private final JLabel labelListTitle;
	private final JButton buttonRegister;

	private final ListPersonController controller;
	private final JButton buttonDelete;

	public ListPersonPage() {
		super("List People");
		getContentPane().setLayout(null);

		labelListTitle = new JLabel("People");
		labelListTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelListTitle.setBounds(23, 10, 54, 24);
		getContentPane().add(labelListTitle);

		listPeople = new JList<>();
		listPeople.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		listPeople.setBounds(23, 44, 601, 231);
		getContentPane().add(listPeople);

		buttonRegister = new JButton("Register");
		buttonRegister.setBounds(539, 285, 85, 21);
		buttonRegister.addActionListener(this);
		getContentPane().add(buttonRegister);

		buttonDelete = new JButton("Delete");
		buttonDelete.setBounds(539, 13, 85, 21);
		buttonDelete.addActionListener(this);
		getContentPane().add(buttonDelete);

		this.controller = new ListPersonController(this);

		listPeople.setModel(controller.generatePersonList());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}

	public JList<Long> getListPeople() {
		return listPeople;
	}

	public JLabel getLabelListTitle() {
		return labelListTitle;
	}

	public ListPersonController getController() {
		return controller;
	}

	public JButton getButtonRegister() {
		return buttonRegister;
	}

	public JButton getButtonDelete() {
		return buttonDelete;
	}
}