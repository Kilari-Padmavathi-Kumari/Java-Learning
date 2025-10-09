public class ThisInAll
{
    int a=10;

     ThisInAll() {
        this(10,"padma");
        System.err.println("i am default con");
        System.err.println("instance variable :"+a);
    }
    ThisInAll(int a,String b)
    {
        method(1);
        System.err.println("current variable :"+a);
        System.err.println("current variable :"+b);
        System.err.println("instance variable :"+a);
    }
    void method(int a)
    {
        System.err.println("i am methodSec :"+methodSec(2.1f));
        System.err.println("current class variable :"+a);
        System.err.println("instance variable :"+this.a);
    }
    int methodSec(float a)
    {
        System.err.println("current variable :"+a);
        System.err.println("instance variable :"+a);
        return (int) a;
    }
    
    public static void main(String[] args) {
        ThisInAll obj=new ThisInAll();
    }
    
}