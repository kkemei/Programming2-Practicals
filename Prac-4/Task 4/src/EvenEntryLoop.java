import javax.swing.*;
public class EvenEntryLoop
{
    public static void main (String args[])
    {
        int number;
        String entry, message;
        final int quit = 999;
        entry = JOptionPane.showInputDialog(null,
                "Enter an even number or " + quit + " to quit");
        number =  Integer.parseInt(entry);
        while(number != quit)
        {
            if(number % 2 == 0)
                message = "Good job!";
            else
                message = number + " is not an even number";
            JOptionPane.showMessageDialog(null,message);
            entry = JOptionPane.showInputDialog(null,
                    "Enter an even number or " + quit + " to quit");
            number =  Integer.parseInt(entry);
        }
    }
}
