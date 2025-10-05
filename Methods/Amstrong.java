class Amstriong
{
    static int m1(int m)
    {
        int sum=0;
        int n=m;
        while(m>0)
        {
            int r=m%10;
            sum=r*r*r+sum;
            m=m/10;
        }
        if(n==sum)
        {
            return 1;
        }
        else
        return 0;

    }
    public static void main(String[] args) {
        int m=153;
        int result=m1(m);
        if(result==1)
        {
            System.err.println("ams");
        }
        else
        {
            System.err.println("not");
        }
    }
}