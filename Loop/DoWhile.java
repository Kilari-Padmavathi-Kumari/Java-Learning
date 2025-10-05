/*public class DoWhile
{
    public static void main(String[] args)
    {
        int m=235;
        int sum=0;
        do
        {
             int r=m%10;
             sum=sum+r;
             m=m/10;
        }
        while(m>0);
        System.out.print(sum);
    }
}*/


public class DoWhile
{
    public static void main(String[] args)
    {
        int m=121;
        int n=m;
        int rev=0;
        do
        {
             int r=m%10;
             rev=rev*10+r;
             m=m/10;
        }
        while(m>0);

        if(rev==n)
        {
           System.out.print(rev);
        }
        
    }
}