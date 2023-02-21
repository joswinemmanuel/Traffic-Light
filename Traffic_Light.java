import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class drawing extends JPanel implements ActionListener{
	JRadioButton b1;
	JRadioButton b2;
	JRadioButton b3;
	
	Color c_red = Color.red;
	Color c_yellow = Color.white;
	Color c_green = Color.white;
	
	drawing() {		
		b1 = new JRadioButton("Red");
		b1.setBounds(100, 50, 100, 50);
		b1.setSelected(true);
		b1.addActionListener(this);
		b1.setFocusable(false);
		b1.setBackground(Color.GRAY);
		b2 = new JRadioButton("Yellow");
		b2.setBounds(200, 50, 100, 50);
		b2.addActionListener(this);
		b2.setFocusable(false);
		b2.setBackground(Color.GRAY);
		b3 = new JRadioButton("Green");
		b3.setBounds(300, 50, 100, 50);
		b3.addActionListener(this);
		b3.setFocusable(false);
		b3.setBackground(Color.GRAY);
		
		ButtonGroup group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		
		this.setBackground(Color.DARK_GRAY);
		add(b1);
		add(b2);
		add(b3);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(b1.isSelected()) {
			c_red = Color.red;
			c_yellow = Color.white;
			c_green = Color.white;
		} else if(b2.isSelected()) {
			c_red = Color.white;
			c_yellow = Color.yellow;
			c_green = Color.white;
		} else if(b3.isSelected()) {
			c_red = Color.white;
			c_yellow = Color.white;
			c_green = Color.green;			
		}
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(300, 80, 100, 100);
		g.drawOval(300, 200, 100, 100);
		g.drawOval(300, 320, 100, 100);
		g.setColor(Color.gray);
		g.fillRect(275, 60, 150, 400);
		
		g.setColor(c_red);
		g.fillOval(300, 80, 100, 100);
		
		g.setColor(c_yellow);
		g.fillOval(300, 200, 100, 100);
		
		g.setColor(c_green);
		g.fillOval(300, 320, 100, 100);
	}	
}

public class Traffic_Light {
	public static void main(String[] args) {
		drawing work = new drawing();
		JFrame frame = new JFrame("Traffic light");
		frame.add(work);
		frame.setSize(700, 600);
		frame.setVisible(true);
	}
}
