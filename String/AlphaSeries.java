/*public class AlphaSeries
{
    public static void main(String[] args) {
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            System.err.print(ch + " ");
        }
        
    }
}*/


/*public class AlphaSeries
{
    public static void main(String[] args) {
        String series="";
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            series +=ch;
            
        }
        System.err.print(series + " ");
    }
}*/


public class AlphaSeries
{
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++)                                 // n(n+1)/2
        {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.err.print(builder.toString());
    }
}

