import java.util.Scanner;
public class NumbersDemo2 {
    public static void main (String args[])
    {
        Scanner kb = new Scanner(System.in);
        int x, y;
        System.out.print("Enter an integer >> ");
        x = kb.nextInt();
        System.out.print("Enter another integer >> ");
        y = kb.nextInt();
        displayTwiceTheNumber(x,y);
        numbersPlusFive(x,y);
        displayNumberSquared(x,y);
    }

    public static void displayTwiceTheNumber(int x, int y)
    {
        int TwiceTheNumberX;
        int TwiceTheNumberY;
        TwiceTheNumberX = x *2;
        TwiceTheNumberY = y *2;
        System.out.println("Double the number X = " + TwiceTheNumberX);
        System.out.println("Double the number Y = " + TwiceTheNumberY);
    }

    public static void numbersPlusFive(int x, int y)
    {
        int numbersPlusFiveX;
        int numbersPlusFiveY;
        numbersPlusFiveX = x + 5;
        numbersPlusFiveY = y + 5;
        System.out.println("X + 5 = " + numbersPlusFiveX);
        System.out.println("Y + 5 = " + numbersPlusFiveY);
    }

    public static void displayNumberSquared(int x, int y)
    {
        int NumberSquaredX;
        int NumberSquaredY;
        NumberSquaredX = x;
        NumberSquaredY = y;
//        System.out.println("X + 5 = " + NumberSquaredX);
//        System.out.println("Y + 5 = " + NumberSquaredY);
        System.out.println(NumberSquaredX + " squared is " + (NumberSquaredX * NumberSquaredX));
        System.out.println(NumberSquaredY + " squared is " + (NumberSquaredY * NumberSquaredY));
    }
}
