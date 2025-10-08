/*public class FinalKeyword
{
    final static int a=10;                                     //final variable
    public static void main(String[] args) {
        //a=12;                                               //  final variable value cannot change
        System.err.println(a);
    }
}

    //In final keyword using(variables -> cannot value cannot change
    //methods -> cannot override
    //classe ->  cannot inherit the final class

*/
final class Vehicle {
    final int speed = 100;

    final void display() {
        System.out.println("Speed is " + speed);
        System.err.println("hello final method");
    }
}

/*class Car extends Vehicle { 
    // cannot inherit final class
    // void display()   // cannot override final method
}*/

public class FinalKeyword {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        // v.speed = 120; //cannot assign a value to final variable
        v.display();
    }
}
