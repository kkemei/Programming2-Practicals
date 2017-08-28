import javax.swing.*;

public class ValidatePassword {
    public static void main(String args[]) {
        String password;
        final int num = 2;
        int stringLength;
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        password = JOptionPane.showInputDialog(null,
                "Enter a password");
        stringLength = password.length();

        for (int i = 0; i < stringLength; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isLowerCase(ch))
                lowerCount++;
            else if (Character.isDigit(ch))
                digitCount++;
        }
        if (upperCount >= num && lowerCount >= num && digitCount >= num)
            JOptionPane.showMessageDialog(null,"Valid password");
        else {
            JOptionPane.showMessageDialog(null,"The password did not have enough of the following:");
            if (upperCount < num)
                JOptionPane.showMessageDialog(null,"uppercase letters");
            if (lowerCount < num)
                JOptionPane.showMessageDialog(null,"lowercase letters");
            if (digitCount < num)
                JOptionPane.showMessageDialog(null,"digits");

        }
    }
}
