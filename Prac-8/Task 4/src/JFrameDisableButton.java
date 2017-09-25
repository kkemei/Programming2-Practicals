import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrameDisableButton extends JFrame implements ActionListener
{
   final int SIZE = 180;
   Container container = getContentPane();
   JButton button = new JButton("Button");
   public JFrameDisableButton()
   {
      super("Frame");
      container.setLayout(new FlowLayout());
      setSize(SIZE, SIZE);
      setVisible(true);
      container.add(button);
      button.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      button.setEnabled(false);
   }
   public static void main(String[] args)
   {
      JFrameDisableButton frame = new JFrameDisableButton();
   }
}
