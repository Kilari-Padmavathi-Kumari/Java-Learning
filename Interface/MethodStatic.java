interface I 
{
     float method(int a);                       // by default public abstract
}
interface I1
{ 
     static int itMethod(int a)   // interface we have static and default method also present(using static & default keyword) 
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
class Default extends Abs implements  I,I1
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
        Default obj=new Default();
        System.err.println(obj.method(1)); 
        System.err.println(obj.newMathod());
        System.err.println(obj.abMethod(1.2f));
        System.err.println(I1.itMethod(2)); //In interface static method calling in side main method using class name
    }
}