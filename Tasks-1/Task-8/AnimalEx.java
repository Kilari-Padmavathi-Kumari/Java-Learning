abstract class Animal
{
    abstract void sound();
} 
class Dog extends Animal
{
    @Override
      void sound()
      {
        System.err.println("i am dog class");
      }
}
class Cat extends Animal
{
    @Override
    void sound()
    {
        System.err.println("i am cat class");
    }
}
public class AnimalEx
{
    public static void main(String[] args) {
        Animal d=new Dog();
        d.sound();
        Animal c=new Cat();
        c.sound();

    }
}