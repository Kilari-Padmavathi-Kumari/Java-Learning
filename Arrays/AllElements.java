
import java.util.Arrays;
public class AllElements
{
    public static void main(String[] args) {
        int[] arr={1,3,4,6543,2134};
        System.err.println(Arrays.toString(arr));
        for(int num:arr)
        {
            System.err.println(num);
        }

    }
}