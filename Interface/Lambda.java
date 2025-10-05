/*interface I
{
    void m1(int a);
}
public class Lambda
{
    public static void main(String[] args) {
        I obj=(a) ->{ 
            System.err.println("hello");
            //System.err.println(a);
        };
        obj.m1(2);
    }
}*/


/*interface I
{
    void m1(int a);
}
abstract  class Lambda implements I
{
    public static void main(String[] args) {
        I obj=(a) ->{ 
            System.err.println("hello");
            //System.err.println(a);
        };
        obj.m1(2);
    }
}*/






interface I 
{
    abstract int m1(int a,int b);
}
@SuppressWarnings("unused")
class Lambda
{
    public static void main(String[] args) {
        I obj= (a,b) -> a+b;
        System.err.println("hello lambda");
        System.err.println(obj.m1(2,3));
    }
}
