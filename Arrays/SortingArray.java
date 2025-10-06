
import java.util.Arrays;

public class SortingArray
{
    public static void main(String[] args) {
        int[] arr={2,3,1,76,2,5};
        Arrays.sort(arr);
        for(int num:arr)
        {
            System.err.println(num);
        }
    }
}