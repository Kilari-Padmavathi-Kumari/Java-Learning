class Return
{
     static String var()
     {
       int age=19;
        if(age>=18)
        {
            return "right to vote";
        }
        else
        {
            return "not";
        }
     }
    public static void main(String[] args) 
    {
       System.out.print(var());
    }
}