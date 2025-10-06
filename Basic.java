/*import java.util.Arrays;
public class Basic
{
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.err.println(arr[2]);
    }
}*/

/*public class Basic
{
    public static void main(String[] args) {
        int[] arr={1,3,5,7,3,467};
        System.err.println(arr[5]);
       // System.err.println(arr[6]);   //java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    }
}*/


/*import java.util.Arrays;
public class Basic
{
    public static void main(String[] args) {
        int[] arr={1,3,32,564,7654};
        System.err.println(Arrays.toString(arr));
        System.err.println(arr[4]);
    }
}*/

import java.util.Arrays;
import java.util.Scanner;
public class Basic
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.err.println(Arrays.toString(arr));
        System.err.println(arr[3]);
    }
}