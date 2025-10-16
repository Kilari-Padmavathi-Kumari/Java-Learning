class Employee
{
    Employee()
    {
        System.err.println("I am Employee");
    }
}
class Developer extends Employee
{
     Developer() 
    {
        super();                    //Employee class con calling
        System.err.println("I am Developer");
    }
    

}
public class SuperCon
{
 public static void main(String[] args) {
    new Developer();
 }
}