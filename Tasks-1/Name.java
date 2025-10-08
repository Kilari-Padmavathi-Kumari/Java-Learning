public class Name 
{
    static String resolveName(int a,int b)
    {
        if(a%2==0 && b%2==0)
        {
            return "anil";
        }
        else if((a%2==0 && b%2==1) || (a%2==1 && b%2==0))
        {
            return "vijay";
        }
        else 
        {
            return "padma";
        }
        
    }
    public static void main(String[] args) {
        int a=3;
        int b=6;
        System.err.println(resolveName(a,b));
    }
}