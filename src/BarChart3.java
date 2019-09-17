
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PenBar pb1 = new PenBar();
        PenBar pb2 = new PenBar();
        PenBar pb3 = new PenBar();
        PenBar pb4 = new PenBar();

        System.out.print("Enter value for bar 1: ");
        pb1.width = s.nextInt();
        System.out.print("Enter value for bar 2: ");
        pb2.width = s.nextInt();
        System.out.print("Enter value for bar 3: ");
        pb3.width = s.nextInt();
        System.out.print("Enter value for bar 4: ");
        pb4.width = s.nextInt();

        Pen p = new StandardPen(new SketchPadWindow(640, 480));

        makebar(p, pb1, -320, 140, pb1.width, Color.BLUE);
       
        makebar(p, pb2, -320, 40, pb2.width, Color.GREEN);
        
        makebar(p, pb3, -320, -60, pb3.width, Color.ORANGE);
       
        makebar(p, pb4, -320, -160, pb4.width, Color.RED);
       

    }

    public static void makebar(Pen p, PenBar pb, int x, int y, int w, Color c) {
        pb.x = x;
        pb.y = y;
        pb.width = w;
        pb.col = c;
        pb.draw(p);
    }

}
