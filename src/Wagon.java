
import hsa.Console;
import java.awt.Color;


public class Wagon {

    public static void main(String[] args) {
        Console c = new Console();       
        //grass
        c.setColor(Color.green);
        c.drawRect(0, 400, 700,100);        
        c.fillRect(0, 400, 700,100);
        //sky
        c.setColor(Color.CYAN);
        c.drawRect(0, 0, 700, 400);       
        c.fillRect(0, 0, 700, 400);
        //sun
        c.setColor(Color.yellow);
        c.drawOval(500, 50, 100, 100);       
        c.fillOval(500, 50, 100, 100);
        //wagon
        c.setColor(Color.red);
        c.drawRect(150, 300, 350, 50);
        c.fillRect(150, 300, 350, 50);
        //left wheel
        c.setColor(Color.black);
        c.drawOval(200, 350, 50, 50);
        c.fillOval(200, 350, 50, 50);
        //right wheel        
        c.drawOval(400, 350, 50, 50);
        c.fillOval(400, 350, 50, 50);
        //handel
        c.drawLine(150, 300, 50, 150);
    }
    
}
