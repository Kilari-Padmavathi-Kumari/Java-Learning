

class Engine {
    void start() {
        System.out.println("Engine starts...");
    }
}

class Car {
    private Engine engine; // Car HAS-A Engine

    public Car() {
        engine = new Engine(); // Composition or obj creation     
    }                                          

    void startCar() {
        engine.start();
        System.out.println("Car is running...");
    }
}

public class Has{
    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
    }
}

//two types Has-A
// composition Has-A (strong) child obj cannot exit without the parent obj
                  //parent owns the child,PARENT DISTROYED the child also distroyed

//child obj can exit indepent of the parent
  // parent just uses or reference the child,but doesn't own it
    //parent distroyed,child may still exit.

