package views.ticketing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Payment extends JFrame
{	
	private JPanel panel;
	
	public Payment()
	{
		this.setBounds(450, 0, 640, 860);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		JTextArea payInfo = new JTextArea("���� ������ ��ȭ : �׵��� ����");
		payInfo.setEditable(false);
		payInfo.setBounds(60, 80, 500, 120);
		
		String[] payMethod = {"ī�� ����", "����ī��", "����ī��"};
		
		JComboBox combo = new JComboBox(payMethod);
		combo.setBounds(80, 220, 440, 30);
		
		JTextField cardNum = new JTextField("ī���ȣ �Է�");
		
		panel.add(payInfo);
		panel.add(combo);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void PaymentMain()
	{
	}
	
	public void PaymentCard(JPanel panel)
	{
		
	}
	
	public void PaymentPhone(){}
	
	public void PaymentEnd(){}
}
