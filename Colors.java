/**
 * 
 */

import javax.swing.JApplet;
import java.awt.*;
/**
 * @author ËÎÓëçñ
 *
 */
public class Colors extends JApplet{

    /**
     * @param args
     */
    public void paint(Graphics S) {
        final int PAGE_WIDTH = 600;
        final int PAGE_HEIGHT = 400;
        int x, y; 
        int width, height; 
        Color myColor = new Color (65280);
        setBackground(Color.white);
        S.setColor(Color.white);
        S.fillRect(0, 0, PAGE_WIDTH, PAGE_HEIGHT);
        // Set the color for the rectangle
        S.setColor (myColor);
        // Assign the corner point and width and height then draw
        x = 200;
        y = 125;
        width = 200;
        height = 150;
        S.fillRect(x, y, width, height);
        int redCode;
        int greenCode;
        int blueCode;
        redCode= myColor.getRed();
        greenCode=myColor.getGreen();
        blueCode=myColor.getBlue();
        S.setColor(Color.black);
        S.drawString("Red: "+redCode,220,150);
        S.drawString("Green: "+greenCode,220,175);
        S.drawString("Blue: "+blueCode,220,200);
        
        
    }

}
