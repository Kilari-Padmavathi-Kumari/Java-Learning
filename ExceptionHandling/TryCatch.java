/*public class TryCatch
{
    public static void main(String[] args) {
        try{
            int a=10/0;
            System.err.println("no exception");
        }
        catch(Exception e)
        {
            System.err.println("exception e");              //catch handle the exception 
            System.err.println("exception e : "+e);             // exception name
        }
    }
}*/

public class TryCatch
{
    public static void main(String[] args) {
        try{
            int first=10,second=0;
            System.err.println("before exception");    // this line run
            int result=first/second;                          // not run
            System.err.println("exception : "+result);        // not run
        }
        catch(ArithmeticException e)
        {
            System.err.println("exception e");              //catch handle the exception 
            System.err.println("exception e : "+e);             // exception name
        }
    }
}