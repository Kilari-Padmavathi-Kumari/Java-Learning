class A 
{
    void dog()
    {
        System.out.println("dog running from class A");
    }
}
class B extends A
{
    void cat()
    {
        System.out.println("cat running from class B");
    }
}
class Multilevel extends B 
{
    void pig()
    {
        System.err.println("pig running from class multilevel");
    }
    public static void main(String[] args)
    {
        Multilevel obj=new Multilevel();
        obj.pig();
        obj.cat();
        obj.dog();
    }
}