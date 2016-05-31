import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Icon;
import javax.swing.JPanel;

public class PitIcon extends JPanel implements Icon{

	private int size;
	private BoardStyle style;
	
	public PitIcon(BoardStyle b, int sSize)
	{
		style = b;
		size = sSize;
	}

	@Override
	public int getIconHeight() {
		return size; 
	}

	@Override
	public int getIconWidth() {
		return size;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		
		style.drawPit(g2, x, y, size);
	}
}
