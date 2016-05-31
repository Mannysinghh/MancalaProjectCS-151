import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.Icon;

public class StoneIcon implements Icon{

	public int size;
	public StoneIcon(int aSize)
	{
		size = aSize;
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
		
		Ellipse2D.Double stone = new Ellipse2D.Double(x + randomInt(), y + randomInt(), size, size);
		
		g2.setColor(Color.RED);
		g2.fill(stone);
		
	}
	
	public int randomInt()
	{
		Random rand = new Random();
		int random = rand.nextInt((20 - 0) + 1) + 0;
		return random;
	}

	
}
