class A
{
    int a=10;
    void eat()
    {
        System.err.println("eating from A class");
        System.err.println(a);
    }
}
public class Single extends A
{
    int a=20;
    void run()
    {
        System.err.println("running from SingleInh");
        System.err.println(a);
        System.err.println(super.a);
    }
    public static void main(String[] args) {
        Single obj=new Single();
        obj.run();
        obj.eat();
    }
}