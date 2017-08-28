import java.util.Scanner;

public class DistanceFromAverage {
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        double[] numbersArray = new double[20];
        double entry;
        double total = 0;
        double average = 0;
        final int QUIT = 99999;
        int x = 0, y;
        System.out.print("Enter a number or enter " +
                QUIT + " to quit");
        entry = input.nextDouble();
        while (entry != QUIT && x < numbersArray.length) {
            numbersArray[x] = entry;
            total += numbersArray[x];
            ++x;
            if (x < numbersArray.length) {
                System.out.print("Enter another number or enter " +
                        QUIT + " to quit");
                entry = input.nextDouble();
            }
        }
        if (x == 0)
            System.out.println("Average cannot be calculated because no numbers were entered");
        else {
            average = total / x;
            System.out.println("You entered " + x +
                    " numbersArray and their average is " + average);
            for (y = 0; y < x; ++y)
                System.out.println(numbersArray[y] + " is " +
                        (numbersArray[y] - average) + " away from the average");
        }
    }
}

