package views.ticketing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ticketing extends JFrame{
	private JFrame mf;
	private JPanel panel;
	
	
	
	public void TicketingMovie(){
		panel = new JPanel();
		panel.setLayout(null);
		JLabel label = new JLabel();
		
		JLabel list = new JLabel("�� ��ȭ ���");
		
		panel.add(list);
		panel.add(label);
		
		this.setBounds(450, 0, 640, 860);			
		list.setBounds(50, 100, 100, 100);
		
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public void TicketingMenu(){
		panel = new JPanel();
		
		panel.setLayout(null);
		JLabel label = new JLabel();
		
		//�� ����
		JLabel title1 = new JLabel("��ȭ");	//(new ImageIcon(new ImageIcon("images/start.PNG").getImage().getScaledInstance(200, 100, 0)));
		JLabel title2 = new JLabel("����");	
		JLabel title3 = new JLabel("��¥");	
		JLabel title4 = new JLabel("�ð�");
		
		//�ι�°��
		JLabel pic1 = new JLabel("������");	
		JLabel pic2 = new JLabel("������");	
		JLabel pic3 = new JLabel("������");	
		JLabel pic4 = new JLabel("������");
		
		//�����ʱ�ȭ
		JLabel reserv = new JLabel("���� �ʱ�ȭ");
		//�г��߰�
		panel.add(title1);
		panel.add(title2);
		panel.add(title3);
		panel.add(title4);
		panel.add(pic1);
		panel.add(pic2);
		panel.add(pic3);
		panel.add(pic4);
		panel.add(reserv);
		panel.add(label);
		//��ġ �����ֱ�
		this.setBounds(450, 0, 640, 860);			
		title1.setBounds(50, 0, 100, 100);
		title2.setBounds(200, 0, 100, 100);
		title3.setBounds(350, 0, 100, 100);
		title4.setBounds(500, 0, 100, 100);
		
		pic1.setBounds(50, 100, 100, 100);
		pic2.setBounds(200, 100, 100, 100);
		pic3.setBounds(350, 100, 100, 100);
		pic4.setBounds(500, 100, 100, 100);
		
		reserv.setBounds(250, 300, 400, 50);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void TicketingDate(){
		
	}
	
	public void TicketingSeat(){}
	
	
	
	
}
