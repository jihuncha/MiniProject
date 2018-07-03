package views.mainPanel;

import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JFrame {
	private JFrame mf;
	private JPanel panel;

	public MenuPanel()
	{
		int x = 100;
		int y = 100;
		int width = 100;
		int weight = 50;
		
		mf = new JFrame();
		panel = new JPanel();
		panel.setLayout(null);
		JLabel label = new JLabel();
		JLabel button1 = new JLabel("영화");	//(new ImageIcon(new ImageIcon("images/start.PNG").getImage().getScaledInstance(200, 100, 0)));
		JLabel button2 = new JLabel("예매");	//(new ImageIcon(new ImageIcon("images/start.PNG").getImage().getScaledInstance(200, 100, 0)));
		JLabel button3 = new JLabel("스토어");	//(new ImageIcon(new ImageIcon("images/start.PNG").getImage().getScaledInstance(200, 100, 0)));
		JLabel button4 = new JLabel("뒤로가기");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		this.setBounds(450, 0, 640, 860);
		button1.setBounds(x+(width*0), y, width, weight);
		button2.setBounds(x+((width+30)*1), y, width, weight);
		button3.setBounds(x+((width+30)*2), y, width, weight);
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}