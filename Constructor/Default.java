/*class Default
{

    public Default()
    {
       System.err.println("hello default con");
    }
    public static void main(String[] args) {
        
        Default obj=new Default();
    
    }
}*/


/*class Student {
    String name;
    int age;
}

public class Default {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);                                  //default value null
        System.out.println(s.age);                                   //default value 0
    }
}*/



class A
{
   static int age;
    String name;
    A()
    {
        System.err.println("i am con");
    }
}

public class Default
{
    public static void main(String[] args) {
        A.age=23;
        System.out.println(A.age);                                                    //static variable calling ,another class using class name.
    A obj=new A();
   
    obj.name="josh";
    
    System.out.println(obj.name);
  }
}


/*class Car {
    String color;
    int speed;

    // Constructor
    Car() {
        color = "Red";
        speed = 100;
        System.out.println("Car object created");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car(); // Constructor is called automatically
        System.out.println(c.color);
        System.out.println(c.speed);
    }
}*/





