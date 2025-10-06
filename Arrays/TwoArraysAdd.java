
import java.util.Arrays;

public class TwoArraysAdd
{
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={5,6,7,8};
        int[] c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for (int i = 0; i<b.length; i++) {
            c[a.length+i]=b[i];
        }
        System.err.println(Arrays.toString(c));
    }
}