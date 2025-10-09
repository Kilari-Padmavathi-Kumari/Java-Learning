public class Overloading
{
    int method(int a,int b)
    {
        System.err.println("two number add a :"+a);
       System.err.println("two number add b :"+b);
        return a+b;
    }
    int method(int a,int b,int c)
    {
       System.err.println("three number add a :"+a);
       System.err.println("three number add b :"+b);
       System.err.println("three number add c :"+c);
        return a+b+c;
    }
    double method(double a,double b)                                        //over loading
    {
       System.err.println("double number add a :"+a);
       System.err.println("double number add b :"+b);
        return a+b;
    }
    public static void main(String[] args) {
       Overloading obj=new Overloading();
        System.err.println(obj.method(10,20));
        System.err.println(obj.method(10,20,30));
        System.err.println(obj.method(1.5,7.8));
    }
}