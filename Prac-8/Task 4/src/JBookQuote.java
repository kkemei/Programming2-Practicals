import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame
{
   FlowLayout flow = new FlowLayout();
    JLabel message1 = new  JLabel("It was a stormy night,");
    JLabel message2 = new JLabel("I was scared.");
   private JBookQuote()
   {
      super("Book Quote");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(message1);
      add(message2);
   }
   public static void main(String[] args)
   {
     JBookQuote aFrame = new JBookQuote();
     aFrame.setSize(300, 150);
     aFrame.setVisible(true);
   }
}