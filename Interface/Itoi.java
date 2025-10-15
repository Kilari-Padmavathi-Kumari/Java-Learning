
/*interface A
{
    abstract int m1(float a);
}
class Itoi implements A
{
    @Override
    public int m1(float a)
    {
        System.err.println("hello m1");
        System.err.println(a);
        return (int)a;
    }
    public static void main(String[] args) {
        Itoi obj=new Itoi();
        System.err.println(obj.m1(1));
    }
 }
*/



interface A
{
     abstract void dog();
     abstract void cat();
}
interface B
{
 
    abstract void bird();
}
class Itoi implements A,B
{
    @Override
    public void  dog()
    {
        System.err.println("dog eat");
    }
    @Override
    public void cat()
    {
        System.err.println("cat run");
    }
    @Override
    public void bird()
    {
        System.err.println("bird fly");
    }
    public static void main(String[] args) {
        Itoi obj=new Itoi();
        obj.dog();
        obj.cat();
        obj.bird();
    }
}