public class FindNumAlp
{
    public static void main(String[] args) {
        String str="123sadg56qas4";
        int num=0;
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='0' && ch>='9')
            {
                num=num*10+(ch-'0');
            }
            else
            {
                sum=sum+num;
                num=0;
            }
        }
        sum=sum+num;
        System.err.println(sum);
    }
}