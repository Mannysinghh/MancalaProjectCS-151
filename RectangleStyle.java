import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class RectangleStyle implements BoardStyle {

    public void drawBoard(Graphics2D g2, int x, int y, int size) {

        Rectangle2D.Double outter = new Rectangle2D.Double(x, y, size / 2.05, size);
        Rectangle2D.Double inner = new Rectangle2D.Double(x + 3, y + 3, (size / 2.05) - 5, size - 5);
        g2.setColor(Color.BLACK);
        g2.fill(outter);
        g2.setColor(Color.WHITE);
        g2.fill(inner);


    }

    @Override
    public void drawPit(Graphics2D g2, int x, int y, int size) {
        // TODO Auto-generated method stub
        Rectangle2D.Double outter = new Rectangle2D.Double(x, y, size, size);
        Rectangle2D.Double inner = new Rectangle2D.Double(x + 3, y + 3, size - 5, size - 5);
        g2.setColor(Color.BLACK);
        ;
        g2.fill(outter);
        g2.setColor(Color.WHITE);
        g2.fill(inner);
    }

}