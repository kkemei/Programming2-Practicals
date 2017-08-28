public class CountMovieSpaces {
    public static void main (String args[]){
        String quote = "THAT’S MY SECRET, CAPTAIN. I’M ALWAYS ANGRY";
        int numOfSpaces = 0;
        int stringLength = quote.length();
        for(int i = 0; i < stringLength; i++)
        {
            char ch = quote.charAt(i);
            if(ch == ' ')
                numOfSpaces++;
        }
        System.out.println("The number of spaces is " + numOfSpaces);
    }
}
