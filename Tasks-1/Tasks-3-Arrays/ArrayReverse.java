
/*public class ArrayReverse
{
    public static void main(String[] args) {
        int[] arr={1,2,33,122,5};

        for(int i=arr.length-1;i>=0;i--)
        {
             System.err.println(arr[i]);
        }
       
    }
}*/

import java.util.*;
public class ArrayReverse
{
   public static void main(String[] args) {
       int[] arr={1,32,4,2,4};
       int left=0;
       int right=arr.length-1;
       while(left<right)
       {
        int tem=arr[left];
        arr[left]=arr[right];
        arr[right]=tem;
        left++;
        right--;
       }
       System.err.println(Arrays.toString(arr));
   }   
}