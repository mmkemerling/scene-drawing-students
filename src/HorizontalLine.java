import bridges.base.Color;
import bridges.base.ColorGrid;

public class HorizontalLine extends Mark {
    private int xStart;
    private int xEnd;
    private int yCoord;

    public HorizontalLine(int start, int end, int y, Color c) {
    xStart = start;
    xEnd = end;
    yCoord = y;
    color = c;
    }

    @Override
    public void draw(ColorGrid cg) {
        for(int i = xStart; i <= xEnd; i++) {
            cg.set(yCoord, i, color);
        }
    }
}
