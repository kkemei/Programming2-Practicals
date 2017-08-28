import java.util.Arrays;

public class Twelveints {
    public static void main (String args[]){
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int x = 12,y;
        System.out.println(Arrays.toString(array));
        for(y = x - 1; y >= 0; --y)
        {
            System.out.println(array[y]);
        }
    }
}
