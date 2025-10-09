class Main
{
    String name;
    int speed;
    void car()
    {
        System.err.println("start the car");
    }
}
public class ClassObj
{
    public static void main(String[] args) {
        Main obj=new Main();
        obj.name="hero";
        obj.speed=100;
        System.err.println(obj.name);
        System.err.println(obj.speed);
        obj.car();
    }
}