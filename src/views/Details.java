package views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Details extends JFrame
{
	/*private JFrame mf;
	private JPanel panel;*/
	
	public Details()
	{
		this.setBounds(450, 0, 640, 860);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JTextArea movieName = new JTextArea("(영화등급)영화 제목");
		movieName.setEditable(false);
		movieName.setBounds(60, 70, 500, 40);
		
		JLabel posterImage = new JLabel("포스터 이미지");
		posterImage.setBounds(60, 110, 300, 360);
		JLabel info = new JLabel("간략 정보");
		info.setBounds(320, 110, 300, 360);
		
		JLabel ticketing = new JLabel("예매하기");
		ticketing.setBounds(320, 450, 500, 40);
		
		JLabel story = new JLabel("줄거리");
		story.setBounds(60, 550, 100, 40);
		
		JLabel stillImage = new JLabel("스틸컷 이미지");
		stillImage.setBounds(60, 750, 100, 40);
		
		panel.add(movieName);
		panel.add(posterImage);
		panel.add(info);
		panel.add(ticketing);
		panel.add(story);
		panel.add(stillImage);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}