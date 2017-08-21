import java.util.Scanner;

public class  EvenOdds {
    public static void main(String args[])
    {
        int UserNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        UserNum = input.nextInt();

        if(isEven(UserNum))
            System.out.println(UserNum + " is even");
        else
            System.out.println(UserNum + " is odd");
    }
    public static boolean isEven(int number)
    {
        boolean result;
        if(number % 2 == 1)
            result = false;
        else
        {
            result = true;
        }
        return result;
    }
}
