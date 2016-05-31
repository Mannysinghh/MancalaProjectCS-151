/*
 * defines a Moncala Pit Icon object
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Icon;

public class MancalaPit implements Icon{

	//size and style of the mancala pit
	private int size;
	private BoardStyle style;
	
	/*
	 * constructor for Mancala pit object
	 * @param size of the pit
	 * @param style of the pit
	 */
	public MancalaPit(BoardStyle b, int sSize)
	{
		style = b;
		size = sSize;
	}
	
	/*gets the icons height
	 * @return the diameter of the object
	 */
	@Override
	public int getIconHeight() {
		return size;
	}

	/*
	 * get the icons width
	 * @return the diameter of the object
	 */
	@Override
	public int getIconWidth() {
		return size/2;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		
		style.drawBoard(g2, x, y, size);
	}
}
