public class CallByValue
{
    static int a=10;
    static void callValue(int a)
    {
          a+=20;                                                 //without using obj
          System.err.println(a);
    }
    public static void main(String[] args) {
        System.err.println("before method call :"+ a);
        callValue(a);
        System.err.println("after method call :"+a);
    }
}


/*public class CallByValue
{
     int a=10;
    void callValue(int a)
    {
          a+=20;
    }                                                                // object creation
    public static void main(String[] args) {
        CallByValue obj=new CallByValue();
        System.err.println("before method call :"+ obj.a);
        obj.callValue(obj.a);
        System.err.println("after method call :"+ obj.a);
    }
}*/