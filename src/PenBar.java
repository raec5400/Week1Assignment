import TurtleGraphics.Pen;

import java.awt.Color;


public class PenBar {
    int x, y, width;
    Color col;
    
    public void draw(Pen p){
       p.up();
       p.move(x, y);
       p.down();
       p.setDirection(0);
       p.setColor(col);
       p.setWidth(50);
       p.move(width);
       p.drawString("Value: " + width);
}
}
