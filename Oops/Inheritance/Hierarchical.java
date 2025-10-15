class A
{
    void dog()
    {
        System.err.println("dog eat from class A");
    }
}
 
 class B extends A{
    void cat()
    {
        System.err.println("cat eat from class B");
    }
 }

 public class Hierarchical extends A
 {
    void pig()
    {
        System.out.println("pig eat from hie");
    }
    public static void main(String[] args)
    {
        B obj=new B();
        obj.dog();
        obj.cat();
        Hierarchical obj1=new Hierarchical();
        obj1.pig();
        obj1.dog();
    }
 }