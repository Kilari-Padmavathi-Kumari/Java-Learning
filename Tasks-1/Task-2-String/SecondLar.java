/*public class SecondLar
{                                                   
    public static void main(String[] args) {
        int[] arr={4,9,1,32,13};
        int lar=arr[0];                      //4
        int seclar=arr[0];                   //4
        for(int num:arr)
        {
             if(num>lar)
            { 
                seclar=lar;
                lar=num;
            }
            else{
                seclar=num;
            }
        }
        System.err.println(lar);
        System.err.println(seclar);
    }
}*/



public class SecondLar
{                                                    //using Integer.MIN_VALUE 
    public static void main(String[] args) {
        int[] arr={4,9,1,32,13};
        int lar=Integer.MIN_VALUE;                      //4
        int seclar=Integer.MIN_VALUE;                   //9
        for(int num:arr)
        {
             if(num>lar)
            { 
                seclar=lar;
                lar=num;
            }
            else{
                seclar=num;
            }
        }
        System.err.println(lar);
        System.err.println(seclar);
    }
}
