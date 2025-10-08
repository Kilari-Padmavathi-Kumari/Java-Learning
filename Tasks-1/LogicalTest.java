public class LogicalTest
{
    static void isNegativeOne(int a)
    {
        if(a != -1)
        {
            System.err.println("abc");
        }
        else
        {
          System.err.println("virat");
        }
    }
    public static void main(String[] args) {
        int a=-1;
        isNegativeOne(a);
    }
}