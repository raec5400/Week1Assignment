import hsa.Console;
import java.awt.Color;


public class BarChart2 {

    public static void main(String[] args) {
        Console c = new Console();
        //array of 4 colors for 4 bars
        Color col[] = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
        Bar b[] = new Bar [4];
        for (int i = 0; i < 4; i++) {
            b[i] = new Bar();//new bar at loc [i] in array
            c.print("Enter Bar " + (i+1) + " height: ");
            //assign height, xloc, color
            b[i].height = c.readInt();
            b[i].xloc = 50 + (100 * i);
            b[i].col = col[i];
            b[i].draw(c);
        }
        
    }
    
}
