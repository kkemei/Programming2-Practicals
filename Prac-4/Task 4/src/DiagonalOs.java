public class DiagonalOs
{
    public static void main(String[] args)
    {
        final char charO = 'O';
        final char space = ' ';
        final int rows = 10;
        int spaces = 0;
        int a, b;
        for(a = 0; a < rows; ++a)
        {
            for(b = 0; b < spaces; ++b)
                System.out.print(space);
            System.out.println(charO);
            spaces++;
        }
    }
}