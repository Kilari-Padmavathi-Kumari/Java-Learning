interface I 
{
      abstract void bird();
      abstract void dog();
}
abstract class A
{
    void pig()
    {
        System.err.println("pig");
    }
}
class Itoab extends A implements I
{
    @Override
    public void bird()
    {
        System.err.println("bird");
    }
    @Override
    public void dog()
    {
        System.err.println("dog");
    }
        public static void main(String[] args)
    {
        Itoab obj=new Itoab();
        obj.bird();
        obj.dog();
        obj.pig();
    }
}