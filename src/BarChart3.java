
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Bar pb[] = new Bar[4];
        
        for (int i = 0; i < 4; i++) {
            pb[i] = new Bar();
            System.out.print("Enter value of Bar " + (i + 1) + ": ");
            pb[i].height = s.nextInt();
        }
        
        Pen p = new StandardPen(new SketchPadWindow(640, 480));
        p.up();
        p.move(-320);
        p.down();
        
    }

  
    

}
