abstract class Abs
{
    abstract float add(float a,float b);
    
    int sub(int a,int b)
    {
        System.err.println("sub value a : "+a);
        System.err.println("sub value b : "+b);
        return a-b;
    }
    Abs(float a)
    {
        System.err.println("i am paracon");
        System.err.println(a);
    }
}

class Con extends Abs
{
     Con()
     {
        super(1.2f);                         // in abstract method parent class con must be calling in child class con (not in methods )
     }
     @Override
       float add(float a,float b)
    {
        System.err.println("add value a : "+a);
        System.err.println("add value b : "+b);
        return a+b;
    }
} 
public class ConAbstract
{
     public static void main(String[] args) {
        Con obj=new Con();
        System.err.println(obj.add(1.2f,4.5f));
        System.err.println(obj.sub(9,3));
    }
}