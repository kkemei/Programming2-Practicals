import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrameDisableButton2 extends JFrame implements ActionListener
{
   final int SIZE = 180;
   Container container = getContentPane();
   JButton button = new JButton("Button");
   int count = 0;
   final int MAX = 8;
   JLabel label = new JLabel("finished!");
   public JFrameDisableButton2()
   {
      super("Frame");
      container.setLayout(new FlowLayout());
      setSize(SIZE, SIZE);
      setVisible(true);
      container.add(button);
      container.add(label);
      label.setVisible(false);
      button.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      ++count;
      if(count == MAX)
      {
        button.setEnabled(false);
        label.setVisible(true);
      }
   }
   public static void main(String[] args)
   {
      JFrameDisableButton2 frame =
         new JFrameDisableButton2();
   }
}
