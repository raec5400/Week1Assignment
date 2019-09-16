import hsa.Console;
import java.awt.Color;


public class PenBar {
    int x, y, width;
    Color col;
    
    public void draw(Console c){
        c.setColor(col);
        y= 400-width;
        c.fillRect(x, y, width, 50);
        c.drawString("Value: " + width, x+10, y);
}
}
