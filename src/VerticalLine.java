import bridges.base.Color;
import bridges.base.ColorGrid;

public class VerticalLine extends Mark {

    private int yStart;
    private int yEnd;
    private int xCoord;

    public VerticalLine(int start, int end, int x, Color c) {
        yStart = start;
        yEnd = end;
        xCoord = x;
        color = c;

    }

    @Override
    public void draw(ColorGrid cg) {
        for(int i = yStart; i <= yEnd; i++) {
            cg.set(i, xCoord, color);
        }
    }
}
