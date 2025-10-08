public class LarSamEle
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int max=arr[0];
        int min=arr[0];
        for(int num:arr)                    //using ehnaced for loop(for each loop)
        {
            if(num>max)
            {
                max=num;
            }
            if(num<min)
            {
                min=num;
            }
        }
        System.err.println("min num :"+min);
        System.err.println("max num :"+max);
    }
}