/*class ForLoop
{
    public static void main(String[] args) {
        int n=2;
        int c=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not");
        }
    }
}*/


/*
class ForLoop {

    static boolean isPrime(int num)
     {
        if (num <= 1) 
        {
            return false;
        }

        for (int i = 2; i <=num/2; i++) 
        {
            if (num % i == 0)
             {
                return false; 
             } 
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        for (int n = 1; n <= 100; n++) {
            if (isPrime(n)) 
            {
                System.out.print(n + " ");
            }
        }
    }
}*/


public class ForLoop
{
    public static void main(String[] args) 
    {
        String str="padma";
        String rev="";                                                  //Using Strings
        for(int i=str.length()-1;i>0;i--)
        {
            rev=rev+str.charAt(i);
            //System.out.println(rev);
        }
        if(str.equals(rev))
        {
            System.err.println("palindrome");
        }
        else
        {
            System.out.println("not");
        }
    }
}


