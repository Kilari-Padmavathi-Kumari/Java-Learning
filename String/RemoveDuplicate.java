public class RemoveDuplicate
{
    public static void main(String[] args) {
        String str=" padmavathi kumari";
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result+=ch;
            }
        }
        System.err.println(str);
        System.err.println(result);
    }
}