/*class Test
{
    int num;
}

public class CallByReference
{
    static void changeReference(Test t)
    {
        t.num=100;
        System.err.println(t.num);
    }
    public static void main(String[] args) {
        Test obj=new Test();
        obj.num=50;
        System.err.println("before :"+obj.num);
        changeReference(obj);
        System.err.println("after :"+obj.num);
    }
}*/


public class CallByReference
{
    int x=100;
    void callReference(CallByReference a)                    // CallByReference is class a act like obj  (CallByRefence a=new CallByrefence(); )
    {
        x=x+100;
        System.err.println("method :"+x);
    }
    public static void main(String[] args) {
        CallByReference obj=new CallByReference();
        System.err.println("before passing val:"+obj.x);
        obj.callReference(obj);
        System.err.println("after passing val:"+obj.x);
    }

}