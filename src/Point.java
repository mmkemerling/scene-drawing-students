import bridges.base.Color;
import bridges.base.ColorGrid;
import org.w3c.dom.css.RGBColor;

public class Point extends Mark {

    private int xCoord;
    private int yCoord;

    public Point(int x, int y, Color c) {
    xCoord = x;
    yCoord = y;
    color = c;
    }
    @Override
    public void draw(ColorGrid cg) {
       cg.set(yCoord,xCoord,color);
    }
}
