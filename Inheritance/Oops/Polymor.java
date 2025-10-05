
/*class Polymor
{
    static int m1(float a)
    {
        System.err.println(a);
        return (int)a;
    }
    static boolean m1(boolean b)                                        //over loading
    {
        System.err.println(b);
        return (boolean)b;
    }
    public static void main(String[] args) {
        System.out.println(m1(2));
        System.err.println(m1(true));
    }
}*/


class A
{
      int m1(float a)
     {
        System.err.println("hello m1");
        System.err.println(a);
       return (int)a;
     }
}
class Polymor extends A
{    
    @Override
      int m1(float a)
     {
        System.err.println("hello override m1");                                 //override
        System.err.println(a);
       return (int)a;
     }
      short m2(int b)
      {
        System.err.println("hello m2");
        System.err.println(b);
        return (short)b;
      }
   public static void main(String[] args) 
   {
       Polymor obj=new Polymor();
       A obj1=new A();
        System.err.println(obj1.m1(4));
       System.err.println(obj.m1(2));
       obj.m2(4);
   }
}
