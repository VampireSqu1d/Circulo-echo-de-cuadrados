package circulodecuadrados;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javax.swing.JPanel;

public class magia extends JPanel{
    
     public void paint(Graphics g){        
        
        int centroX = 270;
        int centroY = 270;
        int r = 150;
        for (int theta = 0; theta < 180; theta++) {
            int x = (int) (centroX + r*cos(theta));
            int y = (int) (centroY + r*sin(theta));
            
            if (theta < 180) g.setColor(Color.blue);
            
            if (theta < 135) g.setColor(Color.magenta);
            
            if (theta < 90) g.setColor(Color.black);
            
            if (theta < 45) g.setColor(Color.red);            
            
            g.drawRect(x, y, 30, 30);            
        }                
    } 
    
}
