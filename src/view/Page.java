package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public abstract class Page extends JFrame implements ActionListener {
	public Page(String title) {
		super(title);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setResizable(false);
		setBounds(100, 100, 663, 353);
	}
}
