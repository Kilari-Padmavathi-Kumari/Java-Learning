/*class NonStatic
{
    int a=20;
    void m1(int b)
    {
        System.out.println(a);
        System.err.println(b);
    }
    public static void main(String[] args) {
        NonStatic obj=new NonStatic();
        obj.m1(10);
        System.out.println(obj.a);
    }
}*/

/*class NonStatic
{
   
    void m1(int b)
    {
        int a=20;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) 
    {
        NonStatic obj=new NonStatic();
        obj.m1(10);
      //  System.out.println(obj.a);                 //we cannot access the a in public class.
    }
}*/



class NonStatic
{
    private int a=20;
    void m1(int b)
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) 
    {
        NonStatic obj=new NonStatic();
        obj.m1(10);
      //  System.out.println(obj.a);                 //we cannot access the a in public class.
    }
}