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
		
		JTextArea movieName = new JTextArea("(��ȭ���)��ȭ ����");
		movieName.setEditable(false);
		movieName.setBounds(60, 70, 500, 40);
		
		JLabel posterImage = new JLabel("������ �̹���");
		posterImage.setBounds(60, 110, 300, 360);
		JLabel info = new JLabel("���� ����");
		info.setBounds(320, 110, 300, 360);
		
		JLabel ticketing = new JLabel("�����ϱ�");
		ticketing.setBounds(320, 450, 500, 40);
		
		JLabel story = new JLabel("�ٰŸ�");
		story.setBounds(60, 550, 100, 40);
		
		JLabel stillImage = new JLabel("��ƿ�� �̹���");
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