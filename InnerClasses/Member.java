/*class Member
{
    int a=10;
    float method(float a)
    {
        System.err.println("method a val :"+a);
        return a;
    }
    class Inner
    {
        int method1(int a)
        {
            System.err.println("method1 a val : "+a);
            return a;
        }
    }
    public static void main(String[] args) {
        { 
            Member obj=new Member();
            System.err.println("instance val a : "+obj.a);
            System.err.println(obj.method(1.2f));
            Member.Inner obj1=obj.new Inner();
            System.err.println(obj1.method1(2));
        }
    }
}*/


class Member
{
    int a=10;
    float method(float a)
    {
        System.err.println("method a val :"+a);
        return a;
    }                                                                  // cls inside another cls also called non static property
    class Inner
    {
        int method1(int a)
        {
            System.err.println("method1 a val : "+a);
            return a;
        }
    }
    public static void main(String[] args) {
        { 
            Member obj=new Member();
            System.err.println("instance val a : "+obj.a);
            System.err.println(obj.method(1.2f));
            Inner obj1=obj.new Inner();
            System.err.println(obj1.method1(2));
        }
    }
}