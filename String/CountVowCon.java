public class CountVowCon
{
    public static void main(String[] args) {
        String str="padma";
        int vow=0;
        int con=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u')
            {
                vow++;
            }
            else{
                con++;
            }
        }
        System.err.println(vow);
        System.err.println(con);
    }
}