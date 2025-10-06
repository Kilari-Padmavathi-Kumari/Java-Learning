class Test
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
}