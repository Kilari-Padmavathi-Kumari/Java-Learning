public class A
{
    void m1()
    {
        System.err.println("hello outer");
    }
    class B
    {
        void m2()
        {
             System.err.println("hello inner");           //two typs of class static & non static nested cls
        }
    }
}
public class Nestedcls
{
    public static void main(String[] args) {
        A obj=new A();
        A.B obj1=obj.new B();
        obj.m1();
        obj1.m2();
    }
}