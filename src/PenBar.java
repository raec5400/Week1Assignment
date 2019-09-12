import hsa.Console;
import java.awt.Color;


public class PenBar {
    int x, y, height;
    Color col;
    
    public void draw(Console c){
        c.setColor(col);
        y= 400-height;
        c.fillRect(x, y, height, 50);
        c.drawString("Value: " + height, x-10, y);
}
}
