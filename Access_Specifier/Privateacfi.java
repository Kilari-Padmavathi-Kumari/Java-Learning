/*class Privateacfi {
    private int x = 20;

    private void show() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Privateacfi obj=new Privateacfi();
        System.err.println(obj.x);
        obj.show();
    }
}*/


public class Privateacfi
{
     int a=10;  //public accefier
    private void show()
    {
        float b=20;   //private accefier
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Privateacfi obj=new Privateacfi();
        System.out.println(obj.a);
        //System.err.println(obj.b);     //error occur because private varible no access outside of the class
        obj.show();
    }
}
