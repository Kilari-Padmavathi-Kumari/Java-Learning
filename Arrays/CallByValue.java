/*import java.util.*;
public class CallByValue
{
    void changeValue(int a)    //formal argument
    {
        a=a+100;
        System.err.println("method value"+a);
    }
    public static void main(String[] args) {
        CallByValue obj=new CallByValue();
        int a=20;
        System.err.println("before change"+a);
        obj.changeValue(a);    //actual argument
        System.err.println("after change"+a);
    }
}*/


public class CallByValue
{
    static void callValue(int a)
    {
       a=a+10;
       System.err.println("method :"+a);
    }
    public static void main(String[] args) {
        CallByValue obj=new CallByValue();
        int a=10;
        System.err.println("before modify :"+a);
        callValue(a);
        System.err.println("after modify :"+a);
    }
}