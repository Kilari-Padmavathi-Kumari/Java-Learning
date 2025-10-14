public class OverLoad
{
     OverLoad()
    {
       
       System.err.println("i am default Constructor");
    }
    OverLoad(int a,int b)
    {
        
        System.err.println("two Para con value a : "+a);
        System.err.println("two Para con value b : "+b);
    }
    OverLoad(int a,int b,int c)
    {
        new OverLoad(2,3);
        System.err.println("three Para con value a : "+a);
        System.err.println("three Para con value b : "+b);
        System.err.println("three para con value c : "+c);
    }
    OverLoad(OverLoad obj)
    {
        new OverLoad(2,3,4);
        System.err.println("copy con");
    }
    public static void main(String[] args) {
        OverLoad obj=new OverLoad(new OverLoad());
    }
}