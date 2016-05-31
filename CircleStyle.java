import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class CircleStyle implements BoardStyle
{
	@Override
	public void drawBoard(Graphics2D g2,int x, int y, int size) {
		
		Ellipse2D.Double outter = new Ellipse2D.Double(x, y, size/2, size);
		Ellipse2D.Double inner = new Ellipse2D.Double(x+3, y+3, (size/2) - 5, size-5);
		g2.setColor(Color.BLACK);;
		g2.fill(outter);
		g2.setColor(Color.WHITE);
		g2.fill(inner);;
		
	}
	@Override
	public void drawPit(Graphics2D g2, int x, int y, int size) {
		// TODO Auto-generated method stub
		Ellipse2D.Double outter = new Ellipse2D.Double(x, y, size, size);
		Ellipse2D.Double inner = new Ellipse2D.Double(x+3, y+3, size - 5, size - 5);
		g2.setColor(Color.BLACK);;
		g2.fill(outter);
		g2.setColor(Color.WHITE);
		g2.fill(inner);	
	}

	
}
