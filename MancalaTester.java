import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MancalaTester {

	static BoardStyle b;
	public static void main(String[] args) {
		
		JFrame choiceOfStyle = new JFrame();
		JPanel stylePanel = new JPanel();
		JButton style1 = new JButton("Circle Style");
		JButton style2 = new JButton("Rectangle Style");
		JLabel pickStyle = new JLabel("Pick a board style!");
		pickStyle.setHorizontalAlignment(JLabel.CENTER);
		choiceOfStyle.add(pickStyle, BorderLayout.NORTH);
		stylePanel.add(style1);
		stylePanel.add(style2);
		choiceOfStyle.add(stylePanel);
		choiceOfStyle.pack();
		choiceOfStyle.setLocationRelativeTo(null);
		choiceOfStyle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		choiceOfStyle.setVisible(true);
		
		JFrame numOfStones = new JFrame();
		JPanel stonePanel = new JPanel();
		JButton threeStones = new JButton("3");
		JButton fourStones = new JButton("4");
		JLabel pickStones = new JLabel("Pick a number of stones in each pit!");
		pickStones.setHorizontalAlignment(JLabel.CENTER);
		numOfStones.add(pickStones, BorderLayout.NORTH);
		stonePanel.add(threeStones, BorderLayout.CENTER);
		stonePanel.add(fourStones, BorderLayout.SOUTH);
		numOfStones.add(stonePanel);
		numOfStones.pack();
		numOfStones.setLocationRelativeTo(null);
		numOfStones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		style1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				b = new CircleStyle();
				choiceOfStyle.dispose();
				numOfStones.setVisible(true);
			}
		});
		
		style2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				b = new RectangleStyle();
				choiceOfStyle.dispose();
				numOfStones.setVisible(true);
			}
		});
		
		threeStones.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				numOfStones.dispose();
				View v = new View(b);
			}
		});
		
		fourStones.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				numOfStones.dispose();
				View v = new View(b);
			}
		});
		

	}
}
