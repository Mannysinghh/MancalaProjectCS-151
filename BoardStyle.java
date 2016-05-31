import java.awt.Graphics;
import java.awt.Graphics2D;


public interface BoardStyle 
{
	//shape
	//color
	void drawBoard(Graphics2D g,int x, int y, int size);
	void drawPit(Graphics2D g2,int x, int y, int size);
}