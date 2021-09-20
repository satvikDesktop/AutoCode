import java.awt.*;
import javax.swing.*; 


public class wpmGUI {

    public static void Frame () {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.DARK_GRAY);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         frame.setLocation(new Point(10, 50));
         frame.setSize(new Dimension(300, 120));
         frame.setTitle("Frame");
         frame.setVisible(true);
        }
   public static void main (String[]args) {
       Frame();
   }
}