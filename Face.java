/**
 * 
 */

import javax.swing.JApplet;
import java.awt.*;
/**
 * @author ËÎÓëçñ
 *
 */
public class Face extends JApplet {

    /**
     * @param args
     */
    public void paint(Graphics j) {
        // TODO Auto-generated method stub
        int MID=150;
        j.setColor(Color.pink);
        j.fillOval(MID-40,MID-50,MID-20,MID); //head
        j.setColor(Color.black);
        j.drawOval(MID-5,MID-15,25,15);  //eye
        j.drawOval(MID+30,MID-15,25,15);  //eye
        j.setColor(Color.black);
        j.fillOval(MID+2,MID-15,12,15);  //pupil
        j.fillOval(MID+37,MID-15,12,15);  //pupil
        j.setColor(Color.yellow);
        j.fillOval(MID+18,MID+18,14,14);  //nose
        j.setColor(Color.red);
        j.fillArc(MID+7,MID+28,36,44,180,180);  //mouse
        j.setColor(Color.cyan);
        j.fillArc(MID-47,MID-15,23,35,60,190);  //ear
        j.fillArc(MID+76,MID-15,23,35,-73,195);//ear
        
    }

}
