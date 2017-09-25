import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
   FlowLayout flow = new FlowLayout();
   JLabel message1 = new  JLabel("It was a stormy night,");
   JLabel message2 = new JLabel("I was scared.");
   JButton button = new JButton("Click for source");
   JLabel message3 = new JLabel("A Scary Book");
   public JBookQuote2()
   {
      super("Book Quote 2");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(message1);
      add(message2);
      add(button);
      button.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      add(message3);
      validate();
      repaint();
   }
   public static void main(String[] args)
   {
     JBookQuote2 aFrame = new JBookQuote2();
     aFrame.setSize(260, 150);
     aFrame.setVisible(true);
   }
}