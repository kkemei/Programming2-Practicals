import java.util.Scanner;

public class FormLetterWriter {
    public static void main (String args[]){
        String salutation;
        String FName;
        String LName;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salutation >> ");
        salutation = input.nextLine();
        System.out.print("Enter your First Name >> ");
        FName = input.nextLine();
        System.out.print("Enter your Last Name >> ");
        LName = input.nextLine();
        displaySalutation(salutation, FName, LName);
    }

    public static void displaySalutation(String salutation, String FName, String LName){
        System.out.println("Dear " + salutation + " " + LName);
        System.out.println("Dear " + FName + " " + LName);
    }

}
