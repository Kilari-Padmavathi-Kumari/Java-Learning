class Static
{
    int a=10;
    float method(float a)
    {
        System.err.println("method a val :"+a);
        return a;
    }
    static class Inner
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
            Inner obj1=new Static.Inner();
            System.err.println(obj1.method1(2));
        }
    }
}




