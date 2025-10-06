public class EleEvenOdd
{
    public static void main(String[] args) {
        int[] arr={1,4,2,3,64,6,43,2};
        int evenCount=0;
        int oddCount=0;
        for(int num:arr)
        {
            if(num%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.err.println(evenCount);
        System.err.println(oddCount);
    }
}