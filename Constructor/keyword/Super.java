
/*class A
{
    int a=10;
    int m1(float a)
    {
        System.err.println("hello m1");
        System.err.println(this.a);
        System.err.println(a);
        return (int)a;
    }
}                                                                    //using variable and methods
class Super extends A
{
    float a=4;
    int m2(float a)
    {
        System.err.println("hello m2");
        System.err.println(this.a);
        System.err.println(a);
        System.err.println(super.a);
        System.err.println(super.m1(5));
        return (int)a;
    }
    public static void main(String[] args) {
        Super obj=new Super();
        System.err.println(obj.m2(3));
    }
}*/





class A
{
    int a=10;
    A()
    {
        System.err.println("hello A con");
    }
    int m1(float a)
    {
        System.err.println("hello m1");
        System.err.println(this.a);
        System.err.println(a);
        return (int)a;
    }
}
class Super extends A
{
    float a=4;
    Super()
    {
        super();
        System.err.println("hello super con");
    }
    int m2(float a)
    {
        System.err.println("hello m2");
        System.err.println(this.a);
        System.err.println(a);
        System.err.println(super.a);
        System.err.println(super.m1(5));
        return (int)a;
    }
    public static void main(String[] args) {
        Super obj=new Super();
        System.err.println(obj.m2(3));
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }
}

