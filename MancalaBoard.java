import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * defines a moncala board frame object
 */
public class MancalaBoard extends JFrame{

	//number of pits per player
	private int NUM_PITS = 6;
	
	
	
	/*
	 * frame constructor
	 */
	public MancalaBoard(BoardStyle b)
	{
		//STYLE
		makeFrame(b);
	}
	
	
	
	public void makeFrame(BoardStyle b)
	{
		//frame for game board
		JFrame frame = new JFrame();
		setSize(400,500);
		setLayout(new BorderLayout());
		setBackground(Color.lightGray);
				
		//add labels for the pits to the frame for players A and B
		//make the game board and add it to the frame
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		topPanel.add(makePlayerLabel("<----- Player B"), BorderLayout.NORTH);
		topPanel.add(makeLabels("B"), BorderLayout.CENTER);
		topPanel.add(makeGameBoard(b), BorderLayout.SOUTH);
		
		add(topPanel, BorderLayout.NORTH);
		add(makeLabels("A"), BorderLayout.CENTER);
		add(makePlayerLabel("Player A ----->"), BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	/*
	 * make the game board panel 
	 * @return gBoard JPanel a moncala game board with pits and moncala pits
	 */
	public JPanel makeGameBoard(BoardStyle b)
	{
		//game board panel
		JPanel gBoard = new JPanel();
		gBoard.setPreferredSize(new Dimension(700, 225));
		gBoard.setLayout(new BorderLayout());
		gBoard.setBackground(Color.lightGray);
						
		//add player pits + mancala pits to the game board JPanel
		gBoard.add(makeMancalaPit(b), BorderLayout.EAST);
		gBoard.add(makePits(b), BorderLayout.CENTER);
		gBoard.add(makeMancalaPit(b), BorderLayout.WEST);
		return gBoard;
	}
	
	/*
	 * make labels panel
	 * @player the player who the labels will belong too
	 * @return labels JPanel the labels panel for the given player
	 */
	public JPanel makeLabels(String player)
	{
		JPanel labels = new JPanel();
		labels.setLayout(new FlowLayout());
		
		labels.add(new JLabel("                                    "));
		for(int i = NUM_PITS; i > 0; i--)
		{
			String spacer = "                           ";
			String topPits = " " + player + String.valueOf(i) + spacer;
			labels.add(new JLabel(topPits));
		}
		labels.add(new JLabel("          "));
		return labels;
	}
	
	/*
	 * make the player pits for the game board
	 * @return pits JPanel for the game board
	 */
	public JPanel makePits(BoardStyle b)
	{
		JPanel pits = new JPanel();
		pits.setLayout(new GridLayout(2, 6));
		
		for(int j = 0; j < 12; j ++)
		{
			JLabel pit = new JLabel(new PitIcon(b, 75));
			pits.add(pit);
		}
		return pits;
	}
	
	/*
	 * make mancala pit 
	 * @return a mancala pit JPanel
	 */
	public JLabel makeMancalaPit(BoardStyle b)
	{
		JLabel mancalaPit = new JLabel(new MancalaPit(b , 170));
		return mancalaPit;
	}
	
	/*
	 * make player label
	 * @param s the string that defines one of the players
	 * @return label a JLabel of player name
	 */
	public JLabel makePlayerLabel(String s)
	{
		JLabel label = new JLabel(s, SwingConstants.CENTER);
		return label;
	}
}
