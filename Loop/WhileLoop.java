class WhileLoop
{
    
    public static void main(String[] args) 
    {
        int n=121;
        int m=n;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m)
        {
            System.out.print(m);
        }
    }
}

