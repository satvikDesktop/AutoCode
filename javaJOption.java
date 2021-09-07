import javax.swing.*;
// GUI
public class javaJOption {
    String name;
    int choice;
    public void NewFrame () {  // displays a frame 
        JFrame frame = new JFrame();
        frame.setVisible(true);
    }
    public void choice(){   // choice dialog box
       choice = JOptionPane.showConfirmDialog(null,"Do you like cats ?");
    }
    public void display2(){  // shows the message
        if (choice ==  JOptionPane.YES_OPTION)
        JOptionPane.showMessageDialog(null,"Me too");
        else if (choice ==  JOptionPane.NO_OPTION)
        JOptionPane.showMessageDialog(null,"Alright");
    }
    public  void input(){   //  takes string user input
        name = JOptionPane.showInputDialog(null,"What is your name?");
    }
    public void display1(){   //  shows the message
        JOptionPane.showMessageDialog(null,"Your name : "+name); 
    }
   public static void main (String[]args) {
       javaJOption ob = new javaJOption ();
       // calling each function
       ob.input();
       ob.display1();
       ob.choice();
       ob.display2();
       ob.NewFrame();
   }
}