/**
 * 
 */

import javax.swing.JApplet;
import java.awt.*;

/**
 * @author ËÎÓëçñ
 *
 */
public class PieChart extends JApplet{

    /**
     * @param args
     */
    public void paint(Graphics k) {
        // TODO Auto-generated method stub
        int MID=100;
        //This pie chart shows the percentage of householder income spend on various expense.
        k.setColor(Color.blue);
        k.fillArc(MID,MID,MID+50,MID+50,0,126); //rent and utilities
        k.drawString("Rent and utilities 30%",225,120);
        k.setColor(Color.red);
        k.fillArc(MID,MID,MID+50,MID+50,126,54); //transportation
        k.drawString("Transportation 15%",0,160);
        k.setColor(Color.pink); 
        k.fillArc(MID,MID,MID+50,MID+50,180,54); //food
        k.drawString("food 15%",50,210);
        k.setColor(Color.green);
        k.fillArc(MID,MID,MID+50,MID+50,234,90);//education
        k.drawString("Education 25%",150,260);
        k.setColor(Color.cyan);
        k.fillArc(MID,MID,MID+50,MID+50,324,36);//Miscellaneous
        k.drawString("Miscellaneous 10%",250,200);
        
    }

}
