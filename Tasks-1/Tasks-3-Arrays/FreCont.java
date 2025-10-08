public class FreCont
{
    public static void main(String[] args) {
        String str="padma & hello";
        int[] freq=new int[256];                          //256 used for ASCII values
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)]++;
        }
            for(int i=0;i<256;i++)
            {
                if(freq[i]>0)
                {
                    System.err.println((char)i+"->"+freq[i]);
                }
            }
        
        
    }
}