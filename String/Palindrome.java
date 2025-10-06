public class Palindrome
{
    public static void main(String[] args) {
        String str="padma";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
           
        }
        System.err.println(rev);
        if(str.equals(rev))
        {
            System.err.println("pali");
        }
        else
        System.err.println("not");
    }
}