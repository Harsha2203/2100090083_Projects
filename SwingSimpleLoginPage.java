package Swing;

import javax.swing.JFrame;

//import javax.Swing.JFrame;
public class Login {

	public static void main(String[] args) {
		  Second frame=new Second();
	        frame.setTitle("Login Form");
	        frame.setVisible(true);
	        frame.setBounds(10,10,370,600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	}
}

package Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Second extends JFrame implements ActionListener  {
	Container container = getContentPane();
	JLabel userLabel = new JLabel("USERNAME");
	JLabel passwordLabel = new JLabel("PASSWORD");
	JTextField userTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JButton loginButton = new JButton("LOGIN");
	JButton resetButton = new JButton("RESET");
	JCheckBox showPassword = new JCheckBox("Show Password");

	public Second() {
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		addActionEvent();
	}

	public void setLayoutManager() {
		// Setting layout manager of Container to null
		container.setLayout(null);
	}

	public void setLocationAndSize() {
		// Setting location and Size of each components using setBounds() method.
		userLabel.setBounds(50, 150, 100, 30);
		passwordLabel.setBounds(50, 220, 100, 30);
		userTextField.setBounds(150, 150, 150, 30);
		passwordField.setBounds(150, 220, 150, 30);
		showPassword.setBounds(150, 250, 150, 30);
		loginButton.setBounds(50, 300, 100, 30);
		resetButton.setBounds(200, 300, 100, 30);

	}

	public void addComponentsToContainer() {
		// Adding each components to the Container
		container.add(userLabel);
		container.add(passwordLabel);
		container.add(userTextField);
		container.add(passwordField);
		container.add(showPassword);
		container.add(loginButton);
		container.add(resetButton);
	}

	public void addActionEvent() {
		// adding Action listener to components
		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		showPassword.addActionListener(this);
	}

	@SuppressWarnings("deprec"
			+ "ation")
	@Override
    public void actionPerformed(ActionEvent e) {
		
		 if (e.getSource() == loginButton) {
	            String userText;
	            String pwdText;
	            userText = userTextField.getText();
	            pwdText = passwordField.getText();
	            if (userText.equalsIgnoreCase("harsha") && pwdText.equalsIgnoreCase("098765")) {
	                JOptionPane.showMessageDialog(this, "Login Successful");
	            } else {
	                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
	            }
	          //Coding Part of RESET button
	            if (e.getSource() == resetButton) {
	                userTextField.setText("");
	                passwordField.setText("");
	            }
	           //Coding Part of showPassword JCheckBox
	            if (e.getSource() == showPassword) {
	                if (showPassword.isSelected()) {
	                    passwordField.setEchoChar((char) 0);
	                } else {
	                	passwordField.setEchoChar('*');
	                }
	     
	     
	            }
 }
	}
}
	


