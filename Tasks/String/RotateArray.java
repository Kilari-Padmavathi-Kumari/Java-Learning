import java.util.*;
public class RotateArray
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int k=3;
        
        for(int r=0;r<k;r++)                                     //this loop used for rotation
        {
           int last=arr[n-1];                                     
            for(int i=n-1;i>0;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0]=last;                                            //[6,1,2,3,4,5] [5,6,1,2,3,4] [4,5,6,1,2,3]
        }
        System.err.println(Arrays.toString(arr));
        
    }
}
