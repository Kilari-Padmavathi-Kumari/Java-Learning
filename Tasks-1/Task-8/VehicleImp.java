class Bike implements Vehicle
{
    @Override
    public void vehicle()
    {
        System.err.println("i am vehicle bike");
    }

}
class Car implements Vehicle
{
    @Override
   public void vehicle()
    {
        System.err.println("i am vehicle car");
    }
}
public class VehicleImp
{
    public static void main(String[] args) {
        Bike b=new Bike();
        b.vehicle();
        Car c=new Car();
        c.vehicle();

    }
}