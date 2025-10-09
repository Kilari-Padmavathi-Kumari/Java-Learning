


/*class This
{
    int a=10;
    short m1(float a)
    {
        System.err.println(this.a);                      //calling variable
        System.err.println(a);                           //con callin inside another con musty be declare first line
        return (short)a;
    } 
    public static void main(String[] args) {
        This obj=new This();
        obj.m1(4);
    }
}*/

/*class This
{
    
    int a=10;
    long m1(int a)
    {
        System.err.println("hello m1");
        System.err.println(this.a);
        System.err.println(a);
        return (long)a;
    }
    int m2(float a)
    {
        System.err.println("hello m2");
        System.err.println(this.m1(2));                         //using this calling methods
        System.err.println(this.a);
        System.err.println(a);
        return (int)a;
    }
    public static void main(String[] args) {
        This obj=new This();
        System.err.println(obj.m2(6));
    }
}*/

class This
{
    int a=10;
    This()
    {
        System.err.println("hello con");
        System.err.println(this.a);
    }
    int m1(float a)
    {
        System.err.println("hello method");
        System.err.println(this.a);
        System.err.println(a);
        return (int)a;
    }
    public static void main(String[] args) {
        This obj=new This();
        System.err.println(obj.m1(3));
        
    }
}