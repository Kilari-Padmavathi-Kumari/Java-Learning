class animal
{
    void Dog()
    {
        System.out.println("Dog is pet animal");
    }
}
public class Is extends animal                  //is-a relationship act like extends in inheritance  
{                                                       //in interface we use implementation
void parrot()
{
    System.out.println("Bird fly");
}
public static void main(String[] args) {
    Is i=new Is();
    i.Dog();
    i.parrot();
}
}