interface I1
{
      int a=10;
      float method(float a);
}
interface I2
{
     static int methodI2(int a)
     {
        System.err.println("inteface I2 value : "+a);
        return (int)a;
     }
}
interface I3
{ 
    default float methodI3(int a)
    {
        System.err.println("interface I3 value : "+a);
        return a;
    }
}
abstract class Abs 
{
      long l=234567;
      static boolean b=true;
      abstract int methodAbs(int a);
}
class Allcond extends Abs implements I1,I2,I3
{ 
    public float method(float a)
    {
        System.err.println("inteface I1 value : "+a);
        return a;
    }
      int methodAbs(int a)
      {
        System.err.println("abstract abs value : "+a);
        return a;
      }
      public static void main(String[] args) {
          Allcond obj=new Allcond();
          System.err.println("variable value : "+I1.a);
          System.err.println(obj.method(1.2f));
          System.err.println(I2.methodI2(3));
          System.err.println(obj.methodI3(1));
          System.err.println("Abs long value : "+obj.l);
          System.err.println("Abs boolean value : "+b);
          System.err.println(obj.methodAbs(8));

      }
}