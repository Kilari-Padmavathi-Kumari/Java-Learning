public class StringReverse
{
    public static void main(String[] args) {
        String str="java if fun";                       //  space also a character
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.err.println(rev);
    }
}