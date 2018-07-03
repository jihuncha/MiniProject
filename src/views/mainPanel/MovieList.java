package views.mainPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MovieList extends JFrame{
	//private JFrame mf;
	//private JPanel panel;
	
	public MovieList(){
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel movie1 = new JLabel("영화1");
		movie1.setBounds(100, 100, 400, 400);
		
		JLabel movie2 = new JLabel("영화2");
		movie2.setBounds(300, 100, 400, 400);
		
		JLabel movie3 = new JLabel("영화3");
		movie3.setBounds(500, 100, 400, 400);
		
		JLabel movie4 = new JLabel("영화4");
		movie4.setBounds(100, 300, 400, 400);
		
		JLabel movie5 = new JLabel("영화5");
		movie5.setBounds(300, 300, 400, 400);
		
		JLabel movie6 = new JLabel("영화6");
		movie6.setBounds(500, 300, 400, 400);
		
		JLabel ad = new JLabel("광고");
		ad.setBounds(300, 600, 500, 200);
		
		this.setBounds(450,0,640,860);
		this.add(panel);
		panel.add(movie1);
		panel.add(movie2);
		panel.add(movie3);
		panel.add(movie4);
		panel.add(movie5);
		panel.add(movie6);
		panel.add(ad);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
