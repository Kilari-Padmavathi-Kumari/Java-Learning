interface I 
{
     float method(int a);
}
interface I1
{ 
     default int itMethod(int a)
     {
        System.err.println(a);
        return a;
     }
}
abstract class Abs
{
    abstract int newMathod();
      float abMethod(float a)
      {
        System.err.println(a);
        return a;
      }
}
class MethodDefault extends Abs implements  I,I1
{
    public float method(int a)
    {
        System.err.println(a);
        return a;
    }
    int newMathod()
    {
        System.err.println("hello ab");
        return 3;
    }
    public static void main(String[] args) {
        MethodDefault obj=new MethodDefault();
        System.err.println(obj.method(1)); 
        System.err.println(obj.newMathod());
        System.err.println(obj.abMethod(1.2f));
        System.err.println(obj.itMethod(2));
    }
}