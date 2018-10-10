import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

class Myframe extends JFrame
{
	JButton button;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	private JPanel panel,panel1,panel2,panel3,panel4;
	
	public Myframe()
	{
		setSize(230,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자 계산기");
		
		JPanel panel = new JPanel(new GridLayout(0,1));
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		JLabel label1 = new JLabel("원금을 입력하시오");
		t1 = new JTextField(5);
		panel1.add(label1);
		panel1.add(t1);
		
		JLabel label2 = new JLabel("이름을 입력하시오");
		t2 = new JTextField(5);
		panel2.add(label2);
		panel2.add(t2);
		
		button = new JButton("변환");
		panel3.add(button);
		
		t3 = new JTextField(20);
		panel4.add(t3);
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);
		
		this.add(panel);
		
		setVisible(true);
		
		
		
	}
	
}


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myframe f = new Myframe();

	}

}
