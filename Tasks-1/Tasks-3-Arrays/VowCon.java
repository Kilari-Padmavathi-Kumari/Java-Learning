public class VowCon
{
    public static void main(String[] args) {
        String str="hello world";
        int vow=0;
        int con=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vow++;
            }
            else{
                con++;
            }
        }
        System.err.println("vowels count:"+vow);
        System.err.println("consonants count:"+con);
    }
}