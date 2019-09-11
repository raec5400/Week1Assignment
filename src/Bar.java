import hsa.Console;
import java.awt.Color;

public class Bar {
    int xloc, yloc, height;
    Color col;
    
    public void draw(Console c){
        c.setColor(col);
        yloc= 400-height;
        c.fillRect(xloc, yloc, 50, height);
        c.drawString("Value: " + height, xloc, yloc-10);
    }
}
