public class ElementsSum
{
    public static void main(String[] args) {
        int[] arr={2,4,5,75,42};
        int sum=0;
        for(int num:arr)                        //enhanced for loop(for-each loop)
        {
            sum=sum+num;
        }
        System.err.println(sum);
    }
}