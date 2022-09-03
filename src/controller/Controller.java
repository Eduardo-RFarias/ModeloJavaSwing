package controller;

import javax.swing.JFrame;

public abstract class Controller<VIEW extends JFrame> {
	protected final VIEW view;

	public Controller(VIEW view) {
		this.view = view;
	}

	public abstract void sendAction(Object source);
}
