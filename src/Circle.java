import bridges.base.Color;
import bridges.base.ColorGrid;

//This code was derived from https://www.geeksforgeeks.org/mid-point-circle-drawing-algorithm/
public class Circle extends Mark {
    private int x_centre;
    private int y_centre;
    private int r;
    private Color c;
    public Circle(int radius, int xcenter, int ycenter, Color color) {
    r = radius;
    x_centre = xcenter;
    y_centre = ycenter;
    c = color;
    }

    @Override
    public void draw(ColorGrid cg) {
        // This code was derived from https://www.geeksforgeeks.org/mid-point-circle-drawing-algorithm/
        int x = r, y = 0;

        // Printing the initial point
        // on the axes after translation
        /*System.out.print("(" + (x + x_centre)
                + ", " + (y + y_centre) + ")");*/
        cg.set(y+ y_centre,x+x_centre,c);

        // When radius is zero only a single
        // point will be printed
        if (r > 0) {

           /* System.out.print("(" + (x + x_centre)
                    + ", " + (-y + y_centre) + ")");

            System.out.print("(" + (y + x_centre)
                    + ", " + (x + y_centre) + ")");

            System.out.println("(" + (-y + x_centre)
                    + ", " + (x + y_centre) + ")");*/
            cg.set(-y + y_centre,x + x_centre,c );
            cg.set(x+ y_centre,y +x_centre, c);
            cg.set(x + y_centre, -y + x_centre, c);
        }

        // Initialising the value of P
        int P = 1 - r;
        while (x > y) {

            y++;

            // Mid-point is inside or on the perimeter
            if (P <= 0)
                P = P + 2 * y + 1;

                // Mid-point is outside the perimeter
            else {
                x--;
                P = P + 2 * y - 2 * x + 1;
            }

            // All the perimeter points have already
            // been printed
            if (x < y)
                break;

            // Printing the generated point and its
            // reflection in the other octants after
            // translation
            /*
            System.out.print("(" + (x + x_centre)
                    + ", " + (y + y_centre) + ")");

            System.out.print("(" + (-x + x_centre)
                    + ", " + (y + y_centre) + ")");

            System.out.print("(" + (x + x_centre) +
                    ", " + (-y + y_centre) + ")");

            System.out.println("(" + (-x + x_centre)
                    + ", " + (-y + y_centre) + ")");*/
            cg.set(y+y_centre, x+x_centre, c);
            cg.set(y+y_centre, -x + x_centre, c);
            cg.set(-y + y_centre, x+ x_centre, c);
            cg.set(-y + y_centre, -x +x_centre, c);

            // If the generated point is on the
            // line x = y then the perimeter points
            // have already been printed
            if (x != y) {

                /*
                System.out.print("(" + (y + x_centre)
                        + ", " + (x + y_centre) + ")");

                System.out.print("(" + (-y + x_centre)
                        + ", " + (x + y_centre) + ")");

                System.out.print("(" + (y + x_centre)
                        + ", " + (-x + y_centre) + ")");

                System.out.println("(" + (-y + x_centre)
                        + ", " + (-x + y_centre) +")");*/
                cg.set(x+ y_centre, y+x_centre, c);
                cg.set(x+ y_centre, -y +x_centre, c);
                cg.set(-x+y_centre, y + x_centre, c);
                cg.set(-x +y_centre, -y+ x_centre, c);

            }
        }

    }
}
