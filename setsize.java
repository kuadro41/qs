import  java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class  setsize {
public static void  main(String[] args) {
	JFrame	frame = new JFrame();
	frame.setSize(800, 600);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	JTextField textField = new JTextField(30);
	panel.add(textField);
	JButton button = new JButton();
	button.setText("Gönder");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			System.out.println(textField.getText()); 	
		}
	}
			);
	panel.add(button);
	frame.add(panel, BorderLayout.CENTER);
	frame.setVisible(true);
}
}
