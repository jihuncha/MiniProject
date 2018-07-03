package views;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Account extends JFrame
{
	//private JFrame mf;
	//private JPanel panel;
	
	public Account()
	{	
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel mainTitle = new JLabel("GC시네마");
		mainTitle.setBounds(280, 150, 150, 50);
		
		JLabel subTitle = new JLabel("Log-in");
		subTitle.setBounds(290, 250, 50, 20);
		
		JLabel id = new JLabel("아이디");
		id.setBounds(80, 400, 80, 80);
		
		JLabel password = new JLabel("패스워드");
		password.setBounds(80, 440, 80, 80);
		
		JTextField inputId = new JTextField();
		inputId.setBounds(145, 430, 380, 25);
		
		JPasswordField inputPassword = new JPasswordField();
		inputPassword.setBounds(145, 470, 380, 25);
		
		JCheckBox box = new JCheckBox();
		box.setBounds(80, 500, 25, 25);
		
		JLabel autoLogIn = new JLabel("자동로그인");
		autoLogIn.setBounds(120, 500, 100, 25);
		
		JLabel logIn = new JLabel("로그인");
		logIn.setBounds(290, 600, 150, 50);
		
		this.setBounds(450, 0, 640, 860);
		
		panel.add(mainTitle);
		panel.add(subTitle);
		panel.add(id);
		panel.add(password);
		panel.add(inputId);
		panel.add(inputPassword);
		panel.add(box);
		panel.add(autoLogIn);
		panel.add(logIn);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
