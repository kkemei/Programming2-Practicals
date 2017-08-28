import javax.swing.*;

public class CountMovieSpaces2 {
    public static void main (String args[]){
        String quote;
        quote = JOptionPane.showInputDialog(null,
                "Enter a quote");
        int numOfSpaces = 0;
        int stringLength = quote.length();
        for(int i = 0; i < stringLength; i++)
        {
            char ch = quote.charAt(i);
            if(ch == ' ')
                numOfSpaces++;
        }
        JOptionPane.showMessageDialog(null,"The number of spaces is " + numOfSpaces);
    }
}
