
import hsa.Console;
import java.awt.Color;
import java.util.Random;

public class BarChart1 {

    public static void main(String[] args) {
        Console c = new Console();
        int height;
        for (int i = 0; i < 4; i++) {
            while (true) {
                c.print("Enter height of bar " + (i + 1) + "(max 400): ");
                height = c.readInt();
                if (height <= 400 && height >= 10) {
                    break;
                } else {
                    c.print("Error, number must be lower than 400\n");
                }
            }
            c.setColor(rng()); //random color
            c.fillRect(50 + 100 * i, 500 - height, 50, height);
            c.drawString("Value: " + height, 50 + 100 * i, 500 - height - 20);
            
        }
    }
        
        

    public static Color rng() {
        Random r = new Random();
        return new Color(r.nextInt(255), r.nextInt(225), r.nextInt(255));
    }

}
