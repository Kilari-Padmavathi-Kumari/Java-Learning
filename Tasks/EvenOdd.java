public class EvenOdd
{
    static boolean isEvenOdd(int num)
    {
            return (num%2==0)?true:false;
    }
    public static void main(String[] args) {
        int num=3;
         
         System.err.println(isEvenOdd(num));
    }
}