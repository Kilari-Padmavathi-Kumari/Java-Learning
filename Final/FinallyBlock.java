public class FinallyBlock
{
    public static void main(String[] args) {
        try{
            int a=10/0;
        }
        catch(Exception e)
        {
            System.err.println("exception");
            System.err.println("exception :"+e);
        }
        finally{
            System.err.println("finally block always print");
        }
    }
}