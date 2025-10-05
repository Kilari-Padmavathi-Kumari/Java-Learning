class Continue
{
 public static void main(String[] args)
    {
      String str="padma";
     for(int i=0;i<str.length();i++)
      {
        char ch=str.charAt(i);
        if(ch=='a')
        {
            continue;
            
        }
         System.out.println(ch);
    }
    }
   
}