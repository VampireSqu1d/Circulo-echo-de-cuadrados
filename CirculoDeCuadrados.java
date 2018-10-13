package circulodecuadrados;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CirculoDeCuadrados extends JFrame{
    
    public CirculoDeCuadrados(){
        setTitle("Circulo de cuadrados");    
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        add(new magia());
        ImageIcon logo = new ImageIcon("poggers.jpg");
        setIconImage(logo.getImage());                   
    }

    public static void main(String[] args) {
        new CirculoDeCuadrados();
    }
    
}
