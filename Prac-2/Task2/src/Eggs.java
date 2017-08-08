import javax.swing.*;

public class Eggs {
    public static void main(String[] args)
    {
        String costString;
        final int DOZEN = 12;
        final double Cost_of_dozenEggs = 3.25;
        final double Cost_of_egg = 0.45;
        double cost;
        int eggs;
        int dozens;
        int leftOver;


        costString = JOptionPane.showInputDialog(null,"Enter number of eggs ordered","Purchase Eggs",
                JOptionPane.INFORMATION_MESSAGE);
        eggs = Integer.parseInt(costString);
        dozens = eggs/DOZEN;
        leftOver = eggs % DOZEN;
        cost = dozens * Cost_of_dozenEggs + leftOver * Cost_of_egg;
        JOptionPane.showMessageDialog(null,"You ordered " + eggs + " eggs. That's " + dozens + " dozen at $" + Cost_of_dozenEggs +
                " per dozen and " + leftOver + " loose eggs at " +
                (int) (Cost_of_egg * 100) + " cents each for a total of $" + cost );
    }
}