public class TryCatch
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
}