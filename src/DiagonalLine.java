import bridges.base.Color;
import bridges.base.ColorGrid;

// This code derived from https://www.geeksforgeeks.org/bresenhams-line-generation-algorithm/
public class DiagonalLine extends Mark {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Color c;


    public DiagonalLine(int x0, int y0, int x1Input, int y1Input, Color color) {
        x1= x0;
        y1 =y0;
        x2 = x1Input;
        y2 = y1Input;
        c = color;
    }
    @Override
    public void draw(ColorGrid cg) {
        // This code derived from https://www.geeksforgeeks.org/bresenhams-line-generation-algorithm/

        int m_new = 2 * (y2 - y1);
        int slope_error_new = m_new - (x2 - x1);

        for (int x = x1, y = y1; x <= x2; x++)
        {
            // Add slope to increment angle formed
            slope_error_new += m_new;

            // Slope error reached limit, time to
            // increment y and update slope error.
            if (slope_error_new >= 0)
            {
                y++;
                slope_error_new -= 2 * (x2 - x1);
            }
            cg.set(y,x,c);
        }
    }
}
